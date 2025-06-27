package `20_funciones_tipo_arreglo`
/*
 Cargar un arreglo de n elementos. Imprimir el menor elemento
 y un mensaje si se repite dentro del arreglo.
*/

fun elementos(): IntArray {
    print("Ingrese la cantidad de elementos: ")
    val n = readln().toInt()
    val arreglo = IntArray(n)
    for (i in arreglo.indices) {
        print("Ingrese el elemento: ")
        arreglo[i] = readln().toInt()
    }
    return arreglo
}

fun menor(arreglo: IntArray): Int {
    var min = arreglo[0]
    for (i in arreglo.indices) {
        if (arreglo[i] < min) {
            min = arreglo[i]
        }
    }
    return min
}

fun main() {
    val arre = elementos()
    val min = menor(arre)
    println("El número menor es: $min")

}