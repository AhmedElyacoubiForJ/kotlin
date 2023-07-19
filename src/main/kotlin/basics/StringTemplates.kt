package basics

fun main() {
    var name = "Ahmed"
    println(name)
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())
    println(name[0])
    println(name[4])
    println(name.isEmpty())
    println("".isEmpty())
    println(" ".isEmpty())
    println(name.lastIndex)

    val age = 55
    // don't do this
    val msg1 = name + " " + age
    println(msg1)
    // better way is string template
    val msg2 = "Name: $name, Age: $age" // Expression
    println(msg2)
    val msg3 = "Name: $name, Age: ${age + 1}" // Expression
    println(msg3)
    val msg4 = "Name: ${name.uppercase()}, Age: ${age + 1}" // Expression
    println(msg4)
}