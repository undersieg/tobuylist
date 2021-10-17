package pl.aberidus.tobuylist.extensions

import timber.log.Timber

actual fun Any.log(log: String) = Timber.d("APP -> $log")