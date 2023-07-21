package arraysandlists

fun main() {
    // don't mix data types in one list
    val list = mutableListOf(
        "Jamila",
        34,
        1.65
    )
    // best way
    val names = mutableListOf<String>(
        "Jamila",
        "Jamal"
    )
    // we can design all these information "Jamila", 34, 1.65
    // to a Person class but in next tasks
}