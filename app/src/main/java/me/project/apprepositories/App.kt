package me.project.apprepositories

import android.app.Application
import me.project.apprepositories.data.di.DataModule
import me.project.apprepositories.domain.di.DomainModule
import me.project.apprepositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}
