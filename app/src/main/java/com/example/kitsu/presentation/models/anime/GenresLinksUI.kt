package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.LinksXModel



data class LinksXUI(
    val self: String,
    val related: String
)

fun LinksXModel.toUI() = LinksXUI(self, related)
