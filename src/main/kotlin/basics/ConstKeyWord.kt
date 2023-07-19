package basics

// is known before code execution
const val PI = 3.14 // final static like Java
//const val PI_2 = getPiValue()
val pi = getPiValue()

fun main() {
    val name = "El Yacoubi" // read only. final like Java
    //name = ""

    var i = 0 // mutable
    // i = 1

    // mussed declared outside the function
    //const val PI = 3.14 // final static like Java
}

fun getPiValue(): Double = 3.14