package com.luismorales17106494.movieapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.luismorales17106494.movieapp.core.Resource
import com.luismorales17106494.movieapp.repository.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlin.Exception


class MovieViewModel(private val repo: MovieRepository): ViewModel(){

    fun fetchUpcomingMovies() = liveData(Dispatchers.IO){
        emit(Resource.Loading())

        try {
            emit(Resource.Success(repo.getUpComingMovies()))
        }catch (e: Exception){
            emit(Resource.Failure(e))
        }

    }


}
class MovieViewModelFactory(private val repo: MovieRepository): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(MovieRepository::class.java).newInstance(repo)
    }
}