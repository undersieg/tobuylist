package pl.aberidus.tobuylist

import android.app.Application
import android.util.Log
import androidx.annotation.NonNull
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber


@HiltAndroidApp
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(CrashReportingTree())
        }
    }
}

private class CrashReportingTree : Timber.Tree() {
    override fun log(
        priority: Int,
        tag: String?,
        @NonNull message: String,
        t: Throwable?
    ) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return
        }
    }
}