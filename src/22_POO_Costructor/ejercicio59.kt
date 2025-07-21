package `22_POO_Costructor`

class trianguloo (var lado1: Int, var lado2: Int, var lado3: Int) {

    constructor() : this(0,0,0) {
        print("ingrese lado 1: ")
        lado1 = readln().toInt()
        print("ingrese lado 2: ")
        lado2 = readln().toInt()
        print("ingrese lado 3: ")
        lado3 = readln().toInt()
    }


    fun ladoMayor (){
        print("lado mayor: ")
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)

        }
    }
    fun equilatero() {
        if (lado1 == lado2 && lado1 == lado3)
            println("es un triangulo equilatero")
        else
            println("no es un triangulo equilatero")
    }
}

fun main() {
    val triangulo1 = trianguloo(12,45,24)
    triangulo1.ladoMayor()
    triangulo1.equilatero()

}







