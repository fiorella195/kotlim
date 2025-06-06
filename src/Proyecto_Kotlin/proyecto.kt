package Proyecto_Kotlin
fun registrarNota(nombre: String): Int {
    var nota: Int? = null

    do {
        print("Ingresa la nota del estudiante $nombre (0 a 100): ")
        val input = readLine()
        nota = input?.toIntOrNull()

        if (nota !in 0..100) {
            println("Nota inválida. Intenta de nuevo.")
            nota = null
        }

    } while (nota == null)

    return nota
}

fun main() {
    val estudiantes = arrayOf("Ana", "Luis", "Carlos", "María", "Jorge")
    val notas = mutableListOf<Int>()

    for (estudiante in estudiantes) {
        val nota = registrarNota(estudiante)
        notas.add(nota)
    }

    println("Notas registradas:")
    for (i in estudiantes.indices) {
        println("${estudiantes[i]}: ${notas[i]}")
    }
}


