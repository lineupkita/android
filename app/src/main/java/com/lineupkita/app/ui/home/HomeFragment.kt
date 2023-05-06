package com.lineupkita.app.ui.home

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import com.lineupkita.app.R
import com.lineupkita.app.databinding.FragmentHomeBinding
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


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewModel()
        initCallback()
        initViewModelCallback()
        initOnClick()
        parentBottomAppBar?.isVisible = false
        parentNavigation?.isVisible = false


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


