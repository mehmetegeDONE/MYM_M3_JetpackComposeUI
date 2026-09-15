package com.tornado.mym_m3_jetpackcomposeui.ders3

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable // Ekrana basma..
fun D332_TextBileseni() {

    Column(modifier = Modifier.padding(24.dp)) {

        Text("JetPack Compose Ogreniyoruz.")

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Büyük Başlık", fontSize = 32.sp, color = Color.Red)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Bu metin uzun bir metindir." +
                " Özellikle uzun paragraflarda okumayı kolaylaştırmak" +
                " için lineHeight kullanılır", lineHeight = 36.sp )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Sağa dayalı metin.",
            textAlign = TextAlign.End,
            modifier = Modifier.fillMaxWidth()
            )

        Text(
            text = "Bu çok uzun bir sözdür ve normalde ekrana sığmayıp" +
                    " alt satırlara taşa taşa devam edecektir. " +
                    "Ancak biz onu sınırlayacağız.",
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.clickable{
                //Gerçekleşecek eylemler buraya yazılır
            }
        )


    }
}