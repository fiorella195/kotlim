package `7_estructura_repetitiva_while`

fun main() {
    var x = 1
    var suma = 0
    while (x <= 10 ) {
        print("ingrese un valor: ")
        val valor = readln().toInt()
        suma = suma + 1
        x = x + 1
    }
    println("la suma de los numeros 10 valores ingresados es suma $suma")
    val promedio = suma / 10
    println("el promedio es $promedio ")
}