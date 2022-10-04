package com.luismorales17106494.movieapp.ui.moviedatails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.luismorales17106494.movieapp.R
import com.luismorales17106494.movieapp.databinding.FragmentMovieDetailBinding


class MovieDetailFragment : Fragment(R.layout.fragment_movie_detail) {
    private lateinit var binding: FragmentMovieDetailBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieDetailBinding.bind(view)
    }
}