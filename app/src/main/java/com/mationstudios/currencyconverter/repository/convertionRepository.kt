package com.mationstudios.currencyconverter.repository

import com.mationstudios.currencyconverter.network.ConvertionApi
import com.mationstudios.currencyconverter.network.RetrofitClient

class convertionRepository{

    val client:ConvertionApi=RetrofitClient().convertionApi

    fun getConvertion(from:String,to:String,amount:String) {
    }

}