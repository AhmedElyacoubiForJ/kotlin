package functions

fun main() {
    // call with named arguments
    greet(age = 12, name = "Jamila")
    greet(name = "Jamal", age = 17)
    greet(age = 45, name = "Peter")
}
private fun greet(name: String, age: Int) {
    println("hello $name")
    if (age >= 16) {
        println("$name is an adult")
    } else {
        println("$name is not an adult")
    }
}