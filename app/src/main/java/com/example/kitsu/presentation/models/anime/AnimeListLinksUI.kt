package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.LinksXXXXXXXXXXXXXModel


data class LinksXXXXXXXXXXXXXUI(
    val first: String,
    val prev: String?,
    val next: String,
    val last: String
)

fun LinksXXXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXXXUI(first, prev, next, last)
