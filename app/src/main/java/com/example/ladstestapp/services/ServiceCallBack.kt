package com.example.ladstestapp.services

interface ServiceCallBack<T> {
    fun onSuccess(responseCode: Int, responseMessage: String, responseBody: T?)

    fun onFailed(errorData: ServiceError)
}