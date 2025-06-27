package prueba

// pide que se ingrese si el estudiante fue a clases o no
fun registrarAsistencia (nombre: String): String {
    var asistencia: String
    do {
        print("$nombre asistio a clases? (s/n):  ")
        asistencia = readLine().toString()

        when (asistencia) {
            "s" -> println("true")
            "n" -> println("false")
            else -> println("no valido. Ingrese de nuevo") //si se ingresa algo diferente a s/n indica que esta mal
        }
    } while (asistencia != "n" && asistencia != "s" ) // si no es "n" ni "s" va a pedir hasta que se ingrese algun valor adecuado
    return asistencia // retorna la funcion para que termine
}


fun generarResumen () {
    println("_______________________")
    println("resumen general de asistecia ")
}


fun main() {
    val estudiantes = arrayOf("sofia", "amanda", "dana", "caleb","dayana") //indica el nombre de los estudiantes

    var totalPresentes = 0
    var totalAusentes = 0

    for (estudiantes in estudiantes) { // se repite 5 veces, ya que se asigno el nombre a 5 estudiantes
        val asistencia = registrarAsistencia(estudiantes) //llama a funcion para que pida si asistio a clases o no

        if (asistencia == "s") {  // si respuesta es "s" significa que si asistio, suma a total de presentes
            totalPresentes++

        }
        if (asistencia == "n") { // si respuesta es "n" significa que no asistio, suma a total de ausentes
            totalAusentes++
        }


    }

    generarResumen()
    println("total de presentes: $totalPresentes")
    println("total de ausentes: $totalAusentes")


}