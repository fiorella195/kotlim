package `21_POO_conceptos`

class persona {
    var nombre: String = " "
    var edad: Int = 0

    fun inicializar ( nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
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
    val persona1: persona
    persona1 = persona ()
    persona1.inicializar("juan",12)
    persona1.imprimir()
    persona1.esMayorEdad()

    val persona2: persona
    persona2 = persona ()
    persona2.inicializar("ana",50)
    persona2.imprimir()
    persona2.esMayorEdad()

}