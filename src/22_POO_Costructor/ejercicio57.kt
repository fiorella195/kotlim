package `22_POO_Costructor`

class persona(var nombre: String, var edad: Int) {
    init {
        if (edad < 0)
            edad = 0
    }
    fun imprimir() {
        println("nombre: $nombre y tiene una edad de $edad")

    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("es mayor de edad $nombre")
        else
            println("es menor de edad $nombre")

    }
}

fun main() {
    val persona1 = persona ("juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()

}
