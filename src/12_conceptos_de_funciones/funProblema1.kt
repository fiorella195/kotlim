package `12_conceptos_de_funciones`

fun unentero () {
    println("ingrese un valor : ")
    val entero = readln().toInt()
    val cuadrado = entero * 2
    println("el numero al cudrado de $entero es $cuadrado")

}

fun dosvalores () {
    println("ingrese un valor: ")
    val valor1 = readln().toInt()
    println("ingrese un segundo valor: ")
    val valor2 = readln().toInt()
    val mult = valor1 * valor2
    println("el producto de los numeros es: $mult")
}
fun main() {
    unentero()
    dosvalores()

}