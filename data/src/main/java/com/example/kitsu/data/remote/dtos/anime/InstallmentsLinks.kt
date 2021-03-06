package com.example.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.anime.LinksXXXXModel

data class LinksXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXX.toDomain() = LinksXXXXModel(
    self, related
)