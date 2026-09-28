package com.tornado.mym_m3_jetpackcomposeui.ders8

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DoNotTouch
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tornado.mym_m3_jetpackcomposeui.R

@Composable
fun D385_RehberUygulama(){

    val rasgeleRenk : List<Color> = listOf(Color(0xFF4CAF50),Color(0xFF2196F3),Color(0xFFFF9800),Color(
        0xFFF44336))

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0xFFF1F3F5))
        .padding(24.dp)) {

        Text("Rehber", fontSize = 28.sp, fontWeight = FontWeight.Bold, color = Color(0xFF111827))

        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(kisilerListesi) { kisi ->
                Card(
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                ){
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        Box(
                            modifier = Modifier
                                .background(color = rasgeleRenk.random(), shape = CircleShape)
                                .size(50.dp),
                            contentAlignment = Alignment.Center
                        ){
                            Icon(imageVector =
                                Icons.Default.Person,
                                contentDescription = "Kişi profili",
                                tint = Color(0xC41F1F1F),
                                modifier = Modifier.size(40.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Column() {
                            Text(text = kisi.isim, fontSize = 18.sp, fontWeight = FontWeight.Bold,
                                color = Color(0xFF111827)
                            )
                            Text(text = kisi.telefon, fontSize = 14.sp, color = Color(0xFF6B7280))
                        }

                        Spacer(modifier = Modifier.weight(1f))

                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Call, contentDescription = "Ara",
                                tint = Color(0xFF12B581)
                            )
                        }
                    }
                }
            }
        }
    }
}