fun main() {
    // Operadores matemáticos básicos
    val a = 10
    val b = 4

    println("Suma: ${a + b}")
    println("Resta: ${a - b}")
    println("Multiplicación: ${a * b}")
    println("División entera: ${a / b}")
    println("Módulo: ${a % b}")

    // Conversión de tipos
    val numeroStr = "20"
    val numeroInt = numeroStr.toInt()   // String -> Int
    val numeroDouble = numeroStr.toDouble() // String -> Double

    println("Número en String: $numeroStr")
    println("Convertido a Int: $numeroInt")
    println("Convertido a Double: $numeroDouble")
}