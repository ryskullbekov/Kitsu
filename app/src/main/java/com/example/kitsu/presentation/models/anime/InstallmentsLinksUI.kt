package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.LinksXXXXModel



data class LinksXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXModel.toUI() = LinksXXXXUI(self, related)
