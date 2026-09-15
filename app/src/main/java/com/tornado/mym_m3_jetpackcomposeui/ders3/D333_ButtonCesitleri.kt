package com.tornado.mym_m3_jetpackcomposeui.ders3

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun D333_ButtonCesitleri(){
    Column(modifier = Modifier.padding(24.dp)) {

        // Dolu Button

        Button(onClick = {println("Sepete Eklenme Buttonuna Basıldı")}) {
            Text("Sepete Ekle")
        }


        HorizontalDivider(
            thickness = 10.dp,
            color = Color.Blue
        )

        // Çerçeveli Button

        OutlinedButton(onClick = {println("Iptal Et Buttonuna Basıldı")}) {
            Text("Iptal Et")
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Metin Buttonu

        TextButton(onClick = {println("Şifreme Unuttum Buttonuna Basıldı")}) {
            Text("Şifremi unuttum!")
        }

        // Yanyana eşit paylaşımlı buttonlar

        Row(modifier = Modifier.fillMaxWidth()) {

            OutlinedButton(
                onClick = {},
                modifier = Modifier.weight(1f)
            ) {
                Text("Vazgeçiyor musun?")
            }

            Button(
                onClick = {},
                modifier = Modifier.weight(1f)
            ) {
                Text("Onayla")
            }
        }


        Spacer(modifier = Modifier.weight(1f))

        // Tam genişlikte renkli button

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(contentColor = Color.Green)
        ) {
            Text("Tam -Genişlikte Button")
        }
    }
}