package com.kryptkode.shopping.ui.list

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.airbnb.mvrx.MavericksView
import com.airbnb.mvrx.fragmentViewModel
import com.airbnb.mvrx.withState
import com.kryptkode.commonandroid.viewbinding.viewBinding
import com.kryptkode.core.imageloader.ImageLoader
import com.kryptkode.feature.users.R
import com.kryptkode.feature.users.databinding.LayoutShoppingBinding
import org.koin.android.ext.android.inject

class ShoppingListFragment : Fragment(R.layout.layout_shopping), MavericksView {

    private val viewModel: ShoppingListViewModel by fragmentViewModel()
    private val imageLoader : ImageLoader by inject()
    private val binding by viewBinding(LayoutShoppingBinding::bind)

    private val sliderAdapter = ShoppingSliderAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.slider.viewPager.adapter = sliderAdapter

        binding.slider.viewPager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                val x = ((binding.slider.viewPager.width * position + positionOffsetPixels) * computeFactor()).toInt()
                binding.slider.scrollView.scrollTo(x, 0)
            }
            override fun onPageSelected(position: Int) {
                binding.slider.indicatorView.setSelected(position)
            }
        })
    }

    private fun computeFactor(): Float {
        return (binding.slider.background.width - binding.slider.viewPager.width) /
            (binding.slider.viewPager.width * (binding.slider.viewPager.adapter!!.itemCount - 1)).toFloat()
    }

    override fun invalidate() = withState(viewModel){
        sliderAdapter.submitList(it.showCase)
        binding.slider.indicatorView.count = it.showCase.size
        imageLoader.load(it.showCaseBackground, binding.slider.background, R.drawable.cokkee)
    }

}
