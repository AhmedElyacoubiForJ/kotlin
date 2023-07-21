package arraysandlists

fun main() {
    // in comparison to arrays, lists are expandable
    val names: MutableList<String> = mutableListOf(
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
    names.remove("Peter")
    println(names)
    names.add("Foo")
    println(names)
    println(names.isNotEmpty())

    val emptyList = mutableListOf<Any>()
    println(emptyList.isEmpty())
}