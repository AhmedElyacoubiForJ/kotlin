package loops

fun main() {
    while (false) {
        println("hello while-loop")
    }
    // difference between while-loop & do-while-loop
    // is that the last one it will be executed at least one time
    do {
        println("hello do-while-loop")
    } while (false)
}