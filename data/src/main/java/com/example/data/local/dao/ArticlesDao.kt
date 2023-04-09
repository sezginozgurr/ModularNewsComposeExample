package com.example.data.local.dao

@Dao
interface ArticlesDao {
    @Query("SELECT * FROM articles WHERE id = :id")
    fun getArticleById(id: String): Flow<ArticleEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addArticle(articles: List<ArticleEntity>)
}