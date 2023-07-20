package conditionals

fun main() {
    val n1 = 30
    val n2 = 20
    println("if begin")
    if (n1 > n2) {
        println(":)")
    }
    println("if end")
    println("if begin")
    if (n1 > n2 && n1 >= 30) {
        println(":)")
    }
    println("if end")
    println("if begin")
    if (n1 > n2 && n1 >= 31) {
        println(":)")
    }
    println("if end")
    println("if begin")
    if (n1 > n2 || n1 >= 31) {
        println(":)")
    }
    println("if end")

    println("some code")
}