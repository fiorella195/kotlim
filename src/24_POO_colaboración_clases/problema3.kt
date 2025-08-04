package `24_POO_colaboración_clases`

class Motor (var encendido: Boolean){
    fun encender () {
        if  (encendido) {
            encendido = true
            println("el motor esta prendido")

        } else {
            println("el motor se encuentra apagado")
        }
    }

    fun apagar () {
        if (encendido) {
            encendido = false
            println("el motor esta apagado")
        } else {
            println("el motor se ecuentra apagado")
        }
    }

    fun estado () {
        val estadoAcutal =
            if (encendido) "prendido"
            else "apagado"
        println("el motor se encuentra $estadoAcutal")

    }
}

class Carro () {
    val motor1 = Motor(true)
    val motor2 = Motor(false)
    val motor3 = Motor(true)

    fun conducir () {
        motor1.encender()
        motor2.apagar()
        motor3.encender()

    }

    fun estadoGeneral () {
        println("estado de los motores: ")
        motor1.estado()
        motor2.estado()
        motor3.estado()
    }
}

fun main() {
    val carros = Carro()
    carros.conducir()
    println(" ")
    carros.estadoGeneral()
}




