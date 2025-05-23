package `14_funciones_con_retorno`

fun largo (nombre: String): Int {
    return nombre.length

}

fun main() {
    println("Ingrese un nombre: ")
    val nombre1 = readln()
    println("ingrese otro nombre: ")
    val nombre2 = readln()
    if (largo(nombre1) == largo(nombre2))
        println("los nombres $nombre1 y $nombre2 tiene la misma cantidad de caracteres")
    else
        if (largo(nombre1) > largo(nombre2))
            println("$nombre1 es mas largo")
        else
            print("$nombre2 es mas largo")
}