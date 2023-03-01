package com.example.homework47.data.remote.apiservices

import com.example.homework47.data.models.auth.AuthModel
import com.example.homework47.data.models.auth.TokenModel
import retrofit2.http.Body
import retrofit2.http.POST

interface SignInApiService {

    @POST("oauth/token")
    suspend fun postAuthDataUser(
        @Body authModel: AuthModel
    ): TokenModel
}
