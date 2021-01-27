package com.kryptkode.core.di

import com.kryptkode.commonandroid.assets.AssetsLoader
import com.kryptkode.core.BuildConfig
import com.kryptkode.core.cache.AppDatabase
import com.kryptkode.core.dispatchers.AppDispatchers
import com.kryptkode.core.dispatchers.AppDispatchersImpl
import com.kryptkode.core.imageloader.ImageLoader
import com.kryptkode.core.imageloader.ImageLoaderImpl
import com.kryptkode.core.remote.api.SwahPeeServiceApiFactory
import com.squareup.moshi.Moshi
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val coreModule = module {
    single { AppDatabase.getInstance(androidContext()) }
    single { get<AppDatabase>().charactersDao() }
    single<AppDispatchers> { AppDispatchersImpl() }
    single<ImageLoader> { ImageLoaderImpl(androidContext()) }
    single { Moshi.Builder().build() }
    single { AssetsLoader(androidContext()) }
    single { SwahPeeServiceApiFactory.makeSwahPeeService(get(), BuildConfig.DEBUG) }
}
