package `5_estructura_condicionales_anidadas`


/*Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número
es positivo, nulo(cero) o negativo.
 */

fun main () {
    print("ingrese un numero")
    val num = readln().toInt()
    if (num > 0)
        print("positivo")
    else
        if (num < 0)
            print("negativo")
        else
            if (num == 0)
                print("nulo")
}
