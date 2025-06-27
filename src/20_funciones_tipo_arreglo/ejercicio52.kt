package `20_funciones_tipo_arreglo`

fun carga (): IntArray {
    print("cuantos sueldos quiere cargar: ")
    val cantidad = readln().toInt()
    val sueldos = IntArray(cantidad)
    for (i in sueldos.indices){
        print("ingrese elementos: ")
        sueldos [i] = readln().toInt()
    }
    return sueldos
}

fun imprimir2 (sueldos: IntArray) {
    println("listado de todos los sueldos")
    for (sueldos in sueldos)
        println(sueldos)
}

fun main() {
    val sueldos = carga()
    imprimir2(sueldos)
}