package com.atilsamancioglu.statemanagementcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OtherScreen() {
    Surface(color = Color.LightGray) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            var myString = remember { mutableStateOf("Android Compose") }

            TextField(value = myString.value,onValueChange = {
                myString.value = it
                println(myString.value)
            })

            Spacer(modifier = Modifier.padding(7.dp))

            var textString = remember { mutableStateOf("Hello") }

            Text(text = textString.value,
                fontSize = 26.sp
            )

            Spacer(modifier = Modifier.padding(7.dp))

            Button(onClick = {
                textString.value = "Android"
            }) {
                Text(text = "Button")
                Text(text = "Test")
            }

            Spacer(modifier = Modifier.padding(7.dp))

            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.metallica),
                contentDescription = "metallica")

            Spacer(modifier = Modifier.padding(7.dp))

            Image(imageVector = ImageVector.vectorResource(
                id = R.drawable.ic_launcher_foreground),
                contentDescription =null )

            Spacer(modifier = Modifier.padding(7.dp))

            Image(painter = ColorPainter(Color.Black),
                contentDescription = null,
                modifier = Modifier.size(20.dp,20.dp)
            )

        }
    }

}
