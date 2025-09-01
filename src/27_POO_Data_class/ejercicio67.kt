package `27_POO_Data_class`

data class personasn (var nombre: String, val edad: Int) {
    override fun toString(): String {
        return "$nombre, $edad"
    }
}

fun main() {
    var persona1 = personasn ("juan", 22)
    var persona2 = personasn ("ana", 59)

    println(persona1)
    println(persona2)

}