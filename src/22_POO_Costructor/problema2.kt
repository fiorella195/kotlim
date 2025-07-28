package `22_POO_Costructor`

class Libro (var titulo: String, var autor: String, var cantPaginas: Int) {

    constructor() : this (" "," ", 0 ) {
        println("ingrese el titulo del libro: ")
        titulo = readln().toString()
        println("ingrese el nombre del autor: ")
        autor = readln().toString()
        println("ingrese cantidad de paginas: ")
        cantPaginas = readln().toInt()

    }

    fun leer (paginasLeidas: Int){
        val pagRestantes = cantPaginas - paginasLeidas
       if (pagRestantes > 0 )
           println("quedan $paginasLeidas paginas restantes por leer")
        else
            println(" haz terminado de leer el libro $titulo ")
    }

    fun InfoLibro () {
        println("Titulo: $titulo, autor: $autor, paginas totales: $cantPaginas")

    }

}

fun main() {
    val libro1 = Libro ("el principito", "Antonio de Saint", 100)
    libro1.InfoLibro()
    libro1.leer(87)


    val libro2 = Libro ("caperucita roja", "Charles Perrault", 123)
    libro2.InfoLibro()
    libro2.leer(123)


}
