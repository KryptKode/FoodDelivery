package com.kryptkode.shopping.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Showcase(
    val title: String,
    val subtitle: String,
) : Parcelable
