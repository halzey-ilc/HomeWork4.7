package com.example.homework47.data.locale.preferences.helper

import android.content.Context
import android.content.SharedPreferences

class PreferencesHelper(context: Context) {

    private val preferenceHelper: SharedPreferences =
        context.getSharedPreferences("userStatus", Context.MODE_PRIVATE)

    operator fun invoke() = preferenceHelper
}