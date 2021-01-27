package com.kryptkode.shopping.mock

import com.kryptkode.commonandroid.assets.AssetsLoader
import com.kryptkode.shopping.model.Food
import com.squareup.moshi.Moshi
import javax.inject.Inject

class MockDataProvider @Inject constructor(
    moshi: Moshi,
    private val assetsLoader: AssetsLoader,
) {
    private val adapter = moshi.adapter(FoodData::class.java)

    fun getPizzas(): List<Food> {
        return adapter.fromJson(
            assetsLoader.getAssetDataAsString("pizza.json")!!
        )!!.data
    }

}
