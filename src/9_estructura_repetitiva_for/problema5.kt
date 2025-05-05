package `9_estructura_repetitiva_for`
/*Realizar un programa que lea los lados de n triángulos,
e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero
(tres lados iguales), isósceles (dos lados iguales), o escaleno
 (ningún lado igual)
b) Cantidad de triángulos de cada tipo.
*/

fun main() {
    val n = readLine()!!.toInt()

    var equilateros = 0
    var isosceles = 0
    var escalenos = 0

    for (i in 1..n) {
        println("Ingrese los tres lados del triángulo $i:")
        print("Lado 1: ")
        val lado1 = readLine()!!.toInt()
        print("Lado 2: ")
        val lado2 = readLine()!!.toInt()
        print("Lado 3: ")
        val lado3 = readLine()!!.toInt()

        when {
            lado1 == lado2 && lado2 == lado3 -> {
                println("Triángulo $i: Equilátero")
                equilateros++
            }
            lado1 == lado2 || lado2 == lado3 || lado1 == lado3 -> {
                println("Triángulo $i: Isósceles")
                isosceles++
            }
            else -> {
                println("Triángulo $i: Escaleno")
                escalenos++
            }
        }
    }

    println("\nResumen de los triángulos:")
    println("Equiláteros: $equilateros")
    println("Isósceles: $isosceles")
    println("Escalenos: $escalenos")
}