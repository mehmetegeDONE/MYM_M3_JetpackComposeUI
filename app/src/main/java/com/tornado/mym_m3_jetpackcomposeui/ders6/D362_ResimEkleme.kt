package com.tornado.mym_m3_jetpackcomposeui.ders6

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tornado.mym_m3_jetpackcomposeui.R

@Composable
fun D362_ResimEkleme() {
    Column(modifier = Modifier.fillMaxWidth().padding(24.dp)) {

        Box(
            modifier = Modifier
                .height(100.dp)
                .width(150.dp)
                .border(2.dp, color = Color.Cyan)
        ) {
            androidx.compose.foundation.Image( // Resim oluşturma
                painter = painterResource(id = R.drawable.profil_resmi), // Resmi
                contentDescription = "Profil resmi",                      // Resim açıklaması
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(size = 250.dp).clip(shape = CircleShape)

            )
        }
    }


}