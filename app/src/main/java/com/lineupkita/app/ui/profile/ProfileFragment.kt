package com.lineupkita.app.ui.profile

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
class ProfileFragment : Fragment(R.layout.fragmanet_profile) {

    private val binding by viewBinding<FragmanetProfileBinding>()
    private val viewModel by hiltNavGraphViewModels<HomeViewModel>(R.id.profile)

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

    private fun initView(){

    }

    private fun initViewModel() {

    }

    private fun initViewModelCallback() {

    }

    private fun initCallback() {

    }


    private fun initOnClick() {
        binding.apply {
            tvArtistFav.setOnClickListener(onClickCallback)
            tvKonserWhislist.setOnClickListener(onClickCallback)
        }
    }

    private val onClickCallback = View.OnClickListener { view ->
        when (view) {
            binding.tvArtistFav -> {
                navController.navigateOrNull(
                    ProfileFragmentDirections.actionProfileFragmentToArtistFavFragment()
                )
            }
            binding.tvKonserWhislist -> {
                navController.navigateOrNull(
                    ProfileFragmentDirections.actionProfileFragmentToWhislistFragment()
                )
            }
        }

    }

}


