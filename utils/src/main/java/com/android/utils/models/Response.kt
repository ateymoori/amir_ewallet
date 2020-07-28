package com.android.utils.models

sealed class Response<out T>

data class Success<T>(val data: T?) : Response<T>()
data class Loading(val isLoading: Boolean, val msg: String? = null) : Response<Nothing>()
data class ErrorIn(val message: String? = null, val cause: Exception? = null) : Response<Nothing>()