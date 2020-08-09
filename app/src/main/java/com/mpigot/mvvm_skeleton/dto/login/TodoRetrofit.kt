package com.mpigot.mvvm_skeleton.dto.login

import retrofit2.http.GET
import retrofit2.http.Path

interface TodoRetrofit {
    @GET("user/{id}")
    suspend fun getTodo(@Path(value = "id") todoData: Int): TodoData
}