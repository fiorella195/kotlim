package `23_POO_metodos`

import `20_funciones_tipo_arreglo`.sumar

class operaciones {
    var valor1: Int = 0
    var valor2: Int = 0

    fun cargar() {
        println("ingrese primer valor: ")
        valor1 = readln().toInt()
        println("ingrese segundo valor: ")
        valor2 = readln().toInt()
        sumar()
        restrar()

    }

    fun sumar() {
        val suma = valor1 + valor2
        println("La suma de $valor1 y $valor2 es $suma")
    }

    fun restrar() {
    val resta = valor1 - valor2
    println("la resta de $valor1 y $valor2 es $resta")

    }
}

fun main() {
    val operaciones1 = operaciones()
    operaciones1.cargar()

}