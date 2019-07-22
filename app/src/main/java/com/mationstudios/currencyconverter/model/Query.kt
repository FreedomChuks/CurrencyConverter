package com.mationstudios.currencyconverter.model

data class Query(
    val from:String,
    val to:String,
    val amount:String
)