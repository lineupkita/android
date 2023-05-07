package com.lineupkita.app.ui.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.lineupkita.app.R
import com.lineupkita.app.databinding.FragmentRegisterBinding
//import com.arysugiarto.attendence.ui.main.MainFragment.Companion.parentBottomAppBar
import com.lineupkita.app.util.*
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : Fragment(R.layout.fragment_register) {

    private val binding by viewBinding<FragmentRegisterBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewModel()
        initCallback()
        initViewModelCallback()
        initOnClick()
//        parentBottomAppBar?.isVisible = false
//        parentNavigation?.isVisible = false


    }

    private fun initViewModel() {

    }

    private fun initViewModelCallback() {

    }

    private fun initCallback() {

    }


    private fun initOnClick() {
        binding.apply {
            btnRegister.setOnClickListener(onClickCallback)
        }
    }



    private val onClickCallback = View.OnClickListener { view ->
        when (view) {
            binding.btnRegister -> {
                navController.navigateOrNull(
                    RegisterFragmentDirections.actionRegisterFragmentToMainFragment()
                )

            }
        }

    }


}