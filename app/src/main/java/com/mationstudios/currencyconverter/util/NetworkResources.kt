package com.mationstudios.currencyconverter.util

class NetworkResources<T> constructor(val status:NetworkStatus, val data:T, val message:String?){

    enum class NetworkStatus {
        SUCCESS,ERROR,LOADING
    }

    companion object{
        fun<T> success(data:T):NetworkResources<T>{
            return NetworkResources(NetworkStatus.SUCCESS,data,null)
        }

        fun <T> loading(data:T):NetworkResources<T>{
            return NetworkResources(NetworkStatus.LOADING,data,null)
        }

        fun <T> error (data: T,message:String):NetworkResources<T>{
            return NetworkResources(NetworkStatus.ERROR,data,message)
        }
    }
}

