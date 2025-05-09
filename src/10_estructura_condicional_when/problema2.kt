package `10_estructura_condicional_when`
/*
Plantear una estructura que se repita 5 veces y dentro de la misma cargar
 3 valores enteros. Acumular solo el mayor del cada lista de tres valores.
 */
fun main() {
    var total = 0
    var mayores = 0
    for (i in 1..5) {
       println("ingrese los numeros")
        print("numero 1: ")
        val num1 = readln().toInt()
        print("numero 2: ")
        val num2 = readln().toInt()
        print("numero 3:")
        val num3 = readln().toInt()

         when {
            num1 >= num2 && num1 >= num3 ->  mayores += num1
            num2 >= num1 && num2 >= num3 -> mayores += num2
            else -> mayores += num3
        }
    }
    print("la suma de los numeros mayores es: $mayores")
}


