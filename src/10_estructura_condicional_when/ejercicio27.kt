package `10_estructura_condicional_when`

/*
confeccione un programa que pida por teclado tres notas de un alunmo, calcule el promedio
e imprima alguno de estos mensajes:

si el promedio es > = 7 mostrar aprobado
si el promedio es > = >4 y >7 mostrar regular
si el promedio es <4 mostrar reprobado
 */

fun main() {
    print("ingrese primera nota: ")
    val nota1 = readln().toInt()
    print("ingrese segunda nota: ")
    val nota2 = readln().toInt()
    print("ingrese tercera nota: ")
    val nota3 = readln().toInt()
    val promedio = (nota1 + nota2 + nota3) / 3
    when {
        promedio >=7 -> print("aprobado ")
        promedio >= 4 -> print("regular")
        else -> print("reprobado")

    }
}