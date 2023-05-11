package com.lineupkita.app.ui.artisfavorite

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import com.lineupkita.app.R
import com.lineupkita.app.data.remote.dummy.FestivalModel
import com.lineupkita.app.data.remote.dummy.Filter
import com.lineupkita.app.data.remote.dummy.LineupModel
import com.lineupkita.app.databinding.FragmanetProfileBinding
import com.lineupkita.app.databinding.FragmentArtistFavoriteBinding
import com.lineupkita.app.databinding.FragmentDetailFestivalBinding
import com.lineupkita.app.databinding.FragmentHomeBinding
import com.lineupkita.app.ui.home.adapter.HomeAdapter
import com.lineupkita.app.ui.main.MainFragment.Companion.parentBottomAppBar
//import com.arysugiarto.attendence.ui.main.MainFragment.Companion.parentBottomAppBar
import com.lineupkita.app.ui.main.MainFragment.Companion.parentNavigation
import com.lineupkita.app.util.*
import com.lineupkita.app.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ArtisFavoriteFragment : Fragment(R.layout.fragment_artist_favorite) {

    private val binding by viewBinding<FragmentArtistFavoriteBinding>()
    private val viewModel by hiltNavGraphViewModels<HomeViewModel>(R.id.profile)

    private var lineupAdapter = HomeAdapter.lineupAdapter

    private var listLineup = emptyList<LineupModel>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        initViewModel()
        initCallback()
        initViewModelCallback()
        initOnClick()
//        parentBottomAppBar?.isVisible = false
//        parentNavigation?.isVisible = false


    }

    private fun listStaticData() {
        listLineup = listOf(
            LineupModel(
                1,
                "LANY",
                "America",
                "https://i.pinimg.com/564x/8c/d3/79/8cd379feb761b6411014b178e7061a97.jpg"

            ),
            LineupModel(
                2,
                "LANY",
                "America",
                "https://i.pinimg.com/564x/8c/d3/79/8cd379feb761b6411014b178e7061a97.jpg"
            ),
            LineupModel(
                3,
                "LANY",
                "America",
                "https://i.pinimg.com/564x/8c/d3/79/8cd379feb761b6411014b178e7061a97.jpg"
            ),
        )

    }

    private fun initView(){
        listStaticData()
        lineupAdapter.items = listLineup
        binding.rvFav.adapter = lineupAdapter

    }


    private fun initViewModel() {

    }

    private fun initViewModelCallback() {

    }

    private fun initCallback() {

    }


    private fun initOnClick() {
        binding.apply {

        }
    }

    private val onClickCallback = View.OnClickListener { view ->
        when (view) {
        }

    }

}


