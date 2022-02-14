package com.shihab.composetoday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shihab.composetoday.ui.theme.ComposeTodayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxWidth(.5f)
                    .padding(24.dp)
            ) {
                ImageCard(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    conDescription = "description", title = "Hello Compose")
            }
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter, conDescription: String,
    title: String, modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15f), elevation = 5.dp,

        ) {
        Box(
            modifier = modifier
                .background(Color.White)
                .height(200.dp), contentAlignment = Alignment.Center

        ) {
            Image(
                painter = painter,
                contentDescription = conDescription,
                contentScale = ContentScale.Fit,
            )

            Box(
                modifier = Modifier
                    .fillMaxSize(1f)
                    .background(
                        brush = Brush.verticalGradient(
                            colors =
                            listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 400f
                        ),
                    )
            )

            Text(
                text = title,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(16.dp), fontSize = 16.sp, style = TextStyle(color = Color.White)
            )
        }
    }
}

@Composable
fun RowSample() {
    Row(
        modifier = Modifier
            .fillMaxWidth(1f)
            .fillMaxHeight(.3f)
            .background(Color.Green),
        // horizontalArrangement = Arrangement.SpaceEvenly,
        //   verticalAlignment = Alignment.CenterVertically

    ) {
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "Shihab", modifier = Modifier
            .padding(start = 20.dp)
            .clickable {

            })
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "Zara")
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "Maymuna")
    }
}

