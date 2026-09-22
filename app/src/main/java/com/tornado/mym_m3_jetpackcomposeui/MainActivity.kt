package com.tornado.mym_m3_jetpackcomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.tornado.mym_m3_jetpackcomposeui.ders1.SelamlamaEkrani
import com.tornado.mym_m3_jetpackcomposeui.ders2.D322_TemelDizilimler
import com.tornado.mym_m3_jetpackcomposeui.ders2.D326_ProfilKarti
import com.tornado.mym_m3_jetpackcomposeui.ders2.odev.UrunGosterici
import com.tornado.mym_m3_jetpackcomposeui.ders3.D332_TextBileseni
import com.tornado.mym_m3_jetpackcomposeui.ders3.D333_ButtonCesitleri
import com.tornado.mym_m3_jetpackcomposeui.ders3.D336_GununSozu
import com.tornado.mym_m3_jetpackcomposeui.ders3.odev.BlogYazisi
import com.tornado.mym_m3_jetpackcomposeui.ders4.D344_KullanicidanVeriAlma
import com.tornado.mym_m3_jetpackcomposeui.ders4.D345_GirisYapEkrani
import com.tornado.mym_m3_jetpackcomposeui.ders4.odev.BizeUlasinFormu
import com.tornado.mym_m3_jetpackcomposeui.ders6.D362_ResimEkleme
import com.tornado.mym_m3_jetpackcomposeui.ders6.D363_IconEkleme
import com.tornado.mym_m3_jetpackcomposeui.ders6.D364_KartEkleme
import com.tornado.mym_m3_jetpackcomposeui.ders6.D365_SosyalMedyaGonderisi
import com.tornado.mym_m3_jetpackcomposeui.ders6.odev.YemekTarifKarti
import com.tornado.mym_m3_jetpackcomposeui.proje.projeKullaniciKayitSistemi
import com.tornado.mym_m3_jetpackcomposeui.ui.theme.MYM_M3_JetpackComposeUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // Main metot
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { // setContent bloğu, ekrana çizilecek Compose içeriğini (temamızı ve iskeletimizi) tanımlar
            MYM_M3_JetpackComposeUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        // O anki dersin ana ekranını buraya yazacağız.

                        // DERS-1
                        // SelamlamaEkrani()

                        // DERS-2
                        // D322_TemelDizilimler()
                        // D326_ProfilKarti()
                        // UrunGosterici()

                        // DERS-3
                        // D332_TextBileseni()
                        // D333_ButtonCesitleri()
                        // D336_GununSozu()
                        // BlogYazisi()

                        // DERS-4
                        // D344_KullanicidanVeriAlma()
                        // D345_GirisYapEkrani()
                        // BizeUlasinFormu()
                        // projeKullaniciKayitSistemi()

                        // DERS-6
                        // D362_ResimEkleme()
                        // D363_IconEkleme()
                        // D364_KartEkleme()
                        // D365_SosyalMedyaGonderisi()
                        YemekTarifKarti()
                    }
                }
            }
        }
    }
}


