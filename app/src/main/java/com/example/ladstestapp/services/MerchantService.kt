package com.example.ladstestapp.services

import android.content.Context
import com.example.ladstestapp.api.APICallBack
import com.example.ladstestapp.api.APIService
import com.example.ladstestapp.pojos.ProductResponse
import com.example.ladstestapp.pojos.ResponseOfTokenRequest
import com.google.gson.JsonObject

class MerchantService {

    private val apiCallBack: APICallBack = APIService.getInstance().getApiCallBack()

    companion object {

        private var instance: MerchantService? = null

        fun getInstance(): MerchantService {
            if (instance == null) {
                instance = MerchantService()
            }
            return instance as MerchantService
        }
    }

    fun getBearerToken(
        jsonObject: JsonObject,
        context: Context,
        serviceCallBack: ServiceCallBack<ResponseOfTokenRequest>
    ) {
        val call = this.apiCallBack.getBearerToken(jsonObject)
        ResponseHandler.getInstance().handleResponse(call, context, serviceCallBack)
    }

    fun getProductInventory(
        authToken : String,
        pageNumber : Int,
        recordsPerPage : Int,
        thirdPartyUid : String,
        context: Context,
        serviceCallBack: ServiceCallBack<ProductResponse>
    ) {
        val call = this.apiCallBack.getProductInventory(authToken,pageNumber,recordsPerPage,thirdPartyUid)
        ResponseHandler.getInstance().handleResponse(call,context,serviceCallBack)
    }
}