package `10_estructura_condicional_when`
/*
Realizar un programa que lea los lados de n triángulos, e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
isósceles (dos lados iguales), o escaleno (ningún lado igual)
b) Cantidad de triángulos de cada tipo.
 */

    fun main(){
print("ingrese cuantos triangulos quiere: ")
        val cant = readln().toInt()
        for (i in 1 .. cant) {
            println("ingrese tres lados de un triangulo")
            println(" ingrese el lado 1:")
            val lad1 = readln().toInt()
            println(" ingrese el lado 2:")
            val lad2 = readln().toInt()
            println("ingrese el lado 3:")
            val lad3 = readln().toInt()
            when {
                lad1 == lad2 && lad2 == lad3 -> println("el triangulo es equilatero")
                lad1 == lad2 && lad2 == lad3 && lad1 == lad3 -> println("el triangulo es isoceles")
                else -> println("el triangulo es escalante")

            }
        }
    }








