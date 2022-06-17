package com.example.rest_api package com.example.rest_api

import com.example.rest_api.model.User
import retrofit2.http.GET
import retrofit2.Call

interface Inter {
    @GET(value = "posts")
    getData():Call<List<User>>
}