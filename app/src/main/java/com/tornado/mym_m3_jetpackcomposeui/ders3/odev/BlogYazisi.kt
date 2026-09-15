package com.tornado.mym_m3_jetpackcomposeui.ders3.odev

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BlogYazisi(){

    Column( modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(all = 16.dp)

    ) {

        Text("Jetpack Compose ile Geleceğe Adım Atın", fontSize = 28.sp, fontWeight = FontWeight.Bold,
            color = Color(0xFF1E293B)
        )
        Spacer(modifier = Modifier.height(12.dp))

        Row() {
            Text("Yazar: Jane Doe",
                fontSize = 14.sp , textAlign = TextAlign.Start, modifier = Modifier.weight(1f),
                color = Color.Gray
            )
            Text("12 Ekim 2023",
                fontSize = 14.sp, textAlign = TextAlign.End, modifier = Modifier.weight(1f),
                color = Color.Gray
            )}

        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider(thickness = 1.dp, color = Color(0xFFE2E8F0))
        Spacer(modifier = Modifier.height(16.dp))


        Text("Jetpack Compose, Android UI geliştirme sürecini kökten değiştiren modern bir araç setidir." +
                " Geleneksel XML tabanlı arayüz geliştirme yöntemlerine kıyasla çok daha hızlı," +
                " reaktif ve Kotlin dilinin tüm gücünden faydalanan bir yapı sunar. Geliştiriciler" +
                " artık daha az kod yazarak çok daha karmaşık ve dinamik ekranlar " +
                "tasarlayabilmektedir. Özellikle state yönetimi ve animasyonlar " +
                "konusunda getirdiği yenilikler, mobil uygulama geliştirme standartlarını" +
                " tamamen yeniden belirlemiştir. Bu teknoloji sayesinde UI bileşenleri sadece" +
                " veriye göre şekillenmekle kalmaz, aynı zamanda kodun okunabilirliği ve bakımı" +
                " da büyük ölçüde kolaylaşır.",
            fontSize = 16.sp, maxLines = 4, overflow = TextOverflow.Ellipsis, color = Color(0xFF334155))

        Spacer(modifier = Modifier.height(8.dp))

        Text("Devamını Oku", color = Color(0xFF2563EB), fontSize = 16.sp, fontWeight = FontWeight.Medium,
            modifier = Modifier.clickable{})

        Spacer(modifier = Modifier.weight(1f))

        Row() {
            OutlinedButton(onClick = {},modifier = Modifier.weight(1f)) {
                Text("Daha Sonra Oku", modifier = Modifier.padding(vertical = 8.dp))
            }

            Spacer(modifier = Modifier.width(width = 16.dp))

            Button(onClick = {},modifier = Modifier.weight(1f)) {
                Text("Paylaş", modifier = Modifier.padding(vertical = 8.dp))
            }
        }
    }
}