package com.mationstudios.currencyconverter.network

import com.google.gson.GsonBuilder
import com.mationstudios.currencyconverter.util.Global_Constant
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.coroutines.CoroutineContext


class RetrofitClient {

   // implementing singleton by using kotlin lazy implementation

    val convertionApi by lazy {
        Retrofit.Builder()
            .baseUrl(Global_Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(ConvertionApi::class.java)
    }
}