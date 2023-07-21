package com.example.onboardingpager.ui.navigate

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.onboardingpager.ui.fragment.HomeScreen
import com.example.onboardingpager.ui.fragment.WelcomeScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
@ExperimentalAnimationApi
@ExperimentalPagerApi
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Welcome.route) {
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen()
        }
    }
}