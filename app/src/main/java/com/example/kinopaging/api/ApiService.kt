package com.example.kinopaging.api

import com.example.kinopaging.model.ResponseApi
import com.example.kinopaging.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getAllCharacters(
        @Query("page") page: Int
    ): Response<ResponseApi>
}