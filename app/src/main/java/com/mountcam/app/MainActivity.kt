package com.mountcam.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val forest = Color(0xFF91BD87)
private val charcoal = Color(0xFF101815)
private val panel = Color(0xFF1A2721)
private val muted = Color(0xFFADBBB2)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { HomeScreen() }
    }
}

@Composable
private fun HomeScreen() {
    MaterialTheme(colorScheme = darkColorScheme(background = charcoal, surface = panel, primary = forest)) {
        Column(
            modifier = Modifier.fillMaxSize().background(charcoal).statusBarsPadding().padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            Text("MountCaM", color = Color.White, fontSize = 30.sp, fontWeight = FontWeight.Bold)
            Text("Fındık bahçesi kamera merkezi", color = muted)
            Text("Demo ekranı · Kamera bağlantısı henüz kurulmadı", color = forest, fontSize = 12.sp)
            CameraCard("İç Kamera")
            CameraCard("Dış Kamera")
            Spacer(Modifier.weight(1f))
            Text("PTZ ve kayıtlar, bağlantı testi sonrası eklenecek.", color = muted, fontSize = 12.sp)
        }
    }
}

@Composable
private fun CameraCard(name: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = panel)
    ) {
        Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Box(
                modifier = Modifier.fillMaxWidth().height(155.dp).background(charcoal, RoundedCornerShape(12.dp)),
                contentAlignment = Alignment.Center
            ) { Text("Önizleme bekleniyor", color = muted) }
            Text(name, color = Color.White, fontSize = 19.sp, fontWeight = FontWeight.SemiBold)
            Text("Bağlı değil", color = muted, fontSize = 13.sp)
        }
    }
}
