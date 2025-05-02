package `7_estructura_repetitiva_while`
/*
En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un
programa que lea los sueldos que cobra cada empleado e informe cuántos empleados cobran entre
$100 y $300 y cuántos cobran más de $300.
Además el programa deberá informar el importe que gasta la empresa en sueldos al personal.
 */

fun main() {
    print("¿Cuántos empleados tiene la empresa?: ")
    val n = readln().toInt()
    var x = 1
    var empleadosmenores = 0
    var empleadosmayores = 0
    var gastoTotal = 0.0

    while (x <= n) {
        print("Ingrese el sueldo del empleado $x: ")
        val sueldo = readln().toDouble()
        gastoTotal += sueldo

        if (sueldo in 100.0..300.0) {
            empleadosmenores = +1
        } else if (sueldo > 300) {
            empleadosmayores = +1
        }

        x += 1
    }

    println("Empleados que cobran entre $100 y $300: $empleadosmayores")
    println("Empleados que cobran más de $300: $empleadosmenores")
    println("Gasto total en sueldos: $$gastoTotal")
}
