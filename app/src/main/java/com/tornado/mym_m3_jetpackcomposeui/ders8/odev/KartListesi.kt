package com.tornado.mym_m3_jetpackcomposeui.ders8.odev

import android.graphics.Paint.Align
import android.graphics.Paint.Style
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.onInterceptKeyBeforeSoftKeyboard
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent

@Composable
fun KartListesi(){

    Column(modifier = Modifier
        .background(color = Color(0xFFF1F3F5))
        .fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.padding(32.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {
            item {
                Text("Son Yazılar", color = Color(0xFF1F2937), fontSize = 30.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(20.dp))
            }

            items(yaziListesi){ yazi ->
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.cardElevation(4.dp),
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(yazi.baslik,
                            color = Color(0xFF111827),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold)

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(yazi.icerik, color = Color(0xFF4B5563), fontSize = 15.sp)

                        Spacer(modifier = Modifier.height(16.dp))

                        Row(modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            ) {
                            Text("Yazar: ${yazi.yazar}",
                                color = Color(0xFF9CA3AF),
                                fontSize = 14.sp,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Medium,
                                textAlign = TextAlign.Start)

                            Spacer(modifier = Modifier.weight(1f))

                            IconButton(onClick = {})
                            {
                                Icon(contentDescription = "Favoriye Ekle",
                                    imageVector = Icons.Outlined.FavoriteBorder,
                                    tint = Color(0xFFEF4444)
                                )
                            }

                            IconButton(onClick = {})
                            {
                                Icon(contentDescription = "Paylaş",
                                    imageVector = Icons.Outlined.Share,
                                    tint = Color.Gray
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}