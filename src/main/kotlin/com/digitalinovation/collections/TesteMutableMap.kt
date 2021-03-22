package com.digitalinovation.collections

fun main() {
    val joao = Funcionario( "João", 2000.0, "CLT" )
    val pedro = Funcionario( "Pedro", 1500.0, "PJ" )
    val maria = Funcionario( "Maria", 4000.0, "CLT" )

    val repositorio = Repositorio<Funcionario>()

    repositorio.create( joao.nome, joao )
    repositorio.create( pedro.nome, pedro )
    repositorio.create( maria.nome, maria )

    println( repositorio.findById( maria.nome ) )

    println( "$SEPARADOR imprime todos os itens" )

    repositorio.findAll().forEach{ println( it ) }

    println( "$SEPARADOR remove a Maria" )

    repositorio.remove( maria.nome )
    repositorio.findAll().forEach{ println( it ) }
}