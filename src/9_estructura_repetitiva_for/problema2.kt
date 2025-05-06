package `9_estructura_repetitiva_for`
/* Desarrollar un programa que solicite la carga de 10 números
e imprima la suma de los últimos 5 valores ingresados. */

fun main() {
    var suma = 0
    for (i in 1..10) {
        print("Ingrese un numero: ")
        val valor = readln().toInt()
        if (i > 5)
            suma = suma + valor
    }
    println("la suma de los ultimos 5 digitos son:$suma")
}
