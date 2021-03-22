package com.digitalinovation.collections

fun main() {
    val joao = Funcionario( "João", 2000.0, "CLT" )
    val pedro = Funcionario( "Pedro", 1500.0, "PJ" )
    val maria = Funcionario( "Maria", 4000.0, "CLT" )

    println( "$SEPARADOR cria lista com João e Maria" )
    val funcionarios = mutableListOf( joao, maria )
    funcionarios.forEach { println( it ) }

    println( "$SEPARADOR inclui Pedro" )
    funcionarios.add( pedro )
    funcionarios.forEach { println( it ) }

    println( "$SEPARADOR remove João" )
    funcionarios.remove( joao )
    funcionarios.forEach { println( it ) }

    println( "$SEPARADOR cria nova lista com João" )
    val funcionariosSet = mutableSetOf( joao )
    funcionariosSet.forEach { println( it ) }

    println( "$SEPARADOR adiciona Pedro e Maria à lista" )
    funcionariosSet.add( pedro )
    funcionariosSet.add( maria )
    funcionariosSet.forEach { println( it ) }

    println( "$SEPARADOR remove a Maria" )

    funcionariosSet.remove( maria )
    funcionariosSet.forEach { println( it ) }
}