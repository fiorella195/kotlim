package `8_estructura_repetitiva_doWhile`
/*
realizar un programa que permita ingresar
el peso (en kilogramos) de piezas. El proceso termina cuando ingresa el valor de 0

se debe informar:

1. cuantas piezas tiene un peso 9.8kg y 10.2 kg, cuanatas con mas de 10, 2y cuantas con menos de 9,8
2. la cantidad total de piezas procesadas
 */
fun main() {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do {
        print("ingrese el peso de la pieza (0 para finalizar): ")
        val peso = readln().toDouble()
        if (peso > 10.2 )
            cant1++
        else
            if (peso >= 9.8)
                cant2++
            else
                if (peso > 0 )
                    cant3++
    }while (peso != 0.0)
    println("piezas aptas: $cant2")
    println("piezas con peso superior a 10.2: $cant1")
    println("piezas con un peso inferior a 9.8: $cant3")
    val suma = cant1 + cant2 + cant3
    println("cantidad total de piezas procesadas: $suma ")


}