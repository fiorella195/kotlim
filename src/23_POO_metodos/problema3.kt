package `23_POO_metodos`

class Numeros () {
    val lista = IntArray(6)

    fun leerNumeros (){
        for (i in 0..5) {
            print("Ingrese el número $i: ")
            lista[i] = readln().toInt()
        }
        contarPositivos()
        contarNegativos()
    }

    fun contarPositivos () {
        var positivos = 0
        for (i in 0..5) {
            if (lista[i] > 0) {
                positivos++
            }
        }
        println("numeros positivos: $positivos")
    }

    fun contarNegativos () {
        var negativos = 0
        for (i in 0..5) {
            if (lista[i] < 0) {
                negativos++
            }
        }
        println("numeros negativos: $negativos")
    }

}

fun main() {
    val numeroos = Numeros()
    numeroos.leerNumeros()
}