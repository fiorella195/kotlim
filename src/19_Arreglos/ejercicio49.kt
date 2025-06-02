package `19_Arreglos`

fun main() {
    val arreglo = IntArray (10)
    for (i in arreglo.indices) {
        print("ingrese elemento: ")
        arreglo[i] = readln().toInt()
    }
    println("primera componente del arreglo ${arreglo[0]}")
    println("ultima componente del arreglo ${arreglo[arreglo.lastIndex]}")

}
