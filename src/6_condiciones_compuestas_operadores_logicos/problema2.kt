package `6_condiciones_compuestas_operadores_logicos`

/*Se ingresan tres valores por teclado, si todos son iguales calcular el cubo del número y mostrarlo.*/

fun main() {
    print("ingrese primer valor: ")
    val base: Int = readln().toInt()
    print("ingrese el segundo valor: ")
    val exponente: Int = readln().toInt()
    print("ingrese tercer valor: ")
    val tres: Int = readln().toInt()
    if (base == exponente && exponente == tres) {
        val cubo = base * base * base
        print("los numeros son iguales. El cubo de $base es $cubo")

    }else{
        print("los numeros no son iguales")
    }


}
