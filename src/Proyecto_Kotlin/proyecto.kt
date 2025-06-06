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
    var suma = 0
    var notaAlta = 0
    var notaBaja = 100

    for (estudiante in estudiantes) {
        val nota = registrarNota(estudiante)
        notas.add(nota)
    }



    println("Notas registradas:")
    for (i in estudiantes.indices) {
        suma += notas[i]
        if (notas[i] > notaAlta)
            notaAlta = notas[i]
        else
            notaBaja = notas[i]
       when (notas[i]) {
           in  90..100 -> println("${estudiantes[i]}: Excelente ")
           in  80..89 -> println("${estudiantes[i]}: Muy bien ")
           in  70..79 -> println("${estudiantes[i]}: Bien ")
           else -> println("${estudiantes[i]}: Reprobado")
       }
    }
    val promedio = suma / 5
    println("promedio de notas: $promedio")

    println("la nota mas baja es de: $notaBaja")
    println("la nota mas alta es de: $notaAlta")
}


