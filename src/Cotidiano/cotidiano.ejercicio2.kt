package Cotidiano

/*solicita al usuanto que ingrese su edad. Almacena una descripción en una variable usando una expresión if:
Si es menor de 13, asigna "Niño".
Si está entre 13 y 17 inclusive, asigna "Adolescente".
18 0 mas, astana "AduLte.*
 */


fun main (){
    print("ingrese su edad:")
    val edad = readln().toInt()
    val Edad = if (edad < 13 ) {
        print("niño")
    } else {
        val edad =if (edad <= 13){
            print("adolecente")
        } else {
            val edad = if (edad > 17) {
                print ("adulto")
            }else {
            }
        }

    }
}


