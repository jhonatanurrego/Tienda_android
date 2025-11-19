package com.ecommerce.miaplicacion

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.navArgument
import com.ecommerce.miaplicacion.ui.theme.blanco
import kotlin.collections.get


@Composable
fun inicio(navController : NavController){
    app(navController)
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun app(navController: NavController){

    Scaffold(
        topBar = {
            // Barra superior con título
            TopAppBar(
                title = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.flechaatras),
                            contentDescription = "d",
                            modifier = Modifier
                                .size(20.dp)
                        )
                    }
                    Text(
                        "SHIRTS",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 11.dp),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF1f1f29),
                    titleContentColor = Color.White
                )
            )
        },
        bottomBar = {
            // Barra inferior vacía, reservada para futuros elementos
            BottomAppBar(
                containerColor = Color(0xFF383840),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.libro),
                            "icono",
                            modifier = Modifier
                                .padding(4.dp),
                            tint = Color.White
                        )
                    }
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.lupa),
                            "icono",
                            modifier = Modifier
                                .padding(4.dp),
                            tint = Color.White
                        )
                    }
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.corazon),
                            "icono",
                            modifier = Modifier
                                .padding(4.dp),
                            tint = Color.White
                        )
                    }
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.usuario),
                            "icono",
                            modifier = Modifier,
                            tint = Color.White
                        )
                    }
                }
            }
        },
        // Color de fondo general de la pantalla
        containerColor = Color(0xFF202028)
    ) { paddingValues ->
        ProductList(
            productList = DataSource.DataSource.productos,
            modifier = Modifier.padding(paddingValues),
            navController = navController

        )
    }
}


@Composable
fun ProductList(
    productList: List<Producto>,
    modifier: Modifier = Modifier,
    navController: NavController
){

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.padding(horizontal = 8.dp)
    ){
        items(items = productList){ producto ->
            ProductItem(
                producto = producto,
                onItemClick = {

                    navController.navigate(
                        "detalle/${producto.imagen}/${producto.nombre}/${producto.precio}"
                    )
                }
            )
        }
    }

}


