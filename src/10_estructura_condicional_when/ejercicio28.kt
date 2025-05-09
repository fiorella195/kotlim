package `10_estructura_condicional_when`
/*
Realizar un programa que permita ingresar el peso (en kilogramos) de piezas. El proceso termina cuando ingresamos el valor 0.
Se debe informar:

a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cuántas con más de 10.2 Kg.? y cuántas con menos de 9.8 Kg.?

b) La cantidad total de piezas procesadas.
 */
fun main() {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do {
        print("ingrese el peso de la pieza (0 para finalizar): ")
        val peso = readln().toDouble()
        when {
            peso > 10.2 -> cant1++
            peso >= 9.8 -> cant2++
            peso > 0 -> cant3++

        }
    }while (peso != 0.0)
    println("piezas aptas: $cant2")
    println("piezas con peso superior a 10.2:$cant1")
    println("piezas con peso inferior a 9,8: $cant3")
    val suma = cant1 + cant2 + cant3
    println("cantidad total de piezas procesadas: $suma")


}