package com.plcoding.daggerhiltcourse.data.repository

import android.app.Application
import com.plcoding.daggerhiltcourse.R
import com.plcoding.daggerhiltcourse.data.remote.MyApi
import com.plcoding.daggerhiltcourse.domain.repository.MyRepository
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule
import javax.inject.Inject

class MyRepositoryImpl(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        print("Hello from the repository. The app name is $appName.")
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}