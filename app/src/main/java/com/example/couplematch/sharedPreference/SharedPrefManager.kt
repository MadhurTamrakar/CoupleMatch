package com.example.couplematch.sharedPreference

import android.app.Activity
import android.content.SharedPreferences

class SharedPrefManager(activity: Activity) {

    private val ID = "Id"
    private val COUNTRYCODE = "CountryCode"
    private val USERNAME = "Name"
    private val USERCODE = "UserCode"
    private val PROFILE1 = "PROFILE1"
    private val PROFILE2 = "PROFILE2"
    private val PROFILE3 = "PROFILE3"
    private val PROFILE4 = "PROFILE4"
    private val PROFILE5 = "PROFILE5"
    private val PROFILE6 = "PROFILE6"
    private val MOBILE = "MOBILE"
    private val GENDER = "GENDER"
    private val DOB = "DOB"
    private val RELIGION = "RELIGION"
    private val DOSH = "DOSH"
    private val MARITAL_STATUS = "MARITAL_STATUS"
    private val DIET = "DIET"
    private val HEIGHT = "HEIGHT"
    private val EDUCATION = "EDUCATION"
    private val PROFESSION = "PROFESSION"
    private val LOCATION = "LOCATION"
    private val ABOUT_ME = "ABOUT_ME"
    private val PARTNER_PREFERENCE = "PARTNER_PREFERENCE"
    private val AGE = "AGE"
    private val PHYSICAL_STATUS = "PHYSICAL_STATUS"
    private val FATHER_OCCUPATION = "FATHER_OCCUPATION"
    private val MOTHER_OCCUPATION = "MOTHER_OCCUPATION"
    private val DRINK = "DRINK"
    private val SMOKE = "SMOKE"
    private val INCOME = "INCOME"
    private val EMAIL = "EMAIL"
    private val CITY = "CITY"


    private var editor: SharedPreferences.Editor? = null

    var pref: SharedPreferences? = null

    init {
        pref = activity.getSharedPreferences("newProject", 0)
        editor = pref?.edit()
    }

    //initial load market place verification
    fun setId(state: String) { editor?.putString(ID, state)?.apply() }
    fun getId(): String? { return pref?.getString(ID, ID) }

    fun setCountryCode(state: String) { editor?.putString(COUNTRYCODE, state)?.apply() }
    fun getCountryCode(): String? { return pref?.getString(COUNTRYCODE, COUNTRYCODE) }

    fun setUserCode(state: String) { editor?.putString(USERCODE, state)?.apply() }
    fun getUserCode(): String? { return pref?.getString(USERCODE, USERCODE) }

    fun setName(state: String){ editor?.putString(USERNAME, state)?.apply() }
    fun getName(): String? { return pref?.getString(USERNAME, USERNAME) }

    fun setUserProfile1(state: String){ editor?.putString(PROFILE1, state)?.apply() }
    fun getUserProfile1(): String? { return pref?.getString(PROFILE1, PROFILE1) }

    fun setUserProfile2(state: String){ editor?.putString(PROFILE2, state)?.apply() }
    fun getUserProfile2(): String? { return pref?.getString(PROFILE2, PROFILE2) }

    fun setUserProfile3(state: String){ editor?.putString(PROFILE3, state)?.apply() }
    fun getUserProfile3(): String? { return pref?.getString(PROFILE3, PROFILE3) }

    fun setUserProfile4(state: String){ editor?.putString(PROFILE4, state)?.apply() }
    fun getUserProfile4(): String? { return pref?.getString(PROFILE4, PROFILE4) }

    fun setUserProfile5(state: String){ editor?.putString(PROFILE5, state)?.apply() }
    fun getUserProfile5(): String? { return pref?.getString(PROFILE5, PROFILE5) }

    fun setUserProfile6(state: String){ editor?.putString(PROFILE6, state)?.apply() }
    fun getUserProfile6(): String? { return pref?.getString(PROFILE6, PROFILE6) }

    fun setUserMobile(state: String){ editor?.putString(MOBILE, state)?.apply() }
    fun getUserMobile(): String? { return pref?.getString(MOBILE, MOBILE) }

