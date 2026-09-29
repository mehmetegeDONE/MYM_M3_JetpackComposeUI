package com.tornado.mym_m3_jetpackcomposeui.ders9

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun D393_AlertDialog(){
    var pencereAcikMi by remember() { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

        Button(onClick = {pencereAcikMi = true}) {
            Text("Silmeyi Onayla")
        }
    }

    if (pencereAcikMi){ // true yapılırsa bu sayfa açılacaktır
        AlertDialog(
            onDismissRequest = {pencereAcikMi = false},
            title = { Text("Emin misin?") },
            icon = {
                Icon(imageVector = Icons.Default.Warning, contentDescription = "Uyarı")
            },
            text = {Text("Bu işlem geri alınamaz. Yapmak istediğine emin misin?")},
            dismissButton = {
                TextButton(onClick = { pencereAcikMi = false}) {
                    Text("Iptal")
                }
            },
            confirmButton = {
                Button(onClick = {pencereAcikMi = false}) {
                    Text("Onayla")
                }
            }
        )
    }

}