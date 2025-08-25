fun main(){
    val numeros = intArrayOf(1,2,3,4,5,6,7)

    for (numero: Int in numeros) println(numero) // uso del ciclo forEch

    // puedes tambien el valor de indice del arreglo
    println("**** Números pares ****")
    val numeroPares = intArrayOf(0,2,4,6,8,10)
    for((indice, valor)in numeroPares.withIndex()){
        println("Elemento $indice: $valor")
    }

    println()

    // esta es otra forma de hacer un recorrido
    for(i in 1..10) println(i)
}