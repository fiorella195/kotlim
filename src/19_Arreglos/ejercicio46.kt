package `19_Arreglos`
// se desea guardar los sueldos de 5 operarios
fun main() {
    val sueldos: IntArray  //arreglo o lista de tipo entero (entero)
    // se define 5 espacios del 0 al 4
    sueldos = IntArray (5)

    //carga de sus elementos por teclado
    for (i in 0 .. 4 ) {
        print("ingrese el sueldo: ")
        sueldos[i] = readln().toInt()

    }
    //imprension de sus elementos
    for (i in 0 .. 4) {
        println(sueldos[i])
    }
}
