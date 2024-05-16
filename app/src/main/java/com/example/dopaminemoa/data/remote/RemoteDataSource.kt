package com.example.dopaminemoa.data.remote

import com.example.dopaminemoa.API_KEY
import com.example.dopaminemoa.data.eachResponse.ChannelListResponse
import com.example.dopaminemoa.data.eachResponse.SearchListResponse
import com.example.dopaminemoa.data.eachResponse.VideoCategoryListResponse
import com.example.dopaminemoa.data.eachResponse.VideoListResponse
import retrofit2.http.GET
import retrofit2.http.HTTP
import retrofit2.http.Query

interface RemoteDataSource {
    //search
    @GET("search")
    suspend fun getSearchList(
        @Query("part") part: String = "snippet",
        @Query("q") query: String,
        @Query("type") type: String = "video",
        @Query("key") key: String = API_KEY,
//        @Query("maxResults") maxResults: Int = 10,
        ): SearchListResponse

    //videos
    @GET("videos")
    suspend fun getVideosList(
        @Query("part") part: String = "snippet",
        @Query("chart") chart: String = "mostPopular",
        @Query("key") key: String = API_KEY,
        @Query("regionCode") regionCode: String = "KR",
        @Query("maxResults") maxResults: Int = 1,
        @Query("videoCategoryId") videoCategoryId: String = "0",
    ): VideoListResponse


    //videoCategories
    @GET("videoCategories")
    suspend fun getVideoCategoriesList(
        @Query("part") part: String = "snippet",
        @Query("regionCode") regionCode: String = "KR",
        @Query("key") key: String = API_KEY,
        //추가
    ): VideoCategoryListResponse

    //channels
    @GET("channels")
    suspend fun getChannelsList(
        @Query("part") part: String = "snippet",
        @Query("id") channelId: String,
        @Query("key") key: String = API_KEY,
    ): ChannelListResponse
}