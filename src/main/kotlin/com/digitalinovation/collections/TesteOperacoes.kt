package com.digitalinovation.collections

const val ESPACADOR = "-------------------"

fun main() {
    val salarios = doubleArrayOf( 1400.0, 2500.0, 4000.0 )

    for ( salario in salarios ) {
        println( salario )
    }

    println( ESPACADOR )

    println( "Maior salário: ${ salarios.maxOrNull() }" )
    println( "Menor salário: ${ salarios.minOrNull() }" )
    println( "Media salarial: ${ salarios.average() }" )

    println( ESPACADOR )

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }

    salariosMaiorQue2500.forEach { println( it ) }

    println( ESPACADOR )

    println( salarios.count{ it in 2000.0..50000.0 } )

    println( ESPACADOR )

    println( salarios.find { it == 2500.0 } )
    println( salarios.find { it == 500.0 } )

    println( ESPACADOR )

    println( salarios.any { it == 1400.0 } )
    println( salarios.any { it == 500.0 } )

}