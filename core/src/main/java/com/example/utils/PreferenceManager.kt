package com.example.utils

@Singleton
interface PreferenceManager {
    val uiModeFlow: Flow<Boolean>

    /**
     * Set preference for UI mode.
     *
     * @param enable Sets Dark Mode if true otherwise Light mode.
     */
    suspend fun setDarkMode(enable: Boolean)
}