package com.example.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.manga.ChaptersModel

data class Chapters(
    @SerializedName("links")
    val links: LinksXXXXXXXX
)

fun Chapters.toDomain() = ChaptersModel(
    links.toDomain()
)