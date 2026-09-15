package com.tornado.mym_m3_jetpackcomposeui.ders3

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.max

@Composable
fun D336_GununSozu() {

    Column( modifier = Modifier
        .background(color = Color(0xFFF3F4F6))
        .fillMaxSize()
        .padding(all = 24.dp)
    ) {

        Column(
            modifier = Modifier
                .background(color = Color.White, shape = RoundedCornerShape(12.dp))
                .border(width = 1.dp, color = Color(0xFFB4B4B4), shape = RoundedCornerShape(12.dp))
                .fillMaxWidth()
                .padding(all = 24.dp)
        ) {
            Text("✨ Günün Sözü",
                color = Color(0xFFD946EF), fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("\"Dün zekiydim, dünyayı değiştirmek isterdim. Bugün bilgeyim, kendimi değiştiriyorum.\"",
                fontStyle = FontStyle.Italic, fontWeight = FontWeight.Medium, fontSize = 24.sp, lineHeight = 32.sp)
            Text("Mevlana Celaleddin-i Rumi’ye atfedilen bu harika söz," +
                " değişimin önce insanın kendi içinde başlaması gerektiğini anlatır." +
                "Kişisel gelişimin en temel kuralıdır.",
                modifier = Modifier.padding(top = 10.dp),
                fontSize = 14.sp, color = Color(0xFF7C7C7C), maxLines = 2, overflow = TextOverflow.Ellipsis,
                lineHeight = 15.sp
            )
            Text("- Mevlana", modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
                fontSize = 16.sp,color = Color(0xFFB4B4B4), textAlign = TextAlign.End)

            Spacer(modifier = Modifier.height(20.dp))

            HorizontalDivider(
                thickness = 1.dp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text("❤ 124 Beğeni (Tıklamak için dokunun)", fontSize = 15.sp,
                modifier = Modifier.clickable{}
                .background(Color(0xFFEFF3F7), shape = RoundedCornerShape(size = 15.dp))
                .padding(vertical = 15.dp)
                .padding(horizontal = 20.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.padding(top = 8.dp)
            ) {

                TextButton(onClick = {}) {
                    Text("Kaydet", color = Color(0xFF7C7C7C))
                }

                Spacer(modifier = Modifier.weight(1f))

                OutlinedButton(onClick = {}) {
                    Text("Kopyala", color = Color(0xFF7C7C7C))
                }
            }

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF525992)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp)
                    .padding(top = 8.dp)
            ) {
                Text("Paylaş", color = Color.White)
            }

        }
    }
}