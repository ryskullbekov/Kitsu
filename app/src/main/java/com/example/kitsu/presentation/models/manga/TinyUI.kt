package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.TinyModel

data class TinyUI(
    val width: Int?,
    val height: Int?
)

fun TinyModel.toUI() = TinyUI(width, height)
