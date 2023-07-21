package com.example.onboardingpager.utils

import android.icu.text.CaseMap.Title
import androidx.annotation.DrawableRes
import com.example.onboardingpager.R

sealed class OnBoardingPage(
    @DrawableRes val image: Int,
    val title: String,
    val description: String,
) {
    object One : OnBoardingPage(R.drawable.one, "Champion", "Always be the first to be able to win")
    object Two : OnBoardingPage(
        R.drawable.two,
        "life",
        "Life, like a garden, we only touch some flowers, but we kiss others with all our hearts."
    )

    object Three : OnBoardingPage(
        R.drawable.three,
        "journey",
        "Being on the same path makes the journey easier."
    )
}
