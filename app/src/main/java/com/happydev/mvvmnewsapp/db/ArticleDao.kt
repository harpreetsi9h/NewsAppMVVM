package com.happydev.mvvmnewsapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.happydev.mvvmnewsapp.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createArticle(article: Article): Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun removeArticle(article: Article)
}