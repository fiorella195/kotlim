package `27_POO_Data_class`

data class Butaca (var numero: Int, var ocupada: Boolean)

fun main() {
    val butaca1 = Butaca(1, false)
    val butaca2 = Butaca(2, false)
    val butaca3 = Butaca(3, false)
    val butaca4 = Butaca(4, false)
    val butaca5 = Butaca(5, false)

    val butacas = listOf(butaca1,butaca2,butaca3,butaca4,butaca5)
    val ocupado1 = butacas.random()
    val ocupado2 = butacas.random()

    val puntero = ocupado1
    puntero.ocupada = true
    val puntero2 = ocupado2
    puntero2.ocupada = true
    println(butacas)


    for ((numero, ocupada) in butacas) {
        val estado = if (ocupada) "ocupada" else "desocupada"
        println("Butaca $numero -> $estado")
    }

    val copiaButacas = butacas.toList()
    println("contenido igual " )
    println((butacas == copiaButacas))

}