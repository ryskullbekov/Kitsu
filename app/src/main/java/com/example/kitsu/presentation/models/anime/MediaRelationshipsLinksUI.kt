package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.LinksXXXXXXXModel


data class LinksXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXModel.toUI() = LinksXXXXXXXUI(self, related)