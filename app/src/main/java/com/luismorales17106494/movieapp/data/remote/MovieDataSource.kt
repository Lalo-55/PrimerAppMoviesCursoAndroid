package com.luismorales17106494.movieapp.data.remote

import com.luismorales17106494.movieapp.application.AppConstants
import com.luismorales17106494.movieapp.data.model.MovieList
import com.luismorales17106494.movieapp.repository.WebService

class MovieDataSource(private val webService: WebService) {

    suspend fun getUpComingMovies(): MovieList {
        return webService.getUpComingMovies(AppConstants.API_KEY)
    }

    suspend fun getTopRatedMovies(): MovieList = webService.getTopRatedMovies(AppConstants.API_KEY)
    suspend fun getPopularMovies(): MovieList = webService.getPopularMovies(AppConstants.API_KEY)
}