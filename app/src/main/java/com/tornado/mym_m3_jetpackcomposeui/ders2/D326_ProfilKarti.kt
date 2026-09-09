package com.tornado.mym_m3_jetpackcomposeui.ders2

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun D326_ProfilKarti() {

    Column(
        modifier = Modifier
            .background(color = Color(0xFFF3F4F6))
            .fillMaxSize()
            .padding(all = 24.dp)
    ) {

        Row(
            modifier = Modifier
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(16.dp))
                .fillMaxWidth()
                .border(width = 1.dp, color = Color.LightGray, shape = RoundedCornerShape(16.dp))
                .padding(all = 20.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .background(color = Color(0xFFE0E7FF), shape = RoundedCornerShape(8.dp))
            ) {
                Text(text = "\uD83D\uDC64", modifier = Modifier.padding(16.dp), fontSize = 40.sp)
                Text(text = "✅", fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column() {
                Text(
                    text = "Ali Yılmaz",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = "Android Geliştirici", color = Color.Gray, fontSize = 10.sp)
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(16.dp))
                    .fillMaxWidth()
                    .border(
                        width = 1.dp,
                        color = Color.LightGray,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .padding(all = 20.dp)
            ) {
                Text(text = "Takipçi: 500", fontSize = 12.sp, fontWeight = FontWeight.Medium)
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "Takip Edilen: 120", fontSize = 12.sp, fontWeight = FontWeight.Medium)
            }
        }
    }
}