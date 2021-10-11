package com.example.ladstestapp.services

import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import com.example.ladstestapp.MainActivity
import com.example.ladstestapp.pojos.ResponseBean
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ResponseHandler {

    fun <T> handleResponse(call: Call<T>, context: Context, serviceCallBack: ServiceCallBack<T>) {
        call.enqueue(object : Callback<T> {
            override fun onResponse(call: Call<T>, response: Response<T>) {
                val message = response.message()
                if (response.code() == 401){
                    Toast.makeText(context,"Failed to get token", Toast.LENGTH_SHORT).show()
                    val intent = Intent(context, MainActivity::class.java)
                    context!!.startActivity(intent)
                }
                if (response.body() is ResponseBean) {
                    if ("INVALID".equals((response.body() as ResponseBean).message, ignoreCase = true)) {
                        serviceCallBack.onFailed(
                            ServiceError(
                                "" + response.code(),
                                (response.body() as ResponseBean).description
                            )
                        )
                        return
                    }
                }

                if (response.isSuccessful) {
                    try {
                        Log.d("name", "" + response.body())
                        serviceCallBack.onSuccess(
                            response.code(),
                            message, response.body()
                        )
                    } catch (e: Exception) {
                        e.printStackTrace()
                        serviceCallBack.onFailed(ServiceError("" + response.code(), "" + e.message))
                    }
                } else {
                    try {
                        val jsonObj = JSONObject(response.errorBody()!!.charStream().readText())
                        serviceCallBack.onFailed(
                            ServiceError(
                                "" + response.code(),
                                "" + jsonObj.getString("description")
                            )
                        )
                    } catch (e: Exception) {
                        e.printStackTrace()
                        serviceCallBack.onFailed(ServiceError("" + response.code(), "" + e.message))
                    }
                }
            }

            override fun onFailure(call: Call<T>, t: Throwable) {
                t.printStackTrace()
                serviceCallBack.onFailed(ServiceError(t.localizedMessage, t.message))
                Log.d("Error" + t.message, "" + t.localizedMessage)
            }
        })

    }

    companion object {
        private var instance: ResponseHandler? = null

        @Synchronized
        fun getInstance(): ResponseHandler {

            if (instance == null)
                instance = ResponseHandler()
            return instance as ResponseHandler
        }
    }
}