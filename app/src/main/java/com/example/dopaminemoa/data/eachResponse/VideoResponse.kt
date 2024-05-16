package com.example.dopaminemoa.data.eachResponse

import com.google.gson.annotations.SerializedName

data class VideoListResponse(
    @SerializedName("items") val items: List<VideoItems>,
)

data class VideoItems(
    @SerializedName("id") val id: String,
    @SerializedName("snippet") val snippet: VideoSnippet,
//    @SerializedName("contentDetails") val contentDetails: VideoContentDetails,
)

data class VideoSnippet(
    @SerializedName("title") val title: String, //제목
    @SerializedName("description") val description: String, //설명 (detail에서 필요)
    @SerializedName("thumbnails") val thumbnails: VideoThumbnails, //썸네일 todo 시도 1.standard 사용?
    @SerializedName("categoryId") val categoryId: String, //카테고리 int값
    @SerializedName("channelId") val channelId: String, //채널 아이디
)

data class VideoThumbnails(
    @SerializedName("standard") val standard: VideoThumbnail, //todo 시도1
)

data class VideoThumbnail(
    //썸네일 하위
    @SerializedName("url") val url: String, //이미지 url
    @SerializedName("width") val width: Int, //크기
    @SerializedName("height") val height: Int, //크기
)

//data class VideoContentDetails(
//    @SerializedName("duration") val duration: String //영상 시간 PT*M*S
//)