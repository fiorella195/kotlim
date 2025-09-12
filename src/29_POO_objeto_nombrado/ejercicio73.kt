package `29_POO_objeto_nombrado`

/*
definir un objetcto llamado matematica con un apropiedad que almacene el valor pi
y un metodo qe retorne un valor alateorio en un determinado rango
 */

object Matematica {
    val PI = 3.1416
    fun aleatorio (minimo: Int, maximo: Int)=
        ((Math.random() * (maximo + 1 - minimo))+ minimo).
                toInt()
}

fun main() {
    println("el valor de PI es ${Matematica.PI}")
    println("UN valor aleatorio entre 5 y 10: ")
    println(Matematica.aleatorio(5,10))
}