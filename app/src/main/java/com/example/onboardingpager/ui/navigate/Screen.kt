package com.example.onboardingpager.ui.navigate

sealed class Screen(val route: String){
    object Welcome:Screen(route = "Welcome_Screen")
    object Home:Screen(route = "Home_Screen")
}
