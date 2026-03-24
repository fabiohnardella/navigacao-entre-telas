package com.example.navigacao_entre_telas_fhn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigacao_entre_telas_fhn.screens.LoginScreen
import com.example.navigacao_entre_telas_fhn.screens.MenuScreen
import com.example.navigacao_entre_telas_fhn.screens.PedidosScreen
import com.example.navigacao_entre_telas_fhn.screens.PerfilScreen
import com.example.navigacao_entre_telas_fhn.ui.theme.NavigacaoentretelasfhnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigacaoentretelasfhnTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {
                        composable(route = "login") {
                            LoginScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "menu") {
                            MenuScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(
                            route = "pedidos?cliente={cliente}", arguments = listOf(
                                navArgument("cliente") {
                                    defaultValue = "Cliente XPTO"
                                })
                        ) {
                            val cliente: String? = it.arguments?.getString("cliente")

                            PedidosScreen(modifier = Modifier.padding(innerPadding), navController, cliente!!)
                        }
                        composable(
                            route = "perfil/{nome}/{idade}", arguments = listOf(
                                navArgument("nome") {
                                    type = NavType.StringType
                                },
                                navArgument("idade") {
                                    type = NavType.IntType
                                }


                            )) {
                            val nome: String? = it.arguments?.getString("nome", "Usuário Genérico")
                            val idade: Int? = it.arguments?.getInt("idade", 67)

                            PerfilScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController,
                                nome!!,
                                idade!!
                            )
                        }


                    }


                }
            }
        }
    }
}
