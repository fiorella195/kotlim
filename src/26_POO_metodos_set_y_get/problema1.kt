package `26_POO_metodos_set_y_get`

class Jardin (var tipo: Int, largo: Double,ancho: Double) {

        var TipoZacate: Int
        set(valor) {
            when (tipo) {
                1 -> println("CRIOLLO")
                2 -> println("AMERICANO")
                3 -> println("SINTETICO")
                else -> println("no valido")
            }
        }
        get() {
            return tipo
        }



    var largo: Double = 0.0
        set(valor) {
            if (valor >= 0 )
                field = valor
            else
                field = 1.0

        }
        get () {
            return field

        }

    var ancho: Double = 0.0
        set (valor) {
            if (valor >= 0 )
                field = valor
            else
                field = 1.0
        }
        get() {
            return field

        }

    var area: Double = 0.0
        set (valor) {
            area = largo * ancho
            area = valor
            field = valor
        }
        get() {
            return field
        }

    var ManoDeObra: Double = 0.0
        set(valor) {
            field = area * 500
        }
        get() {
            return field
        }

    fun PrecioZacate () {

       var precio: Int =
           when (TipoZacate) {
               1 -> 1000
               2 -> 1500
               3 -> 2000
               else -> 0
           }

    }
    var subtotal: Double = 0.0
        set (valor) {
            field = area * tipo
        }
        get () {
            return field
        }

    var impuesto: Double = 0.0
        set(valor) {
            field = valor
            field = subtotal * 0.13
        }
        get() {
            return field
        }

    var total: Double = 0.0
        set(valor) {
            field = subtotal + impuesto
        }
        get() {
            return field
        }

    fun desglose () {

        println("Dimensiones del jardín largo:$largo y ancho: $ancho")
        println("Área total a enzacatar: $area")
        println("Costo de mano de obra: $ManoDeObra")
        println("Costo del zacate: $tipo")
        println("Subtotal: $subtotal")
        println("Impuesto: $impuesto")
        println("Total a pagar: $total ")
    }

    fun imprimirDetalles () {

        desglose()

    }
}

fun main() {
    val cliente1 = Jardin(2,5.0,3.6)
    cliente1.imprimirDetalles()
}