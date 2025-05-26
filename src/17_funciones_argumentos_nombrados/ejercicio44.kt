package `17_funciones_argumentos_nombrados`
/*confecciona una funcion que resiba el nombre

 */
fun calcularSueldos (nombre: String, costoHora: Double, cantidadHoras: Int){
    val sueldos = costoHora * cantidadHoras
    println("$nombre trabajo $cantidadHoras horas, se le paga por hora $costoHora por hora $costoHora" +
            "por lo canto le corresponde un sueldo de $sueldos")
}

fun main() {
    calcularSueldos("juan", 10.5, 120)
    calcularSueldos(costoHora = 12.0, cantidadHoras = 40, nombre = "ana")
    calcularSueldos(cantidadHoras = 90, nombre = "luis", costoHora = 7.25)
}