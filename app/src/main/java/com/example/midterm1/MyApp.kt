package com.example.midterm1

import android.app.Application
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext
import com.example.midterm1.di.activityModule

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApp)
            modules(activityModule)
        }
    }
}
