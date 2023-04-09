package com.example.data.remote.api

import com.example.data.remote.Constant.API_TOKEN

interface CoffeeTimeNewsService {
    @Headers(API_TOKEN)
    @GET("/article/{category}")
    suspend fun getArticlesByCategory(
        @Path("category") category: String
    ): Response<ArticlesResponse>

    @Headers(API_TOKEN)
    @GET("/article/detail/{id}")
    suspend fun getArticleByIdFromApi(
        @Path("id") id: String
    ): Response<ArticleResponse>
}