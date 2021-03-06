package com.kryptkode.shopping.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Food(
    val id: String,
    val name: String,
    val description: String,
    val image: String,
    val weight: String,
    val type: String,
    val quantity: String,
    val size: String,
    val price: String,
    val currency: String,
    val tags: List<String>
) : Parcelable
