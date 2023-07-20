package conditionals

fun main() {
    val n1 = 30
    val n2 = 20

    var result = if (n1 >= 31 && n2 <= n1) {
        println("true")
        ":)"
    } else {
        println("false")
        ":("
    }
    println(result)

    result = if (n1 >= 31 || n2 <= n1) {
        println("true")
        ":)"
    } else {
        println("false")
        ":("
    }
    println(result)

    println("some code")
}