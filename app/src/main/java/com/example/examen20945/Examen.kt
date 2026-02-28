package com.example.examen20945

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable

fun consola(){
    val nombrePersonaje = remember { mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxSize() //Hace que la columna ocupe todo el alto y ancho
            .background(color = Color(0xFF2DB1CD))
            .padding(8.dp), //Para que el contenido no pegue a las orillas
        horizontalAlignment = Alignment.CenterHorizontally // Centra todo el contenido
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp, horizontal = 120.dp)
            ,horizontalArrangement = Arrangement.spacedBy(200.dp)
            ,verticalAlignment = Alignment.CenterVertically
        ){
            Button(onClick = {""},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2DB1CD))
            ) {

                Image(painter = painterResource(R.drawable.power),
                    modifier = Modifier.size(30.dp),
                    contentScale = ContentScale.Crop,
                    contentDescription = null)
            }
        }
    }
    Spacer(modifier = Modifier.height(100.dp))
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.height(100.dp))
        Box(modifier = Modifier.size(350.dp).background(color = Color.Black, shape = RoundedCornerShape(15.dp)),
            contentAlignment = Alignment.Center)
        {
            Column(

            ) {}
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(100.dp))
            Column() {
                Text(
                    text= "Seleccione un personaje",
                    color = Color.Yellow,
                    fontSize = 18.sp
                )
                TextField(
                    value = nombrePersonaje.value,
                    onValueChange = {nombrePersonaje.value = it},
                    modifier = Modifier.width(150.dp).height(46.dp),
                    shape = RoundedCornerShape(2.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        cursorColor = Color.Black,
                        focusedPlaceholderColor = Color.Gray
                    ))
            }

        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(R.drawable.left_arrow),
                modifier = Modifier.size(30.dp),
                contentScale = ContentScale.Crop,
                contentDescription = null)
            Column() {
                Image(painter = painterResource(R.drawable.up_arrow),
                    modifier = Modifier.size(30.dp),
                    contentScale = ContentScale.Crop,
                    contentDescription = null)
                Spacer(modifier = Modifier.height(10.dp))
                Image(painter = painterResource(R.drawable.down_arrow),
                    modifier = Modifier.size(30.dp),
                    contentScale = ContentScale.Crop,
                    contentDescription = null)
            }
            Image(painter = painterResource(R.drawable.right_arrow),
                modifier = Modifier.size(30.dp),
                contentScale = ContentScale.Crop,
                contentDescription = null)
            Button(onClick = {""},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0D45B4)),
                shape = RoundedCornerShape(70.dp),
            ){Text(text = "A")}
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = {""},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0D45B4)),
                shape = RoundedCornerShape(70.dp),
            ){Text(text = "B")}

    }

        Spacer(modifier = Modifier.height(170.dp))
        Text(text = "Nientiendo ISND 5Ds", color = Color.White, fontSize = 18.sp,textAlign = TextAlign.Center)
    }}

@Composable
fun Celdas(numero: String,colorFondo: Color,colorTexto: Color){
    Box(modifier = Modifier.size(77.dp).background(color = colorFondo, shape = RoundedCornerShape(8.dp)),contentAlignment = Alignment.Center){
        Text(numero, fontSize = 30.sp, fontWeight = FontWeight.Bold, color = colorTexto)
    }

}