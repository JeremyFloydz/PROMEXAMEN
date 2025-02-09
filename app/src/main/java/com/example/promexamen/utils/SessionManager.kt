package com.example.promexamen.utils

import android.content.Context
import android.content.SharedPreferences

class SessionManager(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    companion object {
        private const val PREFS_NAME = "session_prefs"
        private const val KEY_USER_TYPE = "user_type"
    }

    fun saveUserType(userType: String) {
        prefs.edit().putString(KEY_USER_TYPE, userType).apply()
    }

    fun getUserType(): String? {
        return prefs.getString(KEY_USER_TYPE, null)
    }

    fun clearSession() {
        prefs.edit().clear().apply()
    }
}
