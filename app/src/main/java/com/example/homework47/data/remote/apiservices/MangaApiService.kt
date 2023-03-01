package com.example.homework47.data.remote.apiservices

import com.example.homework47.data.models.anime.DataItem
import com.example.homework47.data.models.anime.Response
import com.example.homework47.data.models.anime.detail.MangaDetail
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MangaApiService {

    @GET("edge/manga")
    suspend fun fetchManga(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int
    ): Response<DataItem>

    @GET("edge/manga/{id}")
    suspend fun fetchMangaDetail(
        @Path("id") id: Int
    ): MangaDetail
}