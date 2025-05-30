package `19_Arreglos`
/*
Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe:
El valor acumulado de todos los elementos.
El valor acumulado de los elementos que sean mayores a 36.
Cantidad de valores mayores a 50.
(Definir dos for, en el primero realizar la carga y en el segundo proceder a analizar
cada elemento)
 */

fun main() {
    val numeros = IntArray(8)
    var suma = 0
    var sumaMayores36 = 0
    var cantidadMayores50 = 0

    for (i in 0 .. numeros.size - 1) {
        print("ingrese un numero: ")
        numeros[i] = readln().toInt()
        suma += numeros[i]
    }

    for (i in 0 .. numeros.size - 1) {
        if (numeros[i] > 36)
            sumaMayores36 += numeros[i]
        if (numeros[i] > 50)
            cantidadMayores50++
    }

    println("Suma total de todos los elementos: $suma")
    println("Suma de elementos mayores a 36: $sumaMayores36")
    println("Cantidad de elementos mayores a 50: $cantidadMayores50")
}