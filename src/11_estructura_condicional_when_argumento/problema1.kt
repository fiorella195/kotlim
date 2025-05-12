package `11_estructura_condicional_when_argumento`
/*
realizar la carga de  la cantidaad de hijos de 10 familias. contar cuantos tienen 0,1, 2 o mas hijos
imprima dicho contador
 */

fun main() {
    var hijo0 = 0
    var hijo1 = 0
    var hijo2 = 0
    var hijomas = 0
    for (i in 1..10)
        println("ingrese la cantidad de hijos en su famailia: ")
    val cant = readln().toInt()
    when (cant) {
        0 -> hijo0++
        1 -> hijo1++
        2 -> hijo2++
        3 -> hijomas++

    }
    println("familias con 0 hijos: $hijo0")
    println("familias con 1 hijo: $hijo1")
    println("familias con 2 hijos: $hijo2")
    println("familias con mas de 2 hijos: $hijomas")

}