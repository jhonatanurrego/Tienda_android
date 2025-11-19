package com.ecommerce.miaplicacion

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Producto (
    @DrawableRes val imagen: Int,
    @StringRes val nombre: Int,
    val precio: Int
)

class DataSource {
    object DataSource{
        val productos = listOf(
            Producto(R.drawable.doublesidejacket, R.string.nombreImagen_1, 24),
            Producto(R.drawable.doublesidejacket, R.string.nombreImagen_2, 40),
            Producto(R.drawable.doublesidejacket, R.string.nombreImagen_3, 30),
            Producto(R.drawable.doublesidejacket, R.string.nombreImagen_4, 60),
            Producto(R.drawable.doublesidejacket, R.string.nombreImagen_5, 90),
            Producto(R.drawable.doublesidejacket, R.string.nombreImagen_6, 100)
        )
    }

}