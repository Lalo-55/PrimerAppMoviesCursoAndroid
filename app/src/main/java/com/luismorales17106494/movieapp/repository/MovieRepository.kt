package com.luismorales17106494.movieapp.repository

import com.luismorales17106494.movieapp.data.model.MovieList

interface MovieRepository {
    suspend fun getUpComingMovies(): MovieList
    suspend fun getTopRatedMovies(): MovieList
    suspend fun getPopularMovies(): MovieList
}