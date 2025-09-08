package `28_POO_enum_class`
/*
declarar un enum class que representa las cuentro operciones basicas, asociadas a cada constantede String
con el signo de laoperacion

definir una class operacion que defina tres propiedades las dos primeras deben ser los numeros y la tercera
el tipo de opercion
 */
enum class TipoOperacion(val tipo: String){
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACION("*"),
    DIVISION("/")
}

class Operacion(var num1: Int, var num2: Int, var tipoOperacion: TipoOperacion){

    fun operar(){
        var resultado: Int = 0
        when(tipoOperacion){
            TipoOperacion.SUMA -> resultado = num1 + num2
            TipoOperacion.RESTA -> resultado = num1 - num2
            TipoOperacion.MULTIPLICACION -> resultado = num1 * num2
            TipoOperacion.DIVISION -> resultado = num1 / num2
        }
        println("$num1 ${tipoOperacion.tipo} $num2 es igual a $resultado")
    }

}

fun main(){
    val operacion1 = Operacion(10, 4, TipoOperacion.SUMA)
    operacion1.operar()
}
