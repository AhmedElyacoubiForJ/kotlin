package loops

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    // continue keyword
    println("print all expect if value equals to 2")
    for (num in numbers) {
        if (num == 2) continue
        println(num)
    }
    println("print odd number")
    for (num in numbers) {
        if (num % 2 == 0) continue
        println(num)
    }
    println("print even number")
    for (num in numbers) {
        if (num % 2 != 0) continue
        println(num)
    }
    // break keyword
    println("break if value equals to 5")
    for (num in numbers) {
        if (num == 5) break
        println(num)
    }
    println("some other code")
    // continue & break only work for a  conventional for-loops
    // but not for forEach-method from arrays.
    // this is not allowed
    /*numbers.forEach {
        if (it == 5) {
            continue
        }
    }*/
}