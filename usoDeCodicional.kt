fun main(args: Array<String>){
    val name1 = "Maria"
    val name2 = "JuanAntonio"

    // Invocamos el metodo 1
    getLongesName1(name1, name2)

    //Invocamos el metodo 2
    getLongesName2(name1, name2)

    //Invocamos el metodo 3
    getLongesname3(name1,name2)
}

fun getLongesName1(name1: String, name2: String){
    var longesName = name2

    if (name1.length > name2.length) longesName = name1 // esta comprobando cual es el nombre mas largo
    // si name1 es mas largo que name2 se le asigna a logesName si no es mas lago se queda con name2

    println("El nombre mas largo es: $longesName")
}

fun getLongesName2(name1: String, name2: String){
    var longesName = ""

    if(name1.length > name2.length){
        longesName = name1
    }else{
        longesName=name2
    }

    println("El nombre mas largo es: $longesName")
}

// es la diferente forma de como se puede usar la condición if
fun getLongesname3(name1: String, name2: String) {
    // este es un operador ternario en kotlin
    val longesName = if(name1.length > name2.length) name1 else name2

    println("El nombre mas largo es: $longesName")
}