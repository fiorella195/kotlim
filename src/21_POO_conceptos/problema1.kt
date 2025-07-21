package `21_POO_conceptos`

class alumno {
    var nombre: String = " "
    var nota: Int = 0

    fun inicializar (nombre: String, edad: Int) {
        this.nombre = nombre
        this.nota = edad
    }

    fun imprimir() {
        println("nombre: $nombre, nota: $nota")
    }

    fun aprobado() {
        if (nota >= 7)
            println("$nombre esta aprobado")
        else
            println("$nombre esta desaprobado")
    }
}

fun main() {
    val alumno1: alumno
    alumno1 = alumno()
    alumno1.inicializar("caleb",9)
    alumno1.imprimir()
    alumno1.aprobado()

    val alumno2: alumno
    alumno2 = alumno()
    alumno2.inicializar("sofia",6)
    alumno2.imprimir()
    alumno2.aprobado()

}