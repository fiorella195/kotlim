package `20_funciones_tipo_arreglo`
/*
Desarrollar un programa que permita ingresar un arreglo de n elementos, ingresar n por teclado.
Elaborar dos funciones una donde se lo cree y cargue al arreglo y otra que sume todos sus elementos y retorne dicho valor a la main donde se lo imprima.

 */
fun elementosCarga (): IntArray {
    print("ingrese cuantos elementos quiere sumar: ")
    val n  = readln().toInt()
    val arreglo = IntArray(n)
    for (i in arreglo.indices) {
        print("Ingrese el elemento $i: ")
        arreglo[i] = readln().toInt()
    }
    return arreglo
}

fun sumar(arreglo: IntArray): Int {
    var suma = 0
    for (i in arreglo) {
        suma += i
    }
    return suma
}


fun main() {
    val arre = elementosCarga()
    val sumaTotal = sumar(arre)
    println("La suma de los elementos es: $sumaTotal")
}
