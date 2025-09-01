package `27_POO_Data_class`

data class Jugador (val nombre: String) {
    var puntos: Int = 0
}

fun main() {
    val jugador1 = Jugador("predro")
    val jugador2 = Jugador("pedro")

    jugador1.puntos = 10
    jugador2.puntos = 20

    if (jugador1 == jugador2)
        println("tiene en mismo nombre los jugadores")
    else
        println("no tienen el mismo nombre")

}