import kotlin.math.round
import kotlin.math.roundToInt
import kotlin.math.roundToLong

fun main() {
    val numero = 12.56789

    // --- Redondeo ---
    println("Número original: $numero")
    println("Redondeado (a entero): ${numero.roundToInt()}")
    println("Redondeado (a long): ${numero.roundToLong()}")
    println("Redondeado normal: ${round(numero)}")

    // --- Formateo con decimales ---
    val formateado1 = String.format("%.2f", numero) // 2 decimales
    val formateado2 = String.format("%.3f", numero) // 3 decimales

    println("Formateado a 2 decimales: $formateado1")
    println("Formateado a 3 decimales: $formateado2")
}