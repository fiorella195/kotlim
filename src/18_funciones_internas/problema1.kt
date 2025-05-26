package `18_funciones_internas`
/*
Confeccionar una función que permita cargar dos enteros y
nos muestre el mayor de ellos.
Realizar esta actividad con 5 pares de valores.
Implementar una función interna que retorne el mayor de dos enteros.
 */

fun MostarMayores () {
    fun mayor (val1: Int, val2: Int): Int {
        return if (val1 > val2) {
            return val1
        } else{
            return val2
        }
    }
        for (i in 1..5){
            println("Ingrese primer numero: ")
            val num1 = readln().toInt()
            print("Ingrese segundo número: ")
            val num2 = readln().toInt()
            val max = mayor (num1, num2)
            println("el mayor es: $max")
    }
}

fun main() {
    MostarMayores()
}

