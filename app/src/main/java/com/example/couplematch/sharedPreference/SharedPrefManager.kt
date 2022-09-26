package com.example.couplematch.sharedPreference

import android.app.Activity
import android.content.SharedPreferences

class SharedPrefManager(activity: Activity) {

    private val API_URL = "Id"
    private val USER = "Name"
    private val USERCODE = "UserCode"

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

    fun setUserCode(state: String) {
        editor?.putString(USERCODE, state)?.apply()
    }

    fun getUserCode(): String? {
        return pref?.getString(USERCODE, USERCODE)
    }

    fun setString(state: String){
        editor?.putString(USER, state)?.apply()
    }

    fun getString(): String? {
        return pref?.getString(USER, USER)
    }
}
