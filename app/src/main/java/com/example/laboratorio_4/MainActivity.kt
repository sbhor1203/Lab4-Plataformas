package com.example.laboratorio_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio_4.ui.theme.Laboratorio_4Theme

class Settings : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio_4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Campus Central")
                }
            }
        }
    }
}



@Composable
fun Greeting(function: () -> Greeting) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.TopCenter)
            .verticalScroll(rememberScrollState())
            .padding(0.dp, 0.dp, 0.dp, 40.dp)
    ) {
        Text(
            text = "Campus Central",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth()

        )
        /// espacio entre box
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        val imageResId = R.drawable.imagen1
        Box{
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(align = Alignment.Center)
                    .size(width = 350.dp, height =200.dp)
            )
        }
    ///// segunda parte de la app
        Text(
            text ="DESTACADOS",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            fontSize = 20.sp,          // TAMAÑO DE LA LETRA
            modifier = Modifier.padding(20.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(20.dp),
            //horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card( //// ATRIBUTO CARTA PARA PRESENTACIÓN IGUAL
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
                ) {
                Column(
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth(1f)
                        .wrapContentSize(Alignment.Center),
                    ) {
                    Image(
                        painter = painterResource(R.drawable.imagen2),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(1f)
                            //.wrapContentSize(align = Alignment.Center)
                            //.size(width = 100.dp, height =100.dp)
                    )
                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )
                    Box(/////parte baja de la card
                        modifier = Modifier
                            .background(Color(0, 139, 0))
                            .fillMaxWidth(1f)
                            .padding(6.dp)
                    ){
                        Text(
                            text = "Service Now",
                            modifier = Modifier,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
            ) {
                Column(
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth(1f)
                        .wrapContentSize(Alignment.Center),
                    ) {
                    Image(
                        painter = painterResource(R.drawable.servicios),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                            .size(width = 100.dp, height =100.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(
                        modifier = Modifier
                            .background(Color(100, 100, 100))
                            .fillMaxWidth(1f)
                            .padding(6.dp)
                    ){
                        Text(
                            text = "Actualidad UVG",
                            modifier = Modifier,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }
        }

        Text(
            text ="SERVICIOS Y RECURSOS",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            fontSize = 20.sp,          // TAMAÑO DE LA LETRA
            modifier = Modifier.padding(20.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
                ) {
                Column(
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth(1f)
                        .wrapContentSize(Alignment.Center),
                    ) {
                    Image(
                        painter = painterResource(R.drawable.imagen4),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                        .size(width = 100.dp, height =100.dp)
                    )
                    Spacer(
                        modifier = Modifier.height(8.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0, 139, 0))
                            .fillMaxWidth(1f)
                            .padding(6.dp)
                    ){
                        Text(
                            text = "Directorio de Servicios Estudiantiles",
                            modifier = Modifier,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }

            Card(
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
                    .shadow(
                        elevation = 8.dp,
                        shape = MaterialTheme.shapes.medium
                    )
            ) {
                Column(
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth(1f)
                        .wrapContentSize(Alignment.Center),
                    ) {
                    Image(
                        painter = painterResource(R.drawable.imagen3),
                        contentDescription = "Directorio de Servicios Estudiantiles",
                        modifier = Modifier
                            .fillMaxWidth(1f),
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(
                        modifier = Modifier
                            .background(Color(100, 100, 100))
                            .fillMaxWidth(1f)
                            .padding(6.dp)
                    ){
                        Text(
                            text = "Portal Web Bibliotecas UVG",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting {
        Greeting("Campus Central")
    }
}

