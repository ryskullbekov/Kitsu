package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.SmallModel


data class SmallUI(
    val width: Int?,
    val height: Int?
)

fun SmallModel.toUI() = SmallUI(width, height)
