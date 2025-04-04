package `5_estructura_condicionales_anidadas`
/*Confeccionar un programa que permita cargar un número entero positivo de hasta
tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un
 mensaje de error si el número de cifras es mayor.
 */

fun main (){
print("ingrese un numero:")
    val num = readln().toInt()

    val resultado = if (num <= 9 )
        print("tiene un digito 1 digitos ")
    else
        if (num <= 99  )
            print("el numero tiene 2 digito ")
            else
                if (num <= 999)
                    print("el numero tiene 3 digitos ")
    else
        println("Error")

}