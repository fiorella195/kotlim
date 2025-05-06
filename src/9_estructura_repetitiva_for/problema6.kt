package `9_estructura_repetitiva_for`
/*
Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante.
Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.
 */


fun main() {
    var primer = 0
    var segundo = 0
    var tercer = 0
    var cuarto = 0



    for (i in 1 .. 4) {
        print("Ingrese coordenada X del punto $i: ")
        val x = readln().toInt()
        print("Ingrese coordenada Y del punto $i: ")
        val y = readln().toInt()


        when {
            x > 0 && y > 0 -> primer++
            x < 0 && y > 0 -> segundo++
            x < 0 && y < 0 -> tercer++
            x > 0 && y < 0 -> cuarto++
            else -> println("El punto ($x, $y) está sobre un eje y no se cuenta en ningún cuadrante.")
        }
    }

    println("Cantidad de puntos en el primer cuadrante: $primer")
    println("Cantidad de puntos en el segundo cuadrante: $segundo")
    println("Cantidad de puntos en el tercer cuadrante: $tercer")
    println("Cantidad de puntos en el cuarto cuadrante: $cuarto")

    }

