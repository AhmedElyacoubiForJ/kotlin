package arraysandlists

fun main() {
    val names: MutableList<String> = mutableListOf(
        "Jamila",
        "Jamal",
        "Peter",
        "Ahmed"
    )

    /*
    isn't the better way
    val one = names[0]
    val two = names[1]
    val three = names[2]
    */

    // grab values in order, destructuring the values
    // and that works for array also
    val(one,two, three, four) = names
    println("$one $two $three")

    // using _ to skip elements
    val(one1,two2, _, four4) = names
    println("$one1 $two2 $four4")
}