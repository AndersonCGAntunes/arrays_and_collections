package com.digitalinovation.collections

fun main() {
    val nomes = Array( 3 ) { "" }
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "José"

    for ( nome in nomes ) {
        println( nome )
    }

    nomes.sort()

    println( "||" )

    nomes.forEach { println( it ) }

    println( "||" )

    val nomes2 = arrayOf( "Maria", "Zazá", "Pedro" )
    nomes2.sort()
    nomes2.forEach { println( it ) }
}