package `25_POO_Moificadores_private_y_public`

import `24_POO_colaboración_clases`.dado

class dado {
    private var valor: Int = 1

    fun tirar () {
        valor = ((Math.random() * 6 ) + 1).toInt()

    }

    fun imprimir () {
        separador()
        println("valor del dado: $valor")
        separador()

    }

    private fun separador() = println("*************************************************")


}

fun main () {
    val dado1 = dado()
    dado1.tirar()
    dado1.imprimir()


}
