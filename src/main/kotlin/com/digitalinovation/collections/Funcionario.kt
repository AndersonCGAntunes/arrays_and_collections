package com.digitalinovation.collections

data class Funcionario (
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            nome:               $nome
            salario:            $salario
            tipoContratacao:    $tipoContratacao
        """.trimIndent()
}