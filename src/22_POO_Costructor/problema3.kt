package `22_POO_Costructor`

class Rectangulo(var base: Int, var altura: Int) {

    init {
        if (base < 0 )
            base = 0
        if (altura < 0 )
            altura = 0
    }

    fun area(): Int {
        return base * altura
    }

    fun esCuadrado() {
        if (base == altura)
            println("Es un cuadrado.")
        else
            println("Es un rectángulo común.")
    }
}

fun main() {
    val figura1 = Rectangulo(4,4)
    figura1.area()
    figura1.esCuadrado()

    val figura2 = Rectangulo(5,9)
    figura2.area()
    figura2.esCuadrado()

}