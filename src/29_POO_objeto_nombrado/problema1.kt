package `29_POO_objeto_nombrado`
object Mayor {
    fun maximo(valor1: Int,valor2: Int): Int {
        return if (valor1 > valor2) valor1 else valor2
    }

    fun maximo(valor1: Float, valor2: Float): Float  {
        return if (valor1 > valor2) valor1 else valor2
    }

    fun maximo(valor1: Double, valor2: Double): Double {
        return if (valor1 > valor2) valor1 else valor2
    }
}

fun main() {
    println("mayor: ${Mayor.maximo(5, 8)}")
    println("mayor: ${Mayor.maximo(5.5f, 3.2f)}")
    println("mayor: ${Mayor.maximo(7.8, 9.1)}")
}