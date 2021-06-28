package com.happydev.mvvmnewsapp.models

import com.happydev.mvvmnewsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)