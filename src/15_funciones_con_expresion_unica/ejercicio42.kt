package `15_funciones_con_expresion_unica`

fun convertircastellano (valor: Int) = when (valor) {
    1 -> "uno"
    2 -> "dos"
    3 -> "tres"
    4 -> "cuatro"
    5 -> "cinco"
    else -> "Error"

}

fun main() {
    for (i in 1 .. 6)
        println(convertircastellano(i))
}