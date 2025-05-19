package `13_funciones_parametros`

fun mostrarperimetro(lado: Int) {
    val perimetro = lado * 4
    println("La superficie es: $perimetro")
}

fun mostrarSuperficie(lado: Int){
    val superficie = lado * lado
    println("la superficie es $superficie")

}

fun main() {
    println("ingrese el valor del lado de un cuadrado: ")
    val lado = readln().toInt()
    println("Quiere calcular el perimetro o la superficie (Ingrese texto:parimetro/superficie): ")
    var respuesta = readln()
    when (respuesta) {
        "perimetro" -> mostrarperimetro(lado)
        "superficie" -> mostrarSuperficie(lado)
    }
}