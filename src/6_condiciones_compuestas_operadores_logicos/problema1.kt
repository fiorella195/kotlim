package `6_condiciones_compuestas_operadores_logicos`

/*
Realizar un programa que pida cargar una fecha cualquiera,
luego verificar si dicha fecha corresponde a Navidad.
 */
fun main() {
    print("ingrese el dia: ")
    val dia: Int = readln().toInt()
    print("ingrese mes: ")
    val mes: Int = readln().toInt()
    if (dia == 25 && mes == 12)
        print("Es navidad")
    else
        print("Es un dia normal")
}
