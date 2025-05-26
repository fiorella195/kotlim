package `16_funciones_parametro_por_defecto`

fun titulosSubrayados (titulo: String, caracter: String = "*"  ){
    println(titulo)
    for (i in 1 .. titulo.length)
        println(caracter)
    println()

}
fun main() {
    titulosSubrayados("sistema de administración")
    titulosSubrayados("ventas", "-")

}