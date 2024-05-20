package com.example.dopaminemoa.mapper.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class VideoItemModel(
    @SerializedName("id") val videoId: String,
    val videoTitle: String,
    val videoThumbnail: String,
    val videoViews: String, // 나중에 추가
    val videoDescription: String,
    val channelTitle: String,
    val channelThumbnails: String, // 나중에 추가
    val category: String,
    val channelId: String,
    var isLiked: Boolean,
) : Parcelable