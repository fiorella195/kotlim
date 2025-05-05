package `9_estructura_repetitiva_for`
/*
Confeccionar un programa que lea x pares de datos, cada par de datos corresponde a la
 medida de la base y la altura de un triángulo. El programa deberá informar:

a) De cada triángulo la medida de su base, su altura y su superficie (la superficie se
calcula multiplicando la base por la altura y dividiendo por dos).
b) La cantidad de triángulos cuya superficie es mayor a 12.

 */
fun main() {
   var menores = 0
    var mayores = 0

    print("ingrese la cantidad de triangulos para encontrar su superficie: ")
    val cantidad = readln().toInt()

    for (i in 1 .. cantidad) {
        print("ingrese la base del triángulo: ")
        val base = readln().toDouble()
        print("ingrese la altura del triángulo: ")
        val altura = readln().toDouble()
        val super1 = base * altura
        val super2 = super1 / 2
         if (super2 >= 12 )
             mayores++
        else
            menores++

    }
    println("cantidad de triangulos cuya superficie es mayor a 12: $mayores")
}