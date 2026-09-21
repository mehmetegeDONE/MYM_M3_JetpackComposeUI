package com.tornado.mym_m3_jetpackcomposeui.proje

import android.R
import android.graphics.Paint
import android.widget.Space
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun projeKullaniciKayitSistemi(){

    var adSoyad by rememberSaveable() { mutableStateOf("") }
    var eposta by rememberSaveable() { mutableStateOf("") }
    var sifre by rememberSaveable() { mutableStateOf("") }
    var yas by rememberSaveable() { mutableStateOf("") }
    var girisYapildi by rememberSaveable() { mutableStateOf(false) }
    var focustaMi by rememberSaveable() { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .background(Color(0xFFF8F9FA))
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF2196F3), shape = RoundedCornerShape(12.dp))
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text("Aramıza Katılın",
                    fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White)

                Spacer(modifier = Modifier.height(8.dp))

                Text("Lütfen bilgilerini eksiksiz doldurun.",
                    fontSize = 14.sp, color = Color(0xFFE3F2FD))
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = adSoyad,
            onValueChange = {adSoyad = it},
            label = {Text("Ad Soyad")},
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            ),
            colors = OutlinedTextFieldDefaults.colors(focusedLabelColor = Color(0xFF2194F0))
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = eposta,
            onValueChange = {eposta = it},
            label = {Text("E posta")},
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            ),
            colors = OutlinedTextFieldDefaults.colors(focusedLabelColor = Color(0xFF2194F0))
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth()
                .onFocusChanged{yeniFokus -> focustaMi = yeniFokus.isFocused},
            value = sifre,
            onValueChange = {sifre = it},
            label = {Text("Şifre")},
            singleLine = true,
            supportingText = {
                if (focustaMi){
                    Text("Lüften şifrenizi başkalarıyla paylaşmayın.")}
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedSupportingTextColor = Color(0xFFFF0033), focusedLabelColor = Color(0xFF2194F0)
            )
            ,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Next
            )
        )

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = yas,
            onValueChange = {yas = it},
            label = {Text("Yaşınız")},
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            colors = OutlinedTextFieldDefaults.colors(focusedLabelColor = Color(0xFF2194F0))
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {

                if (adSoyad.isNotEmpty() && eposta.isNotEmpty() && sifre.isNotEmpty() && yas.isNotEmpty()){
                    girisYapildi = true
                }
            },
            colors = ButtonDefaults.buttonColors(Color(0xFF4CAF50)),
            shape = RoundedCornerShape(18.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Text("Hesap Oluştur", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        }

        if (girisYapildi){
            Spacer(modifier = Modifier.height(16.dp))
            Text("Kayıt başarıyla oluşturuldu.",
                modifier = Modifier.fillMaxWidth()
                , color = Color(0xFF4CAD50), textAlign = TextAlign.Center, fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.weight(1f))

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Text("Zaten hesabınız var mı?",color = Color.Gray, modifier = Modifier.clickable{})
            Spacer(modifier = Modifier.width(16.dp))
            Text("Giris Yap", color = Color(0xFF2194F0), fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable{})
        }

        Spacer(modifier = Modifier.height(16.dp))

    }
}