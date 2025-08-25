fun usoVariable(){
    // el uso de val se refiere a variable inmutable que no cambia su valor (constate)
    val nombre = "sergio"
    // nombre = "daniel" si se hace eso se marcar un error
    println(nombre)

    //el uso de var puede cambiar el valor de una variable
    var persona = "juan david"
    persona = "Manuel jose"

    println(persona)

    /* tipo de datos en kotlin es un leguaje fuertemente tipado es decir
    que no se necesita definir el tipo de datos, pero también es flexible que
    uno puede definir el tipo de datos, puede usar var y val
     */
    // ejemplo de como se puede declarar variable segun el tipo de dato
    var texto:String
    var entero: Int
    var decimal1:Double
    var decimal2: Float
    var boleano : Boolean
    var caracter : Char

    /* si no quieres definir el tipo de datos solo declara la variable usando val o var pero
    este tipo de variable tiene que usarse en el mismo momento que se declara, ejemplo:
     */

    println("ingrese su edad: ")
    var edad = readLine()?.toIntOrNull() ?: 0 // Convierte a Int, si es null usa 0
}

// metodo principal de pragrama (main)
fun main(){
    usoVariable()
}