package com.example.homework47.data.models.anime.detail

import com.example.homework47.data.models.anime.DataItem
import com.google.gson.annotations.SerializedName

data class MangaDetail(
    @SerializedName("data")
    val data: DataItem
)
