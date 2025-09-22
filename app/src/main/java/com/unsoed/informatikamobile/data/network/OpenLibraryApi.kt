package com.unsoed.informatikamobile.data.network

import com.unsoed.informatikamobile.data.model.SearchResponse
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenLibraryApi {
    @GET("search.json")
    suspend fun searchBooks(
        @Query("q") query: String,
        @Query("limit") limit: Int
    ): retrofit2.Response<SearchResponse>
}

// retrofit2.Response<SearchResponse>