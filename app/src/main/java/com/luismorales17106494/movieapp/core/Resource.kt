package com.luismorales17106494.movieapp.core

import java.lang.Exception

sealed class Resource<T> {
    class Loading<T> : Resource<T>()
    data class Success<T>(val data:T):Resource<T>()
    data class Failure(val exception: Exception):Resource<Nothing>()
}