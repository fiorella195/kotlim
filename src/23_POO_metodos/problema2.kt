package `23_POO_metodos`

class temperaturas () {

    val temps = IntArray(7)

    fun cargarDatos() {
        for (i in 0..6) {
            print("Ingrese la temperatura de dia ${i+1 }: ")
            temps[i] = readln().toInt()
        }
        MostrarMax()
        MostarMin()

    }

    fun MostrarMax () {
        var max = temps[0]

        for (i in 1..temps.size - 1 ) {

            if (temps[i] > max) {
                max = temps[i]
            }
        }

        println("La temperatura mas alta fue de: $max")

    }

    fun MostarMin() {
        var min = temps[0]

        for (i in 1 .. temps.size - 1) {

            if (temps[i] < min ){
                min = temps[i]
            }
        }

       println("la temperatura mas baja fue de: $min")
    }
}

fun main() {
    val semana = temperaturas()
    semana.cargarDatos()
}