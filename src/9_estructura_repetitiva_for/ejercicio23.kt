package `9_estructura_repetitiva_for`
/*Escribir un rpograma que lea 10 notas de alunmo y nos
* informe cuantos tienen notas mayores o menores a 7 y cuantos menores */
fun main() {
    var aprobados =  0
    var reprobados = 0
    for (i in 1 .. 100) {
        print("ingrese nota: ")
        val nota = readln().toInt()
        if (nota >= 7)
            aprobados++
        else
            reprobados++
    }
    println("cantidad de alunmos con notas mayores o iguales a 7: $aprobados ")
    println("cantidad de alunmos con notas menos a 7: $reprobados")
}
