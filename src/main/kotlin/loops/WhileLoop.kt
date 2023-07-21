package loops

fun main() {
    var number = 1
    while (number <= 5) {
        println("Number: $number")
        ++number
    }
    println()
    number = 5
    while (number >= 1) {
        println("Number: $number")
        --number
    }
    println()
    val brand = "Amigoscode"
    var index = brand.length - 1
    while (index >= 0) {
        println("letter at $index: ${brand[index]}")
        --index
    }
    println()
    index = 0
    while (index <= brand.length - 1) {
        println("letter at $index: ${brand[index]}")
        ++index
    }
    println()
    val brandAsArray = arrayOf(
        'A','m','i'
    )
    index = 0
    while (index <= brandAsArray.size - 1) {
        println("letter at $index: ${brandAsArray[index]}")
        ++index
    }
}