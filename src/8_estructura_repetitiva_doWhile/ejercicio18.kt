package `8_estructura_repetitiva_doWhile`
 /* digite un numero del 0 al 999 hast que el resultado sea 0 */

fun main() {
    do {
        print("ingrese un valor comprendido entero entre el 0 y 999: " )
        val valor: Int = readln().toInt()
        if (valor < 10 )
            println("el valor ingresado tiene un digito")
        else
            if (valor < 100 )
                println("el valor ingresado tiene dos digitos")
            else
                println("el valor ingresado tiene tres digitos ")

    } while (valor != 0 )
}