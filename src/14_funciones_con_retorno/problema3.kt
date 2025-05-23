package `14_funciones_con_retorno`
/*
En la función main del programa cargar los lados de dos
 rectángulos y luego mostrar cual de los dos tiene una
  superficie mayor.
 */

fun retornarSuperficie (lado1: Int, lado2: Int): Int {
    return lado1 * lado2
}

fun main() {
    println("ingrese primer lado del primer triangulo: ")
    val lado1 = readln().toInt()
    println("ingrese segundo lado del primer triangulo: ")
    val lado2 = readln().toInt()
    println("ingrese primer lado del segundo triangulo: ")
    val lado3 = readln().toInt()
    println("ingrese segundo lado del segundo triangulo: ")
    val lado4 = readln().toInt()

    val superficie1 = retornarSuperficie(lado1,lado2)
    val superficie2 = retornarSuperficie(lado3,lado4)

    if (superficie1 > superficie2) {
        println("el primer rectangulo tiene mayor superficie: $superficie1")

    }else if (superficie2 > superficie1){
        println("el segundo triangulo tiene mayor superficie: $superficie2")

    }else{
        println("ambos rectangulos tiene la misma superficie")
    }
}
