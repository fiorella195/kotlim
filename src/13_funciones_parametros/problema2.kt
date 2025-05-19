package `13_funciones_parametros`
/*
Confeccionar una función que reciba tres enteros y los muestre ordenados de menor a mayor.
 En la función main solicitar la carga de 3 enteros por teclado y proceder a llamar a la función ordenadrMayorMenor.

El algoritmo evalúa distintas combinaciones mediante estructuras condicionales when y if/else,
comparando los valores entre sí. Se trata de un ejemplo práctico para reforzar:
    La entrada de datos desde consola.
    Conversión de String a Int usando .toInt().
    El uso combinado de when y if para resolver condiciones múltiples.
    La impresión ordenada de los resultados.
*/
fun mayor (v1: Int, v2: Int, v3: Int) {
   println("mayor: ")
    if (v1 > v2 && v1 > v3)
        println(v1)
    else
        if (v2 > v3)
            print(v2)
        else
            print(v3)

}

fun medio (v1: Int, v2: Int, v3: Int) {
    println("medio: ")
    if (v3 < v1 && v3 < v2)
        println(v1)
    else
        if (v2 < v3)
            println(v2)
        else
            println(v3)
}

fun menor(v1: Int, v2: Int, v3: Int) {
    println("menor: ")
    if (v2 > v1 && v2 > v3)
        println(v2)
    else
        if (v2 > v3)
            println(v3)
        else
            println(v1)

}

fun main() {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()


    mayor(valor1, valor2, valor3)
    medio(valor1, valor2, valor3)
    menor(valor1, valor2, valor3)

}


