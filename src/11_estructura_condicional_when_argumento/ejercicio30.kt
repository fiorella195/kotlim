package `11_estructura_condicional_when_argumento`
/*
ingresar un valor entero
 */
fun main() {
    print("ingrese un valor etero entre 1 y 5: ")
    val valor = readln().toInt()
    when (valor) {
        1 -> print("uno")
        2 -> print("dos")
        3 -> print("tres")
        4 -> print("cuatro")
        5 -> print("cinco")
        else -> println()
    }
}