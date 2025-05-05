package `9_estructura_repetitiva_for`
/* Desarrollar un programa que muestre la tabla de
multiplicar del 5 (del 5 al 50)
 */

fun main() {
    var mult5 = 0
    for (i in 5 .. 50) {
        val resultado = 5 * i
        println("5 * $i = $resultado")
    }
}
