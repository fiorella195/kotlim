package `8_estructura_repetitiva_doWhile`
/*En un banco se procesan datos de las cuentas corrientes de sus
clientes. De cada cuenta corriente se conoce: número de cuenta y
saldo actual. El ingreso de datos debe finalizar al ingresar un
valor negativo en el número de cuenta.
Se pide confeccionar un programa que lea los datos de las
cuentas corrientes e informe:

a)De cada cuenta: número de cuenta y estado de la cuenta según su
 saldo, sabiendo que:

Estado de la cuenta	'Acreedor' si el saldo es >0.
			'Deudor' si el saldo es <0.
			'Nulo' si el saldo es =0.

b) La suma total de los saldos acreedores.*/

fun main() {
    var cuenta = 0
    var saldo1 = 0
    var acreedor = 0
    do {
        println("Escriba el número de cuenta:")
        val cuenta = readln().toInt()
        if (cuenta > 0) {
            print("Escriba el saldo actual de la cuenta:")
            saldo1 = readln().toInt()
        }
        if (cuenta > 0) {
            println("El número de cuenta es: $cuenta")
            println("El saldo de la cuenta es: $saldo1")
        } else {
            print("No existe ese número de cuenta")
        }
        if (cuenta > 0)
            if (saldo1 > 0) {
                println("El estado de la cuenta es Acreedor")
                acreedor += saldo1
            }else if (saldo1 < 0) {
                println("El estado de la cuenta es Deudor")
            }else{
                println("El saldo es Nulo")
            }
    } while (cuenta >= 0)
    println("El total de las cuentas de acreedor es: $acreedor")
}
