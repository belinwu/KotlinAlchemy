package com.istudio.app.modules.module_demos.sealed_class

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.istudio.app.modules.module_demos.channels.ChannelsDemoVm

@Composable
fun SealedClassDemo(navController: NavHostController) {

    val viewModel: SealedClassDemoVm = hiltViewModel()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Sealed class Demo",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            //navController.navigate(Screen.Second.rout + "/www.url.com/44")
        }) {
            Text(
                text = "Go To Second",
            )
        }
    }
}