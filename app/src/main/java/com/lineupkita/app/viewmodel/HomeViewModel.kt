package com.lineupkita.app.viewmodel

import android.app.Application
import com.lineupkita.app.util.BaseViewModel
import com.lineupkita.app.data.repositories.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    application: Application,
    homeRepository: HomeRepository
) : BaseViewModel(application) {
    private val repository = homeRepository


}