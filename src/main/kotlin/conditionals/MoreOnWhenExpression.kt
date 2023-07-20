package conditionals

fun main() {
    // go from if-elseIf-else to when expression
    var n1 = 30
    var n2 = 20

    when  {
        (n1 >= n2 || n1 <= 30) -> println(":)")
        (n1 == 100) -> println("foo 100")
        (n1 == 200) -> println("foo 200")
        (n1 == 300) -> println("foo 300")
        else -> println(":(")
    }

    n1 = 100
    when  {
        (n1 >= n2 || n1 <= 30) -> println(":)")
        (n1 == 100) -> println("foo 100")
        (n1 == 200) -> println("foo 200")
        (n1 == 300) -> println("foo 300")
        else -> println(":(")
    }

    n1 = 100
    when  {
        (n1 == n2 || n1 <= 31) -> println(":)")
        (n1 == 100) -> println("foo 100")
        (n1 == 200) -> println("foo 200")
        (n1 == 300) -> println("foo 300")
        else -> println(":(")
    }

    val age = 99
    when (age) {
        in 13..19 -> println("teenager")
        !in 0..12 -> println("")
        else -> println("")
    }
}