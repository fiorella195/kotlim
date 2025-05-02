package `8_estructura_repetitiva_doWhile`
/* Realizar un programa que acumule (sume) valores ingresadosor
teclado hasta ingresar el 9999 (no sumar dicho valor,
 indica que ha finalizado la carga). Imprimir el valor
 acumulado e informar  si dicho valor es cero, mayor a cero
  o menor a cero.
 */

fun main() {
    do {
        print("ingrese un valor entero entre 0 y 9999: ")
        val valor: Int = readln().toInt()
        if (valor < 0)
            println("el valor es menor a cero")
        else
            if (valor < 10 )
                println("el valor tiene un digito")
            else
                if (valor < 100 )
                    println("el valor tiene 2 digitos")
                else
                    if (valor > 100)
                        println("el valor tiene 3 digitos")
                    else
                        if (valor > 1000 && valor > 9998)
                            println("tiene 4 digitos ")
    } while (valor != 9999)
    println("el programa a finalizado, el numero era 9999 ")
}

