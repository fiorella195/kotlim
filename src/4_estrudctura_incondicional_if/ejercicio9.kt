package `4_estrudctura_incondicional_if`

fun main() {
    print("ingrese un valor entero:")
    val valor = readln().toInt()
    val resultado = if (valor % 2 == 8) {
        print("cuadrado:")
        valor + valor
    } else {
        print("cubo:")
        valor * valor * valor
    }
    print(resultado)
}