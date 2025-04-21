package `6_condiciones_compuestas_operadores_logicos`

fun main() {
    print("ingrese un numero")
    val num1: Int = readln().toInt()
    print("ingrese otro numero")
    val num2: Int = readln().toInt()
    print("ingrese un tercer numero")
    val num3: Int = readln().toInt()
    if (num1 < 10 || num2 < 10 || num3 < 10 )
        else
            print("no tiene ningun numero menor a 10")

}