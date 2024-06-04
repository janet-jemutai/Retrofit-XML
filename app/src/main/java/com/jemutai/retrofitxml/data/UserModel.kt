package com.jemutai.retrofitxml.data

import com.squareup.moshi.Json

class User (
 @Json(name = "id")   val  id : Int,
 @Json(name = "name")   val name : String,
 @Json(name = "email")   val  email : String,
 @Json(name = "phone")   val  phone : String
)