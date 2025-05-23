package `14_funciones_con_retorno`

/* confeccionar una funcion que calcule la superficie de un
triangulo y la retorna, la funcion recibe como parametros
los valores de dos de sus lados
 */

fun retrotarSuperficie (lado1: Int, lado2: Int): Int {
    val sup = lado1 * lado2
    return sup
}

fun main() {
    println("ingrese el primer lado del triangulo: ")
    val lad1 = readln().toInt()
    println("ingrese el segundo lado del triangulo")
    val lad2 = readln().toInt()
    val superficie = retrotarSuperficie(lad1,lad2)
    println("la superficie del triangulo es: $superficie")
}