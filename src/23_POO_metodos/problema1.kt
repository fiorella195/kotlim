package `23_POO_metodos`

class  Notas () {
    var nota1: Int = 0
    var nota2: Int = 0
    var nota3: Int = 0
    var nota4: Int = 0

    fun CargarNotas () {
        println("ingrese la nota del primer estudiante: ")
        nota1 = readln().toInt()
        println("ingrese la nota del segundo estudiante: ")
        nota2 = readln().toInt()
        println("ingrese la nota del tercer estudiante: ")
        nota3 = readln().toInt()
        println("ingrese la nota del cuarto estudiante: ")
        nota4 = readln().toInt()

        promedioNotas()
        aprobados()

    }

    fun promedioNotas () {
      val suma = nota1 + nota2 + nota3 + nota4
      val promedio = suma / 4
      println("el promedio de la notas de los estudiantes es de $promedio")


    }

    fun aprobados () {
        var aprobados = 0
        var desaprobados = 0

        if (nota1 >= 70 )
            aprobados++
        else
            desaprobados++

        if (nota2 >= 70 )
            aprobados++
        else
            desaprobados++

        if (nota3 >= 70 )
            aprobados++
        else
            desaprobados++

        if (nota4 >= 70 )
            aprobados++
        else
            desaprobados++


        println("total de estudiantes aprobados: $aprobados")
        println("total de estudiantes desaprobados: $desaprobados")
    }
}

fun main() {
    val estudiantes10 = Notas()
    estudiantes10.CargarNotas()

    val estudiantes11 = Notas()
    estudiantes10.CargarNotas()
}