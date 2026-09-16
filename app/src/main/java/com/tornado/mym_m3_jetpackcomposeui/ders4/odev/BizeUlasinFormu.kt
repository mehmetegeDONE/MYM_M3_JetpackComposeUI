package com.tornado.mym_m3_jetpackcomposeui.ders4.odev

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants

@Composable
fun BizeUlasinFormu(){

    var ad by rememberSaveable() { mutableStateOf("") }
    var eposta by rememberSaveable() {mutableStateOf("") }
    var telNo by rememberSaveable() {mutableStateOf("") }
    var mesaj by rememberSaveable() {mutableStateOf("") }
    var mesajFokusta by rememberSaveable() {mutableStateOf(false) }
    var girisBasarili by rememberSaveable() {mutableStateOf(false) }

    Column(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize()
        .padding(24.dp)
    ) {

        Text("Bize Ulaşın",
            fontSize = 28.sp, color = Color(0xFF2F7738), fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField( modifier = Modifier.fillMaxWidth(),
            value = ad,
            onValueChange = {yeniAd -> ad = yeniAd},
            label = {Text("Adınız Soyadınız")},
            singleLine = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField( modifier = Modifier.fillMaxWidth(),
            value = eposta,
            onValueChange = {yeniEposta -> eposta = yeniEposta},
            label = {Text("E-posta Adresiniz")},
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField( modifier = Modifier.fillMaxWidth(),
            value = telNo,
            onValueChange = {yeniTelNo -> telNo = yeniTelNo},
            label = {Text("Telefon Numaranız")},
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone,
                imeAction = ImeAction.Next
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth().height(150.dp)
                .onFocusChanged{yeniFokus -> mesajFokusta = yeniFokus.isFocused},
            colors = OutlinedTextFieldDefaults.colors(
                focusedLabelColor = Color(0xFF2F7738), focusedBorderColor = Color(0xFF657900)
            ),
            value = mesaj,
            onValueChange = {yeniMesaj -> mesaj = yeniMesaj},
            prefix = {Text("Mesajım:")},
            supportingText = {
                if (mesajFokusta){
                Text("Mesajını lütfen saygı çerçevesinde yap 🙂")
            }},
            label = {Text("Mesajınız")},
            singleLine = false,
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done
            )
        )

        Spacer(modifier = Modifier.height(35.dp))

        Button(
            onClick = {
                if (ad.isNotEmpty() && eposta.isNotEmpty() && mesaj.isNotEmpty() && telNo.isNotEmpty()){
                    girisBasarili = true
                }
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF51)),
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text("Mesajı Gönder", fontSize = 18.sp)
        }

        if (girisBasarili){
            Spacer(modifier = Modifier.height(35.dp))
            Text("Mesajın gönderildi!", fontSize = 18.sp, color = Color(0xFF4CAF51),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
    }
}