package com.kryptkode.shopping.di

import com.kryptkode.shopping.mock.MockDataProvider
import org.koin.dsl.module

val shoppingModule = module {
    single { MockDataProvider(get(), get()) }
}
