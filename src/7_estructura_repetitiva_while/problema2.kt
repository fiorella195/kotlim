package `7_estructura_repetitiva_while`
/*Se ingresan un conjunto de n alturas de personas por
teclado (n se ingresa por teclado).
Mostrar la altura promedio de las personas.
 */

fun main() {
print("ingrese la cantidad de personas: ")
    val n = readln().toInt()
    var x = 1

    var cantidad = 0 // variable contadora
    while (x <= n ){
        print("ingrese su altura: ")
        val altura = readln().toDouble()
        if (altura > 1 )
            cantidad = cantidad + 1
        x = x + 1
    }
val promedio: Double = cantidad / n.toDouble()

    println("el promedio de altura es de $promedio")
}
