package com.lineupkita.app.ui.home

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import com.lineupkita.app.R
import com.lineupkita.app.data.remote.dummy.FestivalModel
import com.lineupkita.app.data.remote.dummy.Filter
import com.lineupkita.app.databinding.FragmentHomeBinding
import com.lineupkita.app.ui.home.adapter.HomeAdapter
import com.lineupkita.app.ui.main.MainFragment.Companion.parentBottomAppBar
//import com.arysugiarto.attendence.ui.main.MainFragment.Companion.parentBottomAppBar
import com.lineupkita.app.ui.main.MainFragment.Companion.parentNavigation
import com.lineupkita.app.util.*
import com.lineupkita.app.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding<FragmentHomeBinding>()
    private val viewModel by hiltNavGraphViewModels<HomeViewModel>(R.id.home)
    private var cityAdapter = HomeAdapter.cityAdapter
    private var festivalAdapter = HomeAdapter.festivalAdapter

    private var listFilter = emptyList<Filter>()
    private var listFestival = emptyList<FestivalModel>()

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
        listFilter = listOf(
            Filter(
                1,
                "Bandung",
            ),
            Filter(
                2,
                "Jakarta",
            ),
            Filter(
                3,
                "Jogjakarta",
            ),
        )

        listFestival = listOf(
            FestivalModel(
                1,
                "Inde festival",
                "28-30 Agustus 2023",
                "https://i.pinimg.com/564x/8c/d3/79/8cd379feb761b6411014b178e7061a97.jpg"

            ),
            FestivalModel(
                2,
                "Inde festival",
                "28-30 Agustus 2023",
            "https://i.pinimg.com/564x/8c/d3/79/8cd379feb761b6411014b178e7061a97.jpg"
            ),
            FestivalModel(
                3,
                "Inde festival",
                "28-30 Agustus 2023",
                "https://i.pinimg.com/564x/8c/d3/79/8cd379feb761b6411014b178e7061a97.jpg"
            ),
        )

    }

    private fun initView(){
        listStaticData()
        cityAdapter.items = listFilter
        binding.rvFilter.adapter = cityAdapter
        festivalAdapter.items = listFestival
        binding.rvFestival.adapter = festivalAdapter

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


