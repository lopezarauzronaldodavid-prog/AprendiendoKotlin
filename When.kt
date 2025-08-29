fun main() {
    val dia = 3

    // --- Uso básico de when ---
    when (dia) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6, 7 -> println("Fin de semana")
        else -> println("Día no válido")
    }

    // --- Uso de when como expresión ---
    val nota = 85
    val resultado = when {
        nota >= 90 -> "Excelente"
        nota >= 70 -> "Aprobado"
        else -> "Reprobado"
    }
    println("Resultado: $resultado")
}