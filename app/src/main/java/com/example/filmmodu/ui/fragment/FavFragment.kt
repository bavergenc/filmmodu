package com.example.filmmodu.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.example.filmmodu.R
import com.example.filmmodu.adapter.RecyclerViewAdapter
import com.example.filmmodu.databinding.FragmentFavBinding
import com.example.filmmodu.databinding.FragmentHomeBinding
import com.example.filmmodu.databinding.MovieListItemBinding
import com.example.filmmodu.exstension.navigateSafe
import com.example.filmmodu.model.MovieModel
import com.example.filmmodu.service.data.Status
import com.example.filmmodu.viewmodel.HomeViewModel
import kotlinx.coroutines.launch


class FavFragment : Fragment() {


    private lateinit var binding: FragmentFavBinding
    private lateinit var itemBinding: MovieListItemBinding
    private val blankViewModel: HomeViewModel by viewModels()
    private val searchFragment = SearchFragment()
    lateinit var movieList:List<MovieModel>
    lateinit var homeRecyclerViewAdapter: RecyclerViewAdapter


    private val itemClick: (MovieModel) -> Unit =  {
            movieItem -> navigateSafe(R.id.action_homeFragment_to_movieDetailFragment, bundleOf("movie" to movieItem)
    )}



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFavBinding.inflate(layoutInflater)
        itemBinding = MovieListItemBinding.inflate(layoutInflater)
        val view =binding.root

        return view
    }





}