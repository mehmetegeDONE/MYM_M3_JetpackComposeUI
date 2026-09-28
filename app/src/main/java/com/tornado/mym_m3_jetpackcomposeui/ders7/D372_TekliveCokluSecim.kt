package com.tornado.mym_m3_jetpackcomposeui.ders7

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

@Composable
fun D372_TekliveCokluSecim(){

    var misir by rememberSaveable() { mutableStateOf(false) }
    var seciliHamur by rememberSaveable() { mutableStateOf("Ince") }

    Column() {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = misir,
                onCheckedChange = {misir = it}
            )
            Text("Mısır ekle")
        }

        Row() {

            RadioButton(
                selected = seciliHamur == "Ince",
                onClick = {seciliHamur = "Ince"}
            )
            Text("Ince Hamur")
        }

        Row() {

            RadioButton(
                selected = seciliHamur == "Kalın",
                onClick = {seciliHamur = "Kalın"}
            )
            Text("Kalın Hamur")
        }
    }
}