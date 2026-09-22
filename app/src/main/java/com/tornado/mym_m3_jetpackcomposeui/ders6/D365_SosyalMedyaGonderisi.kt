package com.tornado.mym_m3_jetpackcomposeui.ders6

import androidx.compose.animation.veilOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tornado.mym_m3_jetpackcomposeui.R
import kotlinx.coroutines.channels.ticker

@Composable
fun D365_SosyalMedyaGonderisi(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0xFFF8F9FA))
        .padding(24.dp)) {

        Card(colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
            border = BorderStroke(1.dp, color = Color.LightGray),
        ) {

            Column(modifier = Modifier.padding(24.dp)) {
                Row() {
                    Box(modifier = Modifier) {
                        Image(
                            painter = painterResource(R.drawable.profil_resmi),
                            contentDescription = "Profil",
                            modifier = Modifier
                                .clip(shape = CircleShape)
                                .size(65.dp)
                        )
                    }

                    Column(
                        modifier = Modifier.padding(start = 16.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text("Zeynep Yılmaz", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(5.dp))
                        Text("UI/UX Tasarımcı - 2 Saat önce", fontSize = 16.sp, color = Color.Gray)
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text("Bugün Compose ile gölgeli kartlar ve yuvarlak görseller yapmayı öğreniyoruz." +
                        " Harika bir deneyim! \uD83C\uDFA8✨",
                    fontSize = 17.sp, fontWeight = FontWeight.W500)

                Spacer(modifier = Modifier.height(16.dp))

                HorizontalDivider(thickness = 2.dp, color = Color.LightGray)

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {

                    var favoriIconRenk = Color.Gray

                    Row(modifier = Modifier.clickable{}) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorile",
                            tint = favoriIconRenk,
                            modifier = Modifier.size(27.dp)
                        )
                        Text("124", fontSize = 19.sp, color = Color.Gray,
                            modifier = Modifier
                                .padding(horizontal = 8.dp)
                                .padding(vertical = 2.dp))
                    }

                    Row(modifier = Modifier.clickable{}) {
                        Icon(
                            imageVector = Icons.Default.AddComment,
                            contentDescription = "Yorum At",
                            tint = Color.Gray,
                            modifier = Modifier.size(27.dp)
                        )
                        Text("Yorum", fontSize = 19.sp, color = Color.Gray,
                            modifier = Modifier
                                .padding(horizontal = 8.dp)
                                .padding(vertical = 2.dp))
                    }

                    Row(modifier = Modifier.clickable{}) {
                        Icon(
                            imageVector = Icons.Default.Share,
                            contentDescription = "Paylaş",
                            tint = Color.Gray,
                            modifier = Modifier.size(27.dp)
                        )
                        Text("Paylaş", fontSize = 19.sp, color = Color.Gray,
                            modifier = Modifier
                                .padding(horizontal = 8.dp)
                                .padding(vertical = 2.dp))
                    }


                }
            }





        }
    }
}