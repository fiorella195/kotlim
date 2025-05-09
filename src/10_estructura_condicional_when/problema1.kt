package `10_estructura_condicional_when`
/*Se ingresa por teclado un valor entero, mostrar una leyenda por
 pantalla que indique si el número es positivo, nulo o negativo.*/

fun main() {
    print("ingrese un valor: ")
    val valor = readln().toInt()
    when{
        valor > 0 -> println("el numero es positivo")
        valor < 0 -> println("el numero es negativo")
        valor == 0 -> println("el numero es nulo ")

    }
}
