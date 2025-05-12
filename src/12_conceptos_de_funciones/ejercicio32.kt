package `12_conceptos_de_funciones`

fun presentacion () {
    println("programa que permite carga dos valores por teclado")
    println("efectua la suma de los valores")
    println("muestra el resultado de la suma")
    println("**************************************************")

}

fun cargasuma () {
    print("ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("la suma de los dos valores es: $suma")

}

fun finalizar () {
    println("***************************************")
    println("Gracias por utilizar este programa")

}

fun main() {
    presentacion()
    cargasuma()
    finalizar()
}