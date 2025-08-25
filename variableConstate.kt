// este tipo de variable se puede usar en cualquier parte del codigo
// ya sea funciones o main (se el conoce tambien como variable globales)
const val Num1 = 20
const val Num2 = 30

fun multiplicar(){
    var result = Num1*Num2
    println("el resultado es: $result")
}

fun main(){
    multiplicar()
}