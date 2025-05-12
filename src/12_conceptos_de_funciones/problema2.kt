package `12_conceptos_de_funciones`

fun carga (){
    println("ingrese primer valor: ")
    val valor1 = readln().toInt()
    println("ingrese segundo valor: ")
    val valor2 = readln().toInt()
    println("ingrese tercer valor: ")
    val valor3 = readln().toInt()
    val menor = minOf(valor1, valor2, valor3)
    println("el numero menor es: $menor")


}

fun main() {
    for (i in 1 .. 2){
        carga()
    }

}