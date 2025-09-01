package `27_POO_Data_class`
//declara un data class llamando articiculo que almacene el codigo del producto, su descripcion y precio
//definir luegi varios objetos de dicha data class en el main
data class articulo (var codigo: Int, var descripcion: String, var precio: Float)

fun main() {
    val articulo1 = articulo (1, "papas", 34f)
    var articulo2 = articulo(2, "manzanas", 24f)

    println(articulo1)
    println(articulo2)

    val puntero = articulo1
    puntero.precio =  100f
    println(articulo1)

    var articulo3 = articulo1.copy()

    articulo1.precio = 200f
    println(articulo1)

    println(articulo3)

    if (articulo1 == articulo3)
        println("son iguales $articulo1 y $articulo3")
    else
        println("$articulo1 y $articulo3 no son iguales")

    articulo3.precio = 200f
    if (articulo1 == articulo3)
        println("son iguales $articulo1 y $articulo3")
    else
        println("$articulo1 y $articulo3 no son iguales")

}

