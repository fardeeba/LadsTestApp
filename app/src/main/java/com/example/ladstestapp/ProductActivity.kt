package com.example.ladstestapp

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ladstestapp.pojos.ResponseOfTokenRequest
import com.example.ladstestapp.services.MerchantService
import com.example.ladstestapp.services.ServiceCallBack
import com.example.ladstestapp.services.ServiceError
import com.google.gson.JsonObject

class ProductActivity : AppCompatActivity() {

    var bearerToken: String? = null

    private val sharedPreferences: SharedPreferences? = null
    val preference_name = "userSession"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)


        val params = JsonObject()
        params.addProperty("userName","marketplace@martcart.pk")
        params.addProperty("password","12345")

        MerchantService.getInstance().getBearerToken(
            params,
            this,
            object : ServiceCallBack<ResponseOfTokenRequest>
            {
                override fun onSuccess(
                    responseCode: Int,
                    responseMessage: String,
                    responseBody: ResponseOfTokenRequest?
                ) {
                    responseBody.let {
                        bearerToken = it!!.token
                        Log.d("Token", bearerToken!!)
                    }
                }

                override fun onFailed(errorData: ServiceError) {
                    Toast.makeText(this@ProductActivity,"Failed to get Token",Toast.LENGTH_SHORT).show()
                }

            })
    }
}