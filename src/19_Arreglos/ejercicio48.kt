package `19_Arreglos`

fun main() {
    val arreglo = IntArray (4)
    for (i in 0 .. arreglo.size-1) {
        print("ingrese elemento: ")
        arreglo[i] = readln().toInt()
    }
    var ordenado: Boolean = true
    for (i in 0 .. arreglo.size-2) {
        val n1: Int = arreglo[i+1]
        val n2: Int = arreglo[1]
        if (n1 < n2)
            ordenado = false
    }
    if (ordenado)
        print("los elementos estn ordenados de mayor a menor")
    else
        print("los elementos estan ordenados de menor  mayor ")

}
