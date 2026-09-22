package com.tornado.mym_m3_jetpackcomposeui.ders6.odev

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.StarRate
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tornado.mym_m3_jetpackcomposeui.R

@Composable
fun YemekTarifKarti(){
    Column(Modifier.background(color = Color(0xFFF8F9FA)).fillMaxSize().padding(24.dp)) {

        Card(modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(6.dp),
            shape = RoundedCornerShape(size = 16.dp)

        ) {

            Box(
                modifier = Modifier.height(180.dp).fillMaxWidth().background(color = Color.Red)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pizza_resmi),
                    contentDescription = "Pizza Görseli",
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Row() {
                    Text("İtalyan Pizza", fontWeight = FontWeight.Bold, fontSize = 30.sp)
                    Spacer(modifier = Modifier.weight(1f))

                    Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorile",
                        tint = Color.Red, modifier = Modifier.size(30.dp).clickable{}
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                HorizontalDivider(thickness = 2.dp, color = Color.LightGray)

                Spacer(modifier = Modifier.height(16.dp))

                Row(modifier = Modifier.fillMaxWidth()) {

                    Row(modifier = Modifier.clickable{}) {
                        Icon(imageVector = Icons.Default.Info, contentDescription = "Gelme Dakikası",
                            tint = Color(0xFFF49D0A)
                        )
                        Text("45 Dakika", fontWeight = FontWeight.W500,
                            modifier = Modifier.padding(start = 8.dp))
                    }

                    Spacer(modifier = Modifier.width(40.dp))

                    Row(modifier = Modifier.clickable{}) {
                        Icon(imageVector = Icons.Default.StarRate, contentDescription = "Yıldız",
                        tint = Color(0xFFF49D0A)
                    )
                        Text("Orta",fontWeight = FontWeight.W500,
                            modifier = Modifier.padding(start = 8.dp))
                    }

                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF49D0A)),
                    modifier = Modifier.fillMaxWidth().height(50.dp)
                ) {
                    Text("Tarifi İncele", fontSize = 16.sp)
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

        }
    }
}