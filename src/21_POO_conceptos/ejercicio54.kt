package `21_POO_conceptos`

class triangulo {
    var lado1: Int = 0
    var lado2: Int = 0
    var lado3: Int = 0

    fun inicializar () {
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
    val triangulo1 = triangulo()
    triangulo1.inicializar()
    triangulo1.ladoMayor()
    triangulo1.equilatero()

}
