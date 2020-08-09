package com.mpigot.mvvm_skeleton.api

import com.mpigot.mvvm_skeleton.dto.login.LoginRetrofit
import com.mpigot.mvvm_skeleton.dto.login.TodoRetrofit
import com.mpigot.mvvm_skeleton.utils.AppConstant
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitFactory {

    lateinit var retrofit : Retrofit

    fun retrofitFactory() {
        retrofit = Retrofit.Builder()
            .baseUrl(AppConstant.WEBSERVICES_API_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    fun loginApi() {
        retrofit.create(LoginRetrofit::class.java)
    }

    fun todoApi() {
        retrofit.create(TodoRetrofit::class.java)
    }
}