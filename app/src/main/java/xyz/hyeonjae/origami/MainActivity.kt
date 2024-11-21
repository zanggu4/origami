package xyz.hyeonjae.origami

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.hyeonjae.origami.ui.theme.OrigamiTheme
import xyz.hyeonjae.origami.ui.components.OrigamiScaffold
import xyz.hyeonjae.origami.ui.components.PaperCard
import xyz.hyeonjae.origami.ui.viewdata.PaperCardViewData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OrigamiTheme {
                OrigamiScaffold(title = "종이접기") {
                    Body(modifier = Modifier.padding(it))
                }
            }
        }
    }

    @Composable
    private fun Body(modifier: Modifier = Modifier) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2), // 2열 고정 그리드
            modifier = modifier,
            contentPadding = PaddingValues(8.dp)

        ) {
            items(count = 1000) { index ->
                PaperCard(PaperCardViewData.sample)
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun Preview() {
        OrigamiTheme {
            OrigamiScaffold(title = "종이접기") {
                Body(modifier = Modifier.padding(it))
            }
        }
    }
}

