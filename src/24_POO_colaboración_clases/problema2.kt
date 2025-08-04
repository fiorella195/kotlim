package `24_POO_colaboración_clases`

class estudiantes (var nombre: String, var asistencia: Int){

    fun registrarAsistencia (){
       this.asistencia == asistencia
    imprimir()
    }

    fun imprimir () {
        println("el estudiante $nombre tiene un total de asistencia de: $asistencia")


    }
}

class Clase () {
    val est1: estudiantes = estudiantes("juan", 10)
    val est2: estudiantes = estudiantes("Ana", 8)
    val est3: estudiantes = estudiantes("Luis", 9)

    fun marcarAsistencia (){
        est1.registrarAsistencia()
        est2.registrarAsistencia()
        est3.registrarAsistencia()

    }

    fun reporte () {
        est1.imprimir()
        est2.imprimir()
        est3.imprimir()

    }
}

fun main() {
    val clase1 = Clase()
    clase1.marcarAsistencia()

}
