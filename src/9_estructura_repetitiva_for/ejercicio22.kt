package `9_estructura_repetitiva_for`
/*
desarrollar un rpograma que permite la carga de 10 valores teclado y muestre
 */
fun main() {
    var suma = 0
    for (i in 1..100) {
        print("ingrese un valor: ")
       val valor = readln().toInt()
        suma += valor

    }
    println("La suma de los valore es $suma")
    val promedio = suma /10
    println("su promedio es $promedio")

}