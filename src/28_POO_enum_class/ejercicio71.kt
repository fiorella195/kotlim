package `28_POO_enum_class`

enum class TipoCarta {
    DIAMANTE,
    TREBOL,
    CORAZON,
    PICA
}

class Carta (val tipo: TipoCarta, val valor: Int){

    fun imprimir(){
        println("Carta: $tipo y su valor es: $valor")
    }
}


fun main() {
    val Carta1 = Carta(TipoCarta.PICA, 5)
    Carta1.imprimir()

    val Carta2 = Carta(TipoCarta.TREBOL, 1)
    Carta2.imprimir()
}