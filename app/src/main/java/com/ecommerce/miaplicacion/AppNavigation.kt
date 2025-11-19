package com.ecommerce.miaplicacion

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppsScreen.inicio.route) {

        composable(route = AppsScreen.inicio.route) {
            inicio(navController)
        }

        composable(
            route = "detalle/{imagen}/{nombre}/{precio}", //
            arguments = listOf(
                navArgument("imagen") { type = NavType.IntType },
                navArgument("nombre") { type = NavType.IntType },
                navArgument("precio") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val imagen = backStackEntry.arguments?.getInt("imagen") ?: 0
            val nombre = backStackEntry.arguments?.getInt("nombre") ?: 0
            val precio = backStackEntry.arguments?.getInt("precio") ?: 0

            detalle(navController,imagen,nombre,precio)

        }
    }
}