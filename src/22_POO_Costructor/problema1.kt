package `22_POO_Costructor`

class Producto (var nombrePro: String, var precio: Int, var stock: Int) {
    init {
        if (precio < 0 )
            precio = 0
        if (stock < 0 )
            stock = 0
    }
    fun mostrarInfo() {
    println("producto: $nombrePro, precio: $precio, stock: $stock")
    }

    fun hayStock () {
        if (stock > 0 )
            println("Hay disponibilidad de: $nombrePro")
        else
            println("No hay disponibilidad de: $nombrePro")

    }
}

fun main() {
    val producto1 = Producto("Laptop", 1500, 5)
    producto1.mostrarInfo()
    producto1.hayStock()

    val producto2 = Producto("audifonos", 1000, -2 )
    producto2.mostrarInfo()
    producto2.hayStock()
}