package com.tornado.mym_m3_jetpackcomposeui.ders7.odev

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BrightnessMedium
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.WbSunny
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

enum class Dil(){
    TURKCE,
    INGILIZCE
}

@Composable
fun AyarlarSayfasi(){

    var wifiDurumu by remember { mutableStateOf(false) }
    var bildirimDurumu by remember { mutableStateOf(false) }
    var parlaklikDurumu by remember { mutableStateOf(50f) }
    var dilDurumu by remember { mutableStateOf(Dil.TURKCE) }

    Column(modifier = Modifier.background(color = Color(0xFFF3F2F7)).fillMaxSize().padding(16.dp)) {

        Text("Ayarlar", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(35.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Wifi,
                contentDescription = "Wifi",
                tint = Color(0xFF6300EB),
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text("Wifi Bağlantısı", fontSize = 22.sp)
            Spacer(modifier = Modifier.weight(1f))
            Switch(
                checked = wifiDurumu,
                onCheckedChange = {yeniWifiDurumu -> wifiDurumu = yeniWifiDurumu},
                colors = SwitchDefaults.colors(checkedTrackColor = Color(0xFF6300EB))
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        HorizontalDivider(thickness = 2.dp, color = Color.LightGray)

        Spacer(modifier = Modifier.height(25.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "Wifi",
                tint = Color(0xFF6300EB),
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text("Uygulama Bildirimleri", fontSize = 22.sp)
            Spacer(modifier = Modifier.weight(1f))
            Checkbox(
                checked = bildirimDurumu,
                onCheckedChange = {yeniBildirimDurumu -> bildirimDurumu = yeniBildirimDurumu},
                colors = CheckboxDefaults.colors(checkedColor = Color(0xFF6300EB))
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        HorizontalDivider(thickness = 2.dp, color = Color.LightGray)

        Spacer(modifier = Modifier.height(25.dp))

        Row() {
            Icon(
                imageVector = Icons.Default.BrightnessMedium,
                contentDescription = "Wifi",
                tint = Color(0xFF6300EB),
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))

            Text("Ekran Parlaklığı: ", fontSize = 22.sp)
            Text(text = parlaklikDurumu.toInt().toString(), fontSize = 22.sp, color =
                if (parlaklikDurumu.toInt() <= 20) Color(0xFF640014)
                else if (parlaklikDurumu.toInt() < 50) Color(0xFFEB0000)
                else if (parlaklikDurumu.toInt() == 50) Color(0xFFEB6600)
                else Color(0xFF418820)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Slider(
            modifier = Modifier.padding(horizontal = 25.dp),
            value = parlaklikDurumu,
            onValueChange = {yeniParlaklikDurumu -> parlaklikDurumu = yeniParlaklikDurumu},
            valueRange = 0f..100f,
            colors = SliderDefaults.colors(activeTrackColor = Color(0xFF6300EB))
        )

        Spacer(modifier = Modifier.height(16.dp))

        HorizontalDivider(thickness = 2.dp, color = Color.LightGray)

        Spacer(modifier = Modifier.height(25.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Language,
                contentDescription = "Wifi",
                tint = Color(0xFF6300EB),
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text("Uygulama Dili", fontSize = 22.sp)
        }

        Row(modifier = Modifier.padding(horizontal = 40.dp)) {

            Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = dilDurumu == Dil.TURKCE,
                    onClick = {dilDurumu = Dil.TURKCE},
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color(0xFF6300EB), unselectedColor = Color(0xFF919191)
                    )
                )

                Text("Türkçe", fontSize = 18.sp)
            }

            Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = dilDurumu == Dil.INGILIZCE,
                    onClick = {dilDurumu = Dil.INGILIZCE},
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color(0xFF6300EB), unselectedColor = Color(0xFF919191)
                    )
                )

                Text("English", fontSize = 18.sp)
            }
        }
    }
}