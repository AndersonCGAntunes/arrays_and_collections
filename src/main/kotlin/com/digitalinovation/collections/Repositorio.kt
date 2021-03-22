package com.digitalinovation.collections

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create( id: String, value: T ) {

        // map.put( id, value ) ou a opção abaixo
        map[ id ] = value
    }

    fun remove( id: String ) = map.remove( id )

    fun findById( id: String ) = map[ id ]

    fun findAll() = map.values

}