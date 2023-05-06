package com.lineupkita.app.data.repositories

import com.lineupkita.app.data.source.callback.HomeSourceCallback
import com.lineupkita.app.data.source.data.HomeRemoteDataSource

class HomeRepository(
    homeRemoteDataSource: HomeRemoteDataSource
) : HomeSourceCallback {
    private val remoteDataSource = homeRemoteDataSource


}