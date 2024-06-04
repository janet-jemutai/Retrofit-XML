package com.jemutai.retrofitxml.data

import retrofit2.Response
import retrofit2.http.POST

interface ApiService {

 @POST("user")

 suspend fun  createUser(user:User):Response<User>

}