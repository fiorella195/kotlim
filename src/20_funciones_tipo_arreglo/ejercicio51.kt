package `20_funciones_tipo_arreglo`


fun cargar (arreglo: IntArray) {
    for (i in arreglo.indices) {
        println("ingrese elemento: ")
        arreglo[i] = readln().toInt()
    }
}

fun imprimir (arreglo: IntArray) {
    for (elemento in arreglo)
       println(elemento)

}

fun main() {
    val arre = IntArray(5)
    cargar(arre)
    imprimir(arre)

}
