package com.digitalinovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println( SEPARADOR )
    println( salarios.somatoria() )

    println( SEPARADOR )
    println( salarios.media() )
}