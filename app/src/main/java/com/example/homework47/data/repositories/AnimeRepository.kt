package com.example.homework47.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.homework47.base.BaseRepository
import com.example.homework47.data.remote.apiservices.AnimeApiService
import com.example.homework47.data.remote.pagingsources.AnimePagingSource
import javax.inject.Inject

class AnimeRepository @Inject constructor(private val service: AnimeApiService) : BaseRepository() {

    fun fetchAnime() = Pager(
        PagingConfig(pageSize = 20, initialLoadSize = 10)
    ) {
        AnimePagingSource(service)
    }.liveData


    fun fetchAnimeDetail(id: Int) = doRequest {
        service.fetchAnimeDetail(id = id)
    }
}