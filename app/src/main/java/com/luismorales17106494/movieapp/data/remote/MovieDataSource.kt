package com.luismorales17106494.movieapp.data.remote

import com.luismorales17106494.movieapp.data.model.MovieList

class MovieDataSource {

    fun getUpComingMovies():MovieList{
        return MovieList()
    }
    fun getTopRatedMovies():MovieList{
        return MovieList()
    }
    fun getPopularMovies():MovieList{
        return MovieList()
    }
}