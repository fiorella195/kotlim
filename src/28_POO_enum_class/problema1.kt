package `28_POO_enum_class`

enum class Cine (val habitantes: Int){
    Costa_Rica (5000000),
    Panama (4000000),
    Colombia (52000000),
    Brasil (212000000),
    Argentina (45000000)
}

class Paises (val pais: Cine, val ciudadanos: Int) {
    fun imprimir() {
        println("el pais $pais tiene una cantidad de habitantes de $ciudadanos")

    }
}

fun main() {
    val pais1 = Paises(Cine.Colombia,5000000)
    pais1.imprimir()

    val pais2 = Paises(Cine.Brasil,212000000)
    pais1.imprimir()
}