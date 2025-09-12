package `29_POO_objeto_nombrado`
/* crear un objeto local en la funcion main que permita cargar y alamecene dichos valores en un arreglo. definir una propiedad que almacene 5 enteros y tres metodos: uno que carge los 5 elementos del arreglo
con valores aleatorios comprendidos entre 1 y 5, otro que imprima el arreglo y finalmente otro que retorna el mayor valor del arreglo
 */
fun main() {
    val dados = object {
        val arreglo = IntArray (5)
        fun generar () {
            for (i in arreglo.indices)
                arreglo[i] = ((Math.random() * 6 )+ 1 ).toInt()

        }

        fun imprimir() {
            for (elemento in arreglo)
                println("$elemento -")
            println();
        }

        fun mayor (): Int {
            var may = arreglo [0]
            for (i in arreglo.indices)
                if (arreglo[i] > may)
                    may = arreglo [i]
            return may
        }
    }

    dados.generar()
    dados.imprimir()
    println("mayor valor: ")
    println(dados.mayor())

}