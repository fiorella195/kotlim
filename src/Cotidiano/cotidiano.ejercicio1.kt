package Cotidiano

/*solicita al usuanio ingresar dos númenos enteros (pueden ser negatiivos).
Luego, determina cuál de los dos tiene mayor valor absoluto y muestra ese númeno en pantama.
*/
fun main (){
    print("ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor ")
    val valor2 = readln().toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2
    print("el mayor es $mayor")
}
