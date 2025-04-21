package `6_condiciones_compuestas_operadores_logicos`

fun main() {
    print("ingrese el dia: ")
    val dia: Int = readln().toInt()
    print("ingrese mes: ")
    val mes: Int = readln().toInt()
    print("ingrese el año: ")
    val año: Int = readln().toInt()
    if (mes == 1 || mes== 2 || mes== 3)
        print("Corresponde al primer trimestre ")
}