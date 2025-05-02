package `8_estructura_repetitiva_doWhile`

fun main() {
    var opcion = 0
    do {
        println("Calculadora Básica")
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Salir")
        print("Seleccione una opción: ")
        opcion = readln().toIntOrNull() ?: 0

        if (opcion >=1 && opcion <= 4) {
            print("Ingrese el primer número: ")
            val num1 = readln().toDouble()
            print("Ingrese el segundo número: ")
            val num2 = readln().toDouble()

            if (num1 != null && num2 != null) {
                when (opcion) {
                    1 -> println("Resultado: $num1 + $num2")
                    2 -> println("Resultado: $num1 - $num2")
                    3 -> println("Resultado: $num1 * $num2")
                    4 -> {
                        if (num2 != 0.0) {
                            println("Resultado: ${num1 / num2}")
                        } else {
                            println("Error: División por cero.")
                        }
                    }
                }
            } else {
                println("Entrada inválida.")
            }
        } else if (opcion != 5) {
            println("Opción no válida.")
        }
    } while (opcion != 5)
    println("¡Hasta luego!")
}