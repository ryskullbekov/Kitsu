package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.LinksModel



data class LinksUI(
    val self: String
)

fun LinksModel.toUI() = LinksUI(
    self
)
