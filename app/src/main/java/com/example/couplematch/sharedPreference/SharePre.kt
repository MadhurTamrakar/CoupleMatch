package com.example.couplematch.sharedPreference

import android.content.Context
import android.content.SharedPreferences

class SharePre(activity: Context) {

    private val LATITUDE_A = "latA"
    private val LONGITUDE_A = "lngA"
    private val LATITUDE_B = "latB"
    private val LONGITUDE_B = "lngB"

    private var editor: SharedPreferences.Editor? = null

    var pref: SharedPreferences? = null

    init {
        pref = activity.getSharedPreferences("newProject", 0)
        editor = pref?.edit()
    }

    fun setlatA(state: String) { editor?.putString(LATITUDE_A, state)?.apply() }
    fun getlatA(): String? { return pref?.getString(LATITUDE_A, LATITUDE_A) }

    fun setlngA(state: String) { editor?.putString(LONGITUDE_A, state)?.apply() }
    fun getlngA(): String? { return pref?.getString(LONGITUDE_A, LONGITUDE_A) }

    fun setlatB(state: String) { editor?.putString(LATITUDE_B, state)?.apply() }
    fun getlatB(): String? { return pref?.getString(LATITUDE_B, LATITUDE_B) }

    fun setlngB(state: String){ editor?.putString(LONGITUDE_B, state)?.apply() }
    fun getlngB(): String? { return pref?.getString(LONGITUDE_B, LONGITUDE_B) }
}
