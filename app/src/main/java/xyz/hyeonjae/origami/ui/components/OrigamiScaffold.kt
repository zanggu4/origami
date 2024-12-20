package xyz.hyeonjae.origami.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import xyz.hyeonjae.origami.ui.theme.OrigamiTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrigamiScaffold(
    modifier: Modifier = Modifier,
    isAppBarHidden: Boolean = false,
    title: String? = null,
    content: @Composable (paddingValues: PaddingValues) -> Unit
) {
    OrigamiTheme {
        Scaffold(
            modifier = modifier
                .fillMaxSize(),
            topBar = {
                if (!isAppBarHidden) {
                    TopAppBar(
                        colors = TopAppBarDefaults.topAppBarColors(
                            containerColor = MaterialTheme.colorScheme.primaryContainer,
                            titleContentColor = MaterialTheme.colorScheme.primary,
                        ),
                        title = {
                            if (title != null) {
                                Text(
                                    text = title,
                                )
                            }
                        }
                    )
                }
            },
        ) { innerPadding ->
            content(innerPadding)
        }
    }
}
