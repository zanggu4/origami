package xyz.hyeonjae.origami.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import xyz.hyeonjae.origami.R
import xyz.hyeonjae.origami.ui.viewdata.PaperCardViewData
import kotlin.math.ceil

@Composable
fun PaperCard(
    viewData: PaperCardViewData
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent, // 배경색 투명
        ),
        elevation = null, // 그림자 제거
        contentPadding = PaddingValues(8.dp), // 패딩 제거
        shape = RectangleShape,
        onClick = {},
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            AsyncImage(
                model = viewData.image,
                placeholder = ColorPainter(Color.LightGray),
                error = ColorPainter(Color.LightGray),
                contentDescription = null,
                modifier = Modifier
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(12.dp)),
            )
            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text(
                    text = viewData.name,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400,
                    color = Color(0x1D, 0x1B, 0x20),
                )
                Text(
                    text = viewData.description,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    color = Color(0x49, 0x45, 0x4F),
                )
                Row(horizontalArrangement = Arrangement.spacedBy(1.dp)) {
                    for (i in 0 until ceil(viewData.rating).toInt()) {
                        Image(
                            painterResource(R.drawable.ic_rating),
                            contentDescription = null,
                            modifier = Modifier.width(12.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun PaperCardPreView() {
    PaperCard(PaperCardViewData.sample)
}