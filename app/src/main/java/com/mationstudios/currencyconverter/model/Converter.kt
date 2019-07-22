package com.mationstudios.currencyconverter.model
data class Converter(
    val success:Boolean,
    val date:String,
    val result:String,
    val info: Info,
    val query: Query

)
