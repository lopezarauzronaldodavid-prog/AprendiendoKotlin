fun main() {
    // Variables en Kotlin
    // 'var' -> variable que puede cambiar
    // 'val' -> constante (no se puede cambiar su valor)
    // Enteros
    var edad: Int = 20
    val anioNacimiento: Int = 2005
    // Decimales
    var altura: Double = 1.75
    var peso: Float = 65.4f
    // Caracter
    var inicial: Char = 'R'
    // Texto (String)
    var nombre: String = "Ronaldo"
    // Booleanos
    var esEstudiante: Boolean = true
    var tieneBeca: Boolean = false
    // Mostrando los valores
    println("Nombre: $nombre")
    println("Inicial: $inicial")
    println("Edad: $edad años")
    println("Año de nacimiento: $anioNacimiento")
    println("Altura: $altura m")
    println("Peso: $peso kg")
    println("¿Es estudiante?: $esEstudiante")
    println("¿Tiene beca?: $tieneBeca")
    // Ejemplo de reasignación
    edad = 22 // como es 'var' se puede cambiar
    println("Edad actualizada: $edad")
    // Operaciones con variables
    val suma = edad + 5
    println("En 5 años tendrás: $suma años")
}