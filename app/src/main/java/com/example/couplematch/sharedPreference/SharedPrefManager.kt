package com.example.couplematch.sharedPreference

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import com.example.couplematch.model.Message

class SharedPrefManager(activity: Activity) {

    private val API_URL = "Id"

    private var editor: SharedPreferences.Editor? = null

    var pref: SharedPreferences? = null

    init {
        pref = activity.getSharedPreferences("newProject", 0)
        editor = pref?.edit()
    }

    //initial load market place verification
    fun setId(state: String) {
        editor?.putString(API_URL, state)?.apply()
    }

    fun getId(): String? {
        return pref?.getString(API_URL, API_URL)
    }
}
