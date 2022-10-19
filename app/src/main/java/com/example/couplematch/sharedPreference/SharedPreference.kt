package com.example.couplematch.sharedPreference

import android.app.Activity
import android.content.SharedPreferences

class SharedPreference(activity: Activity) {

    private val AGE = "AGE"
    private val RELIGION = "RELIGION"
    private val DOSH = "DOSH"
    private val MARITAL_STATUS = "MARITAL_STATUS"
    private val DIET = "DIET"
    private val HEIGHT = "HEIGHT"
    private val EDUCATION = "EDUCATION"
    private val PROFESSION = "PROFESSION"
    private val PHYSICAL_STATUS = "PHYSICAL_STATUS"
    private val DRINK = "DRINK"
    private val SMOKE = "SMOKE"
    private val INCOME = "INCOME"

    private var editor: SharedPreferences.Editor? = null

    var pref: SharedPreferences? = null

    init {
        pref = activity.getSharedPreferences("newProject", 0)
        editor = pref?.edit()
    }

    //initial load market place verification
    fun setAge(state: String) { editor?.putString(AGE, state)?.apply() }
    fun getAge(): String? { return pref?.getString(AGE, AGE) }

    fun setReligion(state: String){ editor?.putString(RELIGION, state)?.apply() }
    fun getReligion(): String? { return pref?.getString(RELIGION, RELIGION) }

    fun setDosh(state: String){ editor?.putString(DOSH, state)?.apply() }
    fun getDosh(): String? { return pref?.getString(DOSH, DOSH) }

    fun setMaritalStatus(state: String){ editor?.putString(MARITAL_STATUS, state)?.apply() }
    fun getMaritalStatus(): String? { return pref?.getString(MARITAL_STATUS, MARITAL_STATUS) }

    fun setDiet(state: String){ editor?.putString(DIET, state)?.apply() }
    fun getDiet(): String? { return pref?.getString(DIET, DIET) }

    fun setHeight(state: String){ editor?.putString(HEIGHT, state)?.apply() }
    fun getHeight(): String? { return pref?.getString(HEIGHT, HEIGHT) }

    fun setEducation(state: String){ editor?.putString(EDUCATION, state)?.apply() }
    fun getEducation(): String? { return pref?.getString(EDUCATION, EDUCATION) }

    fun setProfession(state: String){ editor?.putString(PROFESSION, state)?.apply() }
    fun getProfession(): String? { return pref?.getString(PROFESSION, PROFESSION) }

    fun setPhysicalStatus(state: String){ editor?.putString(PHYSICAL_STATUS, state)?.apply() }
    fun getPhysicalStatus(): String? { return pref?.getString(PHYSICAL_STATUS, PHYSICAL_STATUS) }

    fun setDrink(state: String){ editor?.putString(DRINK, state)?.apply() }
    fun getDrink(): String? { return pref?.getString(DRINK, DRINK) }

    fun setSmoke(state: String){ editor?.putString(SMOKE, state)?.apply() }
    fun getSmoke(): String? { return pref?.getString(SMOKE, SMOKE) }

    fun setIncome(state: String){ editor?.putString(INCOME, state)?.apply() }
    fun getIncome(): String? { return pref?.getString(INCOME, INCOME) }

}
