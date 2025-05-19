package `13_funciones_parametros`
/*
confeccionar una apalicacionque muestre uan presentacion en pantalla del programa. solicite la carga
de dps valores y muestre la suma
mostrar al final la suma
 */
fun mostrarmensaje (mensaje: String) {
    println("***************************************")
    println(mensaje)
    println("***************************************")

}

fun cargaSuma() {
    println("ingrese el primer valor: ")
    val valor1 = readln().toInt()
    println("ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("la suma de los dos valores: $suma")

}

fun main() {
    mostrarmensaje("el programa calcula la suma de dos valores por teclado")
    cargaSuma()
    mostrarmensaje("gracias por utlizar este programa ")
}