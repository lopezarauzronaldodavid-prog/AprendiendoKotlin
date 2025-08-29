fun main() {
    val numero = 15

    // --- Condición if-else ---
    if (numero > 0) {
        println("El número es positivo")
    } else if (numero < 0) {
        println("El número es negativo")
    } else {
        println("El número es cero")
    }

    // --- Operadores relacionales ---
    val a = 10
    val b = 20

    println("a == b: ${a == b}") // Igual
    println("a != b: ${a != b}") // Diferente
    println("a > b: ${a > b}")
    println("a < b: ${a < b}")
    println("a >= b: ${a >= b}")
    println("a <= b: ${a <= b}")

    // --- Operadores lógicos ---
    val edad = 18
    val tieneID = true

    if (edad >= 18 && tieneID) {
        println("Puede entrar a la discoteca")
    } else {
        println("No puede entrar")
    }
}