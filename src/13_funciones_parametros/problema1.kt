package `13_funciones_parametros`
/*
Desarrolla un programa en Kotlin que le pide al usuario ingresar una clave dos veces.
 El programa debe verificar si ambas entradas son iguales y mostrar un mensaje en consecuencia.

El programa consta de dos partes principales:
Una función llamada verificarClaves que recibe dos textos (las claves) y verifica si son iguales.


Una función principal main que pide al usuario que ingrese dos veces una clave y luego llama a
 verificarClaves para comprobar si ambas coinciden.
 */


fun verificarClaves (clave1: String, clave2: String ) {
    if (clave1 == clave2) {
        println("ambas claves son iguales")
} else {
        println("las claves son diferentes ")
    }
}

fun main() {
    println("ingrese la clave: ")
    val clave1 = readln()
    println("ingrese la clave nuevamente: ")
    val clave2 = readln()

    verificarClaves(clave2,clave1)
}
