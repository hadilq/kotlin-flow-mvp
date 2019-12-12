package com.gfabrego.moviesapp.popular.list

import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

open class CoroutineProvider(mainContext: CoroutineContext) {
    open val MAIN: CoroutineContext = mainContext
    open val IO: CoroutineContext by lazy { Dispatchers.IO }
}
