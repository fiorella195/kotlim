package `25_POO_Moificadores_private_y_public`

import `17_funciones_argumentos_nombrados`.calcularSueldos

class CuentaBancaria () {

    private var saldo: Int = 0

    fun depositar (monto: Int){
    println("ingrese un la cantidad que desea depositar: ")
       val monto = readln().toInt()
        if (monto > 0) {
            saldo = saldo + monto
            println("$monto depositado")
        } else
            println("error")

    }

    fun retirar (monto: Int) {
       println("Ingrese el monto que desea retirar")
        val retira = readln().toInt()
        if (retira > 0 && monto >= retira) {
            saldo = monto - retira
            println("$retira se a retirado de la cuenta ")
        } else
            println("error")
    }

    fun ConsutalSaldo () {
        println("el saldo actual es: $saldo")
    }
}

class Helpers () {
    fun montoValido(monto: Int): Boolean {
        return monto > 0


    }

    fun puedeRetirar(saldo: Int, monto: Int): Boolean {
        return saldo >= monto
    }
}

fun main() {
    val cuenta1 = CuentaBancaria()
    cuenta1.depositar(3000)
    cuenta1.retirar(200)
    cuenta1.ConsutalSaldo()

    val cuenta2 = CuentaBancaria()
    cuenta2.depositar(200)
    cuenta2.retirar(250)
    cuenta2.ConsutalSaldo()

}

