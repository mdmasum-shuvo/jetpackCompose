package com.appinionbd.jepackcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()
            Column(
                modifier = Modifier
                    .background(Color(0xFFF2F2F2))
                    .fillMaxSize()
                    .verticalScroll(scrollState)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.happy_meal_small),
                    contentDescription = "description",
                    modifier = Modifier.height(250.dp),
                    contentScale = ContentScale.Crop
                )
                Column(modifier = Modifier.padding(24.dp)) {
                    Row (modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween){
                        Text(text = "happy meal", fontSize = 26.sp)
                        Text(
                            text = "$5.99", style = TextStyle(
                                color = Color.Green,
                            ),
                            fontSize = 16.sp,
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "800 calories", fontSize = 16.sp)
                    Spacer(modifier = Modifier.padding(top = 36.dp))
                    Button(onClick = { },
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                   ) {
                        Text(text = "Order now")
                    }
                }

            }
        }

    }
}


