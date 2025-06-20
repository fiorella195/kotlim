package Proyecto_Kotlin

fun registrarnotas (nombre: String) : Int {
    var Rnotas: Int
    do {
        print("ingrese la nota de $nombre (0-100): ")
        Rnotas = readln().toInt()
        if ( Rnotas < 0 || Rnotas > 100)
            println("nota no valida. ingrese de nuevo")
    }while (Rnotas < 0 || Rnotas > 100)
    return Rnotas

}

fun main() {
    val estudiantes = arrayOf("luis","jose","sofia","amanda","dana")

    var suma = 0 //suma promedio
    var NotaAlta = 0
    var NotaBaja = 100
    var aprobados = 0
    var desaprobados = 0

    for (estudiantes in estudiantes) {
        val notas = registrarnotas(estudiantes)
        suma += notas
        if (notas >= 70) {
            aprobados++
        }

        if (notas < 70) {
            desaprobados++
        }

        if (notas < NotaBaja) {
            NotaBaja = notas
        }

        if (notas > NotaAlta) {
            NotaAlta = notas
        }




        when (notas) {
            in 90..100 -> println("$estudiantes: Exelente")
            in 80..89 -> println("$estudiantes: Buena")
            in 70..79 -> println("$estudiantes: aprobados")
            else -> println("$estudiantes: desaprobado")

        }
    }
    var promedio = suma / 5


    println("_________________________")
    println("resumen de notas")
    println("promedio de notas: $promedio")
    println("nota más alta: $NotaAlta")
    println("nota más baja: $NotaBaja")
    println("estudiantes aprobados: $aprobados")
    println("estudiantes desaprobados: $desaprobados")



}