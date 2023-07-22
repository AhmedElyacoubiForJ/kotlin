package functions

fun main() {
    val (v01, v02) = returnTwoValues()
    println("1st value: $v01, 2nd value: $v02")

    println()

    val (v11, v12, v13) = returnThreeValues()
    println("1st value: $v11, 2nd value: $v12, 3t value: $v13")
}
// def. of the 2 functions as single expression
fun returnTwoValues(): Pair<String, Int> = "Amigos" to 20
// or
fun returnTwoValues2(): Pair<String, Int> = Pair("Amigos", 20)

fun returnThreeValues(): Triple<String, Int, Char> =
    Triple("Peter", 55, 'M')
/*
    fun returnTwoValues(): Pair<String, Int> {
        return "Amigos" to 20
    }
*/
/*
    fun returnThreeValues(): Triple<String, Int, Char> {
        return Triple("Peter", 55, 'M')
    }
*/
