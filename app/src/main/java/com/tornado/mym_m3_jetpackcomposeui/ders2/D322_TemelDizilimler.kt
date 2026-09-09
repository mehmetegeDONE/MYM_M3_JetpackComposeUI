package com.tornado.mym_m3_jetpackcomposeui.ders2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable // <- Ekrana basma işlemi için gereklidir.
fun D322_TemelDizilimler(){

    Column( // Alt alta dizili kutular
        modifier = Modifier // Column Ozelliklerleri
            .background(color = Color.Black)
            .border(width = 2.dp, color = Color.Red)
            .fillMaxSize()
            .padding(all = 24.dp)
    ) {
        Text("🍎")
        Text("Ali Yılmaz")
        Text("Antroid Geliştirici")
        Spacer(modifier = Modifier.height(height = 20.dp)) // Bosluk eklemeni sağlar

        Row(
            modifier = Modifier
                .background(color = Color(0xFF8BC34A))
                .border(width = 2.dp, color = Color.Red)
                .fillMaxWidth()
                .padding(vertical = 20.dp)
        ) { // Yan yana dizili kutular
            Text("Takipçi: 500 \t")
            Spacer(modifier = Modifier.weight(1f)) // Bosluk eklemeni sağlar
            Text("Takip Edilen: 120")


        }

        Spacer(modifier = Modifier.height(height = 20.dp)) // Bosluk eklemeni sağlar

        Box(
            modifier = Modifier
                .background(color = Color(0xFF2196F3))
                .border(width = 2.dp, color = Color.Red)
                .width(width = 100.dp)
                .height(height = 100.dp)
                .padding(top = 20.dp, start = 20.dp)
        ) { // Ust uste dizili kutular (Alttaki en uste yazılır)
            Text("🟩")
            Text("Begen")
        }
    }
}