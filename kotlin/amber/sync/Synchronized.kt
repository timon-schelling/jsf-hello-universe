package amber.sync

import amber.sync.kotlin.KotlinSynchronizedImpl

interface Synchronized {
    fun <T> synchronized(block: () -> T): T
    suspend fun <T> asyncSynchronized(block: () -> T): T
}

@Suppress("FunctionName")
fun Synchronized(syncMode: SyncMode = SyncMode.KOTLIN) = when (syncMode) {
    SyncMode.SAFE_EXECUTOR   -> TODO()
    SyncMode.HEAVY_EXECUTOR  -> TODO()
    SyncMode.UNSAFE_EXECUTOR -> TODO()
    SyncMode.MUTEX           -> TODO()
    SyncMode.KOTLIN          -> KotlinSynchronizedImpl()
}

enum class SyncMode {
    HEAVY_EXECUTOR, SAFE_EXECUTOR, UNSAFE_EXECUTOR, MUTEX, KOTLIN
}
