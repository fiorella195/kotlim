package `11_estructura_condicional_when_argumento`
/*
imprima un numero indicado cuantos digitos tiene
 */
fun main() {

    print("ingrese un valor entero positivo comprendido entre 1 y 99999: ")
    val valor = readln().toInt()
    when (valor) {
        in 1 .. 9 -> print("tiene 1 digito")
        in 10 .. 99 -> print("tiene 2 digito")
        in 100 .. 999 -> print("tiene 3 digito")
        in 1000 .. 9999 -> print("tiene 4 digito")
        in 10000 .. 99999 -> print("tiene 5 digito")

        else -> print("no se encuentra en el rango indicado")

    }
}