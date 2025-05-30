package `19_Arreglos`

/*
Realizar un programa que pida la carga de dos arreglos numéricos enteros de 4 elementos.
Obtener la suma de los dos arreglos elemento a elemento, dicho resultado guardarlo
en un tercer arreglo del mismo tamaño.
 */

fun main() {
    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val sumaArreglos = IntArray(4)

    // Carga del primer arreglo
    for (i in arreglo1.indices) {
        print("Ingrese un número para el arreglo 1: ")
        arreglo1[i] = readln().toInt()
    }
    for (i in arreglo2.indices) {
        print("Ingrese un número para el arreglo 2: ")
        arreglo2[i] = readln().toInt()
    }

    for (i in 0..3) {
        sumaArreglos[i] = arreglo1[i] + arreglo2[i]
    }

    println("Arreglo 1:")
    for ((indice, elemento) in arreglo1.withIndex())
        println("Índice $indice: $elemento")

    println("Arreglo 2:")
    for ((indice, elemento) in arreglo2.withIndex())
        println("Índice $indice: $elemento")

    println("Suma de los arreglos:")
    for ((indice, elemento) in sumaArreglos.withIndex())
        println("Índice $indice: $elemento")
}