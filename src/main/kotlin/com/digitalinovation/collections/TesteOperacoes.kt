package com.digitalinovation.collections

fun main() {
    val salarios = doubleArrayOf( 1400.0, 2500.0, 4000.0 )

    for ( salario in salarios ) {
        println( salario )
    }

    println( "||" )

    println( "Maior salário: ${ salarios.maxOrNull() }" )
    println( "Menor salário: ${ salarios.minOrNull() }" )
    println( "Media salarial: ${ salarios.average() }" )

    println( "||" )

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }

    salariosMaiorQue2500.forEach { println( it ) }

}