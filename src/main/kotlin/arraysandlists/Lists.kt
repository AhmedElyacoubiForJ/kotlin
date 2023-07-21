package arraysandlists

fun main() {
    // in comparison to arrays, lists are expandable
    val names: List<String> = listOf(
        "Jamila",
        "Jamal",
        "Peter",
        "Ahmed"
    )
    println(names[0])
    println(names.size)
    println(names.contains("Peter"))
    println(names.contains("Foo"))
    println(names.first())
    println(names.last())
    println(names.indexOf("Peter"))
    println(names)

    // can't add a new element because listOf is a read only list
    //names.add("s")
}