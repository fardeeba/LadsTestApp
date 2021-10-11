package com.example.ladstestapp.api

import com.example.ladstestapp.pojos.ProductResponse
import com.example.ladstestapp.pojos.ResponseOfTokenRequest
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*

interface APICallBack {

    @POST("api/v1/user/login")
    fun getBearerToken(@Body param : JsonObject) : Call<ResponseOfTokenRequest>

    @GET("api/market/admin/products/")
    fun getProductInventory(
        @Header("Authorization") authToken : String,
        @Query("pageNumber") pageNumber : Int,
        @Query("recordsPerPage") recordsPerPage : Int,
        @Query("thirdPartyUid") thirdPartyUid : String
    ) : Call<ProductResponse>


}