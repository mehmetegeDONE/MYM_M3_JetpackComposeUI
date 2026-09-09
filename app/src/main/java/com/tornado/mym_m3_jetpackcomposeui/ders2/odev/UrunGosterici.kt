package com.tornado.mym_m3_jetpackcomposeui.ders2.odev

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun UrunGosterici() {

    Column(
        modifier = Modifier
            .background(color = Color(0xFFEAE1FC))
            .fillMaxSize()
            .padding(all = 24.dp)
    ) {

        Column(
            modifier = Modifier
                .background(color = Color.White, shape = RoundedCornerShape(12.dp))
                .fillMaxWidth()
                .padding(all = 20.dp)
        ) {
            Text("\uD83D\uDCF8 Urun Görseli")
            Spacer(modifier = Modifier.height(height = 320.dp))
        }

        Row(modifier = Modifier
            .padding(top = 10.dp)
            .padding(horizontal = 10.dp)
        ) {
            Text(text = "Ürün Adı:",fontSize = 13.sp, fontWeight = FontWeight.Bold)
            Text(text = "\tAkıllı Saat",fontSize = 13.sp, fontWeight = FontWeight.Light)
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "Fiyat:", fontSize = 13.sp, fontWeight = FontWeight.Bold)
            Text(text = "\t1500TL", color = Color(0xFF2E7D32),fontSize = 13.sp, fontWeight = FontWeight.Light)
        }

        Spacer(modifier = Modifier.weight(1f))

        Column( modifier = Modifier
            .background(color = Color(0xFF2563EB), shape = RoundedCornerShape(8.dp) )
            .padding(all = 10.dp)
            .padding(horizontal = 15.dp)
        ) {
            Text("Sepete Ekle",color = Color.White,fontSize = 12.sp)
        }

    }


}