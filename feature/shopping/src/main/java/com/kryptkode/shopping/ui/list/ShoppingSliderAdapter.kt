package com.kryptkode.shopping.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kryptkode.feature.users.databinding.ItemSliderBinding
import com.kryptkode.shopping.model.Showcase


class ShoppingSliderAdapter
    : ListAdapter<Showcase, ShoppingSliderAdapter.ShoppingSliderViewHolder>(DIFF_UTIL) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingSliderViewHolder {
        return ShoppingSliderViewHolder(
            ItemSliderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ShoppingSliderViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ShoppingSliderViewHolder(private val binding: ItemSliderBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Showcase) {
            binding.titleTextView.text = item.title
            binding.subtitleTextView.text = item.subtitle
        }
    }

    companion object {
        val DIFF_UTIL = object : DiffUtil.ItemCallback<Showcase>() {
            override fun areContentsTheSame(oldItem: Showcase, newItem: Showcase): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: Showcase, newItem: Showcase): Boolean {
                return oldItem == newItem
            }
        }
    }
}
