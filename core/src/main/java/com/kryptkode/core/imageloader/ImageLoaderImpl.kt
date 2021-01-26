package com.kryptkode.core.imageloader

import android.content.Context
import android.widget.ImageView
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

class ImageLoaderImpl @Inject constructor(
    @ActivityContext private val context: Context
) : ImageLoader {

    override fun load(
        imageSource: String,
        target: ImageView,
        errorResId: Int
    ) {
        GlideApp.with(context)
            .load(imageSource)
            .error(errorResId)
            .into(target)
    }
}
