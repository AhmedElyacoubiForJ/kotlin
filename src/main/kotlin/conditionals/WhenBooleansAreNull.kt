package conditionals

fun main() {
    val isAdult: Boolean? = null
    
    // when boolean is null we must perform this check
    if (isAdult == true) {
        println("not null and true")
    } else {
        println("false or null")
    }
}