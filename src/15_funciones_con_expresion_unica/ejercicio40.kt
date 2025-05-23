package `15_funciones_con_expresion_unica`

fun  retornarSuperficie (lado: Int): Int = lado * lado

fun main() {
    println(" ingrese el valor del lado del cuadrado: ")
    val lado = readln().toInt()
    println("la superficie del cuadrado es ${retornarSuperficie(lado)}")
}