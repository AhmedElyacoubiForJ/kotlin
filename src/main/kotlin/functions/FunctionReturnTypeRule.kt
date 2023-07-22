package functions

fun main() {}

// definition w. Unit key word is optional
// s. funOneOptional()
fun funOne() : Unit {
    println("some implementation")
}
fun funOneOptional() {
    println("some implementation")
}
// return type always required
fun addition(operand1: Int, operand2: Int): Int {
    return operand1 + operand2
}
// fun. def. as expression return type not required
fun additionAsExpression(operand1: Int, operand2: Int) = operand1 + operand2

