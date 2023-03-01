package com.example.homework47.data.models.anime

import com.google.gson.annotations.SerializedName

data class PosterImage(
    @SerializedName("original")
    val original: String = "",
)