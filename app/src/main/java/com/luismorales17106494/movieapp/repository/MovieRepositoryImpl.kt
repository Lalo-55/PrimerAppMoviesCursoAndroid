package com.luismorales17106494.movieapp.repository

import com.luismorales17106494.movieapp.data.model.MovieList
import com.luismorales17106494.movieapp.data.remote.MovieDataSource

class MovieRepositoryImpl(private val dataSource: MovieDataSource) : MovieRepository {


    override suspend fun getUpComingMovies(): MovieList {
        return dataSource.getUpComingMovies()
    }
    override suspend fun getTopRatedMovies(): MovieList = dataSource.getTopRatedMovies()
    override suspend fun getPopularMovies(): MovieList = dataSource.getPopularMovies()
}