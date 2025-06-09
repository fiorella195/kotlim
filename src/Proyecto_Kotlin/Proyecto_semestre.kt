
/*
Hola profe, si ve muchos comentarios es para saber para que funciona cada cosa,
para a la hora de estudiar no quedarme pensando por que o como hice algunas cosas
son como mis apuntes :)

tambien cuando se pone la nota despues sale lo de exelente, muy bien, etc...
sale esto "[Ljava.lang.String;@72ea2f77:" no tengo ni idea que es, ni si afecta :(
 */


//en modo String por que es el nombre de los estudiantes
fun registrarNota(nombre: String): Int {
    var Rnota: Int       //Rnota = registro de notas
    do {
        print("ingrese nota del estudiante $nombre (0 al 100): ")
        Rnota = readln().toInt()
        if (Rnota < 0 || Rnota > 100 ) {
            println("nota no valida, intente de nuevo")
        }
    } while (Rnota < 0 || Rnota > 100)
    return Rnota     //return:  detiene la ejecución de esa función y devuelve
                     // el control a la función que la llamó.
}


fun main() {
    //arrayOF: lista de variables, siempre empieza por 0
    val estudiantes = arrayOf("Ana", "Luis", "Carlos", "Sofia", "Jorge")

    var suma = 0 //var de suma para el promedio

    var notaAlta = 0 //empieza en 0 para q vaya "sumando" hasta el valor mas alto
    var notaBaja = 100 //empieza por 100 para q vaya "restando" hasta que ingresen el valor mas bajo



    for (estudiante in estudiantes) {    // o sea hasta la cantidad de estudiantes que hay que son 5
        val nota = registrarNota(estudiante)
        // que nota es igual a Rnota pero que nombre lleva el "valor" asignado
        // o sea el nombre de los estudiantes del 0 al 4

        suma += nota // va sumando cada nota a la suma total para despues sacar el promedio

        if (nota > notaAlta) {
            notaAlta = nota
            // si nota es mayor a el anterior valor de notaAlta el nuevo valor de notaAlat sera ese
            // ejem: notaAlta = 23 pero una nueva nota es mayor a 23, notaAlta tendra ese valor

        }
        if (nota <notaBaja) {
            notaBaja = nota
            //lo mismo que con notaAlta pero ahora si se encuentra un valor menor
        }

        when (nota) {
            in  90..100 -> println("${estudiantes}: Excelente ")
            in  80..89 -> println("${estudiantes}: Muy bien ")
            in  70..79 -> println("${estudiantes}: Bien ")
            else -> println("${estudiantes}: Reprobado")
            // se indica en el rango que esta segun la nota indicada
        }
    //todo dentro de un for para que se repita 5 veces, con cada estudiente
    }

    val promedio = suma / 5
    println("----------------------------------------------")
    println("Resumen de las notas")
    println("promedio de notas: $promedio")
    println("la nota mas baja es de: $notaBaja")
    println("la nota mas alta es de: $notaAlta")
}
