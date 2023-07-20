package conditionals

fun main() {
    val isAdult = true
    val isMale = false
    val isDriver = true

    // && and operator a logical conjunction
    // || or operator a logical disjunction
    println(isAdult || isMale)
    println(isAdult && isMale && isDriver)
    // ! is not operator
    println(!isAdult)
    // is not female
    println(!isMale)

    println(isAdult && (isMale && isDriver))
    println(isAdult && (isMale || isDriver))
}