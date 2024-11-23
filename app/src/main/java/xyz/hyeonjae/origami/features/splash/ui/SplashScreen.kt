package xyz.hyeonjae.origami.features.splash.ui

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.hyeonjae.origami.R
import xyz.hyeonjae.origami.ui.components.OrigamiScaffold
import xyz.hyeonjae.origami.ui.theme.OrigamiTheme

@Composable
fun SplashScreen() {
    OrigamiScaffold(isAppBarHidden = true) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "샘플이미지",
                modifier = Modifier.size(100.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SplashPreview() {
    SplashScreen()
}