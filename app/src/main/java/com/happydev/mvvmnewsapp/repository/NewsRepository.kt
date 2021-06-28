package com.happydev.mvvmnewsapp.repository

import com.happydev.mvvmnewsapp.api.RetrofitInstance
import com.happydev.mvvmnewsapp.db.ArticleDatabase
import com.happydev.mvvmnewsapp.models.Article

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun createArticle(article: Article) = db.getArticleDao().createArticle(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun removeArticle(article: Article) = db.getArticleDao().removeArticle(article)
}