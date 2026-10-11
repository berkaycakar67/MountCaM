package com.mountcam.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val forest = Color(0xFF193B2B)
private val leaf = Color(0xFF9CC5A0)
private val cream = Color(0xFFF7F7F2)
private val ink = Color(0xFF17251C)
private val muted = Color(0xFF66746B)
private val preview = Color(0xFFE9EEE8)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MountCamHome() }
    }
}

@Composable
private fun MountCamHome() {
    MaterialTheme(colorScheme = lightColorScheme(primary = forest, background = cream, surface = Color.White)) {
        Column(Modifier.fillMaxSize().background(cream).statusBarsPadding()) {
            Column(
                modifier = Modifier.fillMaxWidth().background(forest).padding(horizontal = 24.dp, vertical = 24.dp),
                verticalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Text("MountCaM", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 29.sp)
                Text("Fındık bahçesi kamera merkezi", color = Color(0xFFD6E5D9), fontSize = 14.sp)
            }
            Column(
                modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text("Kameralar", color = ink, fontWeight = FontWeight.Bold, fontSize = 23.sp)
                Text("Kamera bağlantısı henüz kurulmadı.", color = muted, fontSize = 14.sp)
                CameraCard("İç Kamera")
                CameraCard("Dış Kamera")
                Text(
                    "Canlı görüntü, PTZ ve kayıt özellikleri bağlantı entegrasyonundan sonra değerlendirilecek.",
                    color = muted,
                    fontSize = 12.sp,
                    lineHeight = 18.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}

@Composable
private fun CameraCard(name: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Box(
                modifier = Modifier.fillMaxWidth().height(172.dp)
                    .background(preview, RoundedCornerShape(14.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text("Önizleme bekleniyor", color = muted, fontSize = 14.sp)
            }
            Column(Modifier.padding(start = 6.dp, end = 6.dp, bottom = 8.dp)) {
                Text(name, color = ink, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                Spacer(Modifier.height(5.dp))
                Text("Bağlı değil", color = muted, fontSize = 13.sp)
            }
        }
    }
}
