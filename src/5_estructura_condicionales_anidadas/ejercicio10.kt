package `5_estructura_condicionales_anidadas`

fun main(){
print("ingrese primer nota: ")
    val nota1 = readln().toInt()
    print("ingrese segunda nota: ")
    val nota2 = readln().toInt()
    print("ingrese tercera nota: ")
    val nota3 = readln().toInt()

    val promedio = (nota1+nota2+nota3)/3
    if (promedio >= 7)
        print("promedio")
    else
        if (promedio >= 4)
            print("regular")
    else
        print("reprobado ")
}