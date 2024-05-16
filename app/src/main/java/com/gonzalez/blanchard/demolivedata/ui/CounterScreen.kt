package com.gonzalez.blanchard.demolivedata.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.gonzalez.blanchard.demolivedata.ui.viewmodel.CounterViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CounterScreen(
    counterViewModel: CounterViewModel = viewModel()
){
    val count = counterViewModel.count.observeAsState(0)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Counter: ${count.value}")
        Button(onClick = {
            counterViewModel.incrementCount()
        }) {
            Text(text = "Incrementar")
        }
    }

}