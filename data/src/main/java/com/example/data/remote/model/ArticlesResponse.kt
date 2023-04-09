package com.example.data.remote.model

data class ArticlesResponse(
    override val status: State,
    override val message: String,
    val articles: List<Article> = emptyList()
) : BaseResponse

data class ArticleResponse(
    override val status: State,
    override val message: String,
    val article: Article? = null
) : BaseResponse