    fun setUserGender(state: String){ editor?.putString(GENDER, state)?.apply() }
    fun getUserGender(): String? { return pref?.getString(GENDER, GENDER) }

    fun setUserDob(state: String){ editor?.putString(DOB, state)?.apply() }
    fun getUserDob(): String? { return pref?.getString(DOB, DOB) }

    fun setUserReligion(state: String){ editor?.putString(RELIGION, state)?.apply() }
    fun getUserReligion(): String? { return pref?.getString(RELIGION, RELIGION) }

    fun setUserDosh(state: String){ editor?.putString(DOSH, state)?.apply() }
    fun getUserDosh(): String? { return pref?.getString(DOSH, DOSH) }

    fun setUserMaritalStatus(state: String){ editor?.putString(MARITAL_STATUS, state)?.apply() }
    fun getUserMaritalStatus(): String? { return pref?.getString(MARITAL_STATUS, MARITAL_STATUS) }

    fun setUserDiet(state: String){ editor?.putString(DIET, state)?.apply() }
    fun getUserDiet(): String? { return pref?.getString(DIET, DIET) }

    fun setUserHeight(state: String){ editor?.putString(HEIGHT, state)?.apply() }
    fun getUserHeight(): String? { return pref?.getString(HEIGHT, HEIGHT) }

    fun setUserEducation(state: String){ editor?.putString(EDUCATION, state)?.apply() }
    fun getUserEducation(): String? { return pref?.getString(EDUCATION, EDUCATION) }

    fun setUserProfession(state: String){ editor?.putString(PROFESSION, state)?.apply() }
    fun getUserProfession(): String? { return pref?.getString(PROFESSION, PROFESSION) }

    fun setUserLocation(state: String){ editor?.putString(LOCATION, state)?.apply() }
    fun getUserLocation(): String? { return pref?.getString(LOCATION, LOCATION) }

    fun setUserAboutMe(state: String){ editor?.putString(ABOUT_ME, state)?.apply() }
    fun getUserAboutMe(): String? { return pref?.getString(ABOUT_ME, ABOUT_ME) }

    fun setUserPartnerPreference(state: String){ editor?.putString(PARTNER_PREFERENCE, state)?.apply() }
    fun getUserPartnerPreference(): String? { return pref?.getString(PARTNER_PREFERENCE, PARTNER_PREFERENCE) }

    fun setUserAge(state: String){ editor?.putString(AGE, state)?.apply() }
    fun getUserAge(): String? { return pref?.getString(AGE, AGE) }

    fun setUserPhysicalStatus(state: String){ editor?.putString(PHYSICAL_STATUS, state)?.apply() }
    fun getUserPhysicalStatus(): String? { return pref?.getString(PHYSICAL_STATUS, PHYSICAL_STATUS) }

    fun setUserFatherOccupation(state: String){ editor?.putString(FATHER_OCCUPATION, state)?.apply() }
    fun getUserFatherOccupation(): String? { return pref?.getString(FATHER_OCCUPATION, FATHER_OCCUPATION) }

    fun setUserMotherOccupation(state: String){ editor?.putString(MOTHER_OCCUPATION, state)?.apply() }
    fun getUserMotherOccupation(): String? { return pref?.getString(MOTHER_OCCUPATION, MOTHER_OCCUPATION) }

    fun setUserDrink(state: String){ editor?.putString(DRINK, state)?.apply() }
    fun getUserDrink(): String? { return pref?.getString(DRINK, DRINK) }

    fun setUserSmoke(state: String){ editor?.putString(SMOKE, state)?.apply() }
    fun getUserSmoke(): String? { return pref?.getString(SMOKE, SMOKE) }

    fun setUserIncome(state: String){ editor?.putString(INCOME, state)?.apply() }
    fun getUserIncome(): String? { return pref?.getString(INCOME, INCOME) }

    fun setUserEmail(state: String){ editor?.putString(EMAIL, state)?.apply() }
    fun getUserEmail(): String? { return pref?.getString(EMAIL, EMAIL) }

    fun setUserCity(state: String){ editor?.putString(CITY, state)?.apply() }
    fun getUserCity(): String? { return pref?.getString(CITY, CITY) }
}
