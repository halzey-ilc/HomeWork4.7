package com.example.homework47.data.repositories

import com.example.homework47.base.BaseRepository
import com.example.homework47.data.models.auth.AuthModel
import com.example.homework47.data.remote.apiservices.SignInApiService
import javax.inject.Inject

class PostUserDataRepository @Inject constructor(
    private val apiService: SignInApiService
): BaseRepository() {
    fun postUserData(authModel: AuthModel) = doRequest {
        apiService.postAuthDataUser(authModel)
    }
}