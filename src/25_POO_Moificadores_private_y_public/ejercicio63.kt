package `25_POO_Moificadores_private_y_public`

/*
pntea una calse operaciones que en un metodo solicite la carga de 2 enteros y psoteriormente llama desde
el mismo metodo a otros dos metodos privados que calculen su suma y productos
 */

class Operaciones {
    private var valor1: Int = 0
    private var valor2: Int = 0

    fun cargar() {
        println("Ingrese primer valor: ")
        valor1 = readln().toInt()
        println("Ingrese segundo valor: ")
        valor2 = readln().toInt()
        sumar()
        restar()
    }

    private fun sumar() {
        val suma = valor1 + valor2
        println("la suma de $valor1 y $valor2 es $suma")
    }

    private fun restar() {
        val resta = valor1 + valor2
        println("la suma de $valor1 y $valor2 es $resta")

    }
}

fun main() {
    val Operaciones1 = Operaciones()
    Operaciones1.cargar()

}