package com.example.navigacao_entre_telas_fhn.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MenuScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(40.dp),
            contentAlignment = Alignment.TopCenter

    ) {
        Text(text = "TELA MENU", fontWeight = FontWeight.Bold, fontSize = 30.sp, color = Color.Yellow)
        Column(
            modifier = Modifier
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {navController.navigate("perfil") },
                modifier = Modifier.size(width = 250.dp, height = 50.dp),
                colors = ButtonDefaults.buttonColors(Color.DarkGray)
            ) {
                Text(text = "IR PARA PERFIL", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Red);
            }
            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {navController.navigate("pedidos") },
                modifier = Modifier.size(width = 250.dp, height = 50.dp),
                colors = ButtonDefaults.buttonColors(Color.DarkGray)
            ) {
                Text(text = "IR PARA PEDIDOS", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue);
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {navController.navigate("login") },
                modifier = Modifier.size(width = 250.dp, height = 50.dp),
                colors = ButtonDefaults.buttonColors(Color.DarkGray)
            ) {
                Text(text = "SAIR PARA LOGIN", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Green);
            }

        }
    }


}
