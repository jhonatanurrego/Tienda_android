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
            Producto(R.drawable.doublesidejacket, R.string.nombreImagen_1, 132),
            Producto(R.drawable.jacketremovible, R.string.nombreImagen_2, 122),
            Producto(R.drawable.camisaslim, R.string.nombreImagen_3, 38),
            Producto(R.drawable.camisetabasica, R.string.nombreImagen_4, 33),
            Producto(R.drawable.poloclasica, R.string.nombreImagen_2, 46),
            Producto(R.drawable.bomber, R.string.nombreImagen_6, 70)
        )
    }

}