package com.jemutai.retrofitxml.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitClient {

    private  const val  BASE_URL = "https://jsonplaceholder.typicode.com/"

    val  apiService : ApiService by lazy {
      Retrofit.Builder()
          .baseUrl(BASE_URL)
          .addConverterFactory(MoshiConverterFactory.create())
          .build()
          .create(ApiService::class.java)

    }
}