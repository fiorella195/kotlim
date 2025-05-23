package `14_funciones_con_retorno`
//elabore una funcion que reciba tres enteros y
// los retorne el valor promedio de los mismos

fun RetornePromedio (v1: Int, v2: Int, v3: Int): Int {
    val suma = v1 + v2 + v3
    val promedio = suma / 3
    return promedio
}

fun main() {
    println("ingrese el primer valor: ")
    val valor1 = readln().toInt()
    println("ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    println("ingrese el tercer valor: ")
    val valor3 = readln().toInt()
    val prom = RetornePromedio(valor1, valor2, valor3)
    println("el promedio entre los numeros $valor1, $valor2 y $valor3 es: $prom")
}

