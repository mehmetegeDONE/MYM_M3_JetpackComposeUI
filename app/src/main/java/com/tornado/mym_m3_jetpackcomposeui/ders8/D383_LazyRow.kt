package com.tornado.mym_m3_jetpackcomposeui.ders8

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun D383_LazyRow(){

    Column() {
        LazyRow(
            contentPadding = PaddingValues(12.dp),
            horizontalArrangement = Arrangement.spacedBy(space = 8.dp)
        ) {
            items(15){ i ->

                Card(
                    modifier = Modifier.width(100.dp).height(100.dp).background(Color.LightGray)
                ) {
                    Box(
                    ) {
                        Text("Madde $i")
                        Spacer(modifier = Modifier.width(8.dp))
                    }

                }
            }
        }
    }
}