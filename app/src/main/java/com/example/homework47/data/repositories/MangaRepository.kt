package com.example.homework47.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.homework47.base.BaseRepository
import com.example.homework47.data.remote.apiservices.MangaApiService
import com.example.homework47.data.remote.pagingsources.MangaPagingSource
import javax.inject.Inject

class MangaRepository @Inject constructor(private val mangaApiService: MangaApiService) : BaseRepository() {

    fun fetchManga() = Pager(
        PagingConfig(pageSize = 20, initialLoadSize = 10)
    ) {
        MangaPagingSource(mangaApiService)
    }.liveData

    fun fetchMangaDetail(id: Int) = doRequest {
        mangaApiService.fetchMangaDetail(id = id)
    }
}