package `7_estructura_repetitiva_while`

/* Escribir un programa que solicite ingresar 10 notas de alumnos y
 nos informe cuántos tienen notas mayores o iguales a 7 y
  cuántos menores. */

fun main() {
    var mayores = 0
    var menores = 0
    var x = 1

    while (x <= 10) {
        print("Ingrese la nota $x: ")
        val nota = readLine()!!.toDouble()

        if (nota >= 7) {
            mayores = mayores + 1
        } else {
            menores = menores + 1
        }

        x++
    }

    println("Notas mayores o iguales a 7: $mayores")
    println("Notas menores a 7: $menores")
}
