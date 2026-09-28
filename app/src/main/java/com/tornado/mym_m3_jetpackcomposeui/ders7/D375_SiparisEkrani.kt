package com.tornado.mym_m3_jetpackcomposeui.ders7

import androidx.activity.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun D375_SiparisEkrani(){

    var seciliboyut by remember(){ mutableStateOf("Küçük")}
    var mantarOlsunMu by remember(){ mutableStateOf(false)}
    var sucukOlsunMu by remember(){ mutableStateOf(false)}
    var misirOlsunMu by remember(){ mutableStateOf(false)}
    var hamurKalinligi by remember { mutableStateOf(2f) }
    var zileBasilmasinMi by remember { mutableStateOf(false) }

    Column(modifier =
        Modifier.fillMaxSize().background(Color(0xFFFDFDFD)).padding(16.dp)
            .verticalScroll(rememberScrollState())) {

        Image(
            painter = painterResource(id = com.tornado.mym_m3_jetpackcomposeui.R.drawable.pizza_resmi),
            contentDescription = "Pizza Görseli",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth().height(200.dp).clip(RoundedCornerShape(16.dp))
            )

        Spacer(modifier = Modifier.padding(12.dp))

        Text("Kendi Pizzanı Oluştur", color = Color(0xFFE65100), fontSize = 24.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.padding(8.dp))

        Text("Pizza Oluştur",fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Row() {

            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = seciliboyut == "Küçük",
                    onClick = {seciliboyut = "Küçük"}
                )
                Text("Küçük")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = seciliboyut == "Orta",
                    onClick = {seciliboyut = "Orta"}
                )
                Text("Orta")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = seciliboyut == "Büyük",
                    onClick = {seciliboyut = "Büyük"}
                )
                Text("Büyük")
            }
        }

        Spacer(modifier = Modifier.padding(8.dp))

        Text("Ekstra Malzemeler",fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.padding(8.dp))


        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = mantarOlsunMu,
                onCheckedChange = {yeniMantarDurumu -> mantarOlsunMu = yeniMantarDurumu}
            )
            Text("Mantar")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = sucukOlsunMu,
                onCheckedChange = {yeniSucukDurumu -> sucukOlsunMu = yeniSucukDurumu}
            )
            Text("Sucuk")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = misirOlsunMu,
                onCheckedChange = {yeniMisirDurumu -> misirOlsunMu = yeniMisirDurumu}
            )
            Text("Mısır")
        }

        Text("Hamur Kalınlığı: " +
                "${
                    if (hamurKalinligi == 1f) "Ince"
                    else if (hamurKalinligi == 2f) "Normal"
                    else "Kalın"
                } "
            ,fontSize = 18.sp, fontWeight = FontWeight.Bold)

        Slider(
            value = hamurKalinligi,
            onValueChange = {yeniHamurKalinligi -> hamurKalinligi = yeniHamurKalinligi},
            valueRange = 1f..3f,
            steps = 1
        )
        Spacer(modifier = Modifier.padding(8.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Temassız Teslimat (Zili Çalma)",fontSize = 18.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.width(12.dp))
            Switch(
                checked = zileBasilmasinMi,
                onCheckedChange = {yeniZilDurumu -> zileBasilmasinMi = yeniZilDurumu}
            )
        }

        Spacer(modifier = Modifier.padding(20.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE65100)),
            modifier = Modifier.fillMaxWidth().height(56.dp)
        ) {
            Text("Siparişi Onayla", fontSize =  20.sp, fontWeight = FontWeight.W600)
        }
    }
}