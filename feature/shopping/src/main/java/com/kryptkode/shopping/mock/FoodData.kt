package com.kryptkode.shopping.mock

import com.kryptkode.shopping.model.Food
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FoodData(
    @field:Json(name = "data")val data: List<Food>
)
