package functions

fun main() {
    greet("Jamila", 12)
    greet("Jamal", 17)
    greet("Peter", 45)
}

private fun greet(name: String, age: Int) {
    println("hello $name")
    if (age >= 16) {
        println("$name is an adult")
    } else {
        println("$name is not an adult")
    }
}
