fun main() {
    // Variables
    val nombre = "Laura"
    val edad = 22
    val ciudad = "Managua"

    // --- Concatenación ---
    val mensaje1 = "Hola " + nombre + ", tienes " + edad + " años y vives en " + ciudad + "."
    println(mensaje1)

    // --- String Templates ---
    val mensaje2 = "Hola $nombre, tienes $edad años y vives en $ciudad."
    println(mensaje2)

    // --- Expresiones dentro de String Template ---
    val mensaje3 = "El año próximo tendrás ${edad + 1} años."
    println(mensaje3)

    // --- Multilínea con String Template ---
    val mensaje4 = """
        Nombre: $nombre
        Edad: $edad
        Ciudad: $ciudad
    """.trimIndent()
    println(mensaje4)
}