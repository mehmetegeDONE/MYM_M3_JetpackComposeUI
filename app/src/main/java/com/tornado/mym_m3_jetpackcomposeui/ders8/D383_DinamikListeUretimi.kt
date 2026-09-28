package com.tornado.mym_m3_jetpackcomposeui.ders8

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun D383_DinamikListeUretimi(){

    val gorevler = listOf("Market alışverişi yap", "Faturaları öde", "Kediyi besle", "Spora git")

    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),

    ) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(space = 12.dp),
        ) {
            item {
                Text("Yapılacaklar Listesi")
            }

            items(gorevler){ gorev ->
                Card(modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF03A9F4)),
                    shape = RoundedCornerShape(size = 16.dp)
                ) {
                    Text(gorev, modifier = Modifier.padding(12.dp))
                }
            }
        }
    }
}