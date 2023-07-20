package arraysandlists

fun main() {
    // the size of the arrayOf can't be expanded
    val names = arrayOf(
       "Jamal", "Jamila", "Ahmed"
   )
    println(names)
    println(names.contentToString())
    println(names[0])
    names[0] = names[0].uppercase()
    println(names[1])
    names[1] = names[1].lowercase()
    println(names[2])
    names[2] = ""

    println(names.contentToString())
    println(names.size)

    if ("Jamila".lowercase() in names) {
        println("name found")
    } else {
        println("name not found")
    }

// println(names[3]) java.lang.ArrayIndexOutOfBoundsException
}
