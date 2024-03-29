package loops

fun main() {
    val names = listOf("mary", "ali", "alex")
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    for (name in names) {
        val n = name.replaceFirstChar {
                c: Char -> c.uppercase()
        }
        println(n)
    }

    names.forEach{
        println(it)
    }

    println()

    for (number in numbers) println(number)
}