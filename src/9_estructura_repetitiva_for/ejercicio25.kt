package `9_estructura_repetitiva_for`
/* escribe un rpograma que lea n numeros enteros y enteros y calcule la cantidad de valores
* pares ingresados*/
fun main() {
    var cant = 0

    print("cuantos valores ingresara para analizar: ")
    val cantidad = readln().toInt()
    for (i in 1 .. cantidad)  {
        print("ingrese un valor: ")
        val valor = readln().toInt()
        if (valor % 2 == 0)
            cant++
    }
        println("cantidad de pares: $cant")
}