package com.mationstudios.currencyconverter.network

import com.mationstudios.currencyconverter.model.Converter
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ConvertionApi {

    @FormUrlEncoded
    @POST("/convert")
    suspend  fun convert(@Field("from") from:String,@Field("to")to:String,@Field("amount")amount:String):Converter
}