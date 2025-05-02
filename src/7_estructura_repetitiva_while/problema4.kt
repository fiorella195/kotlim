package `7_estructura_repetitiva_while`
/*Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc.
(No se ingresan valores por teclado)
 */
fun main() {
    var x = 1
    var numero = 11

    while (x <= 25) {
        println(numero)
        numero += 11
        x += 1
    }
}