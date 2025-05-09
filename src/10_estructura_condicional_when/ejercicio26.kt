package `10_estructura_condicional_when`
/*
escribir un programa que pida ingresar la coordenada de un punto en el plano,
es decir dos valores enteros x e y.
posteiormente inprimir en pantalla en que cuadrante se ubica dicho punto.
(1 cuandrante si x > 0 y > 0 , 2 cuandrante: x < 0 Y y >, 3 cuadrante:
 */

fun main() {
    print("ingrese coordenadas x del punto: ")
    val x = readln().toInt()
    print("ingrese coordenadas y del punto: ")
    val y = readln().toInt()
    when {
        x > 0 && y > 0 -> println("primer cuadrante")
        x < 0 && y > 0 -> println("segundo cuandrante")
        x < 0 && y < 0 -> println("tercer cuadrante")
        x > 0 && y < 0 -> println("cuarto cuadrante")
        else -> println("los puntos se encuentra en le eje")
    }

}