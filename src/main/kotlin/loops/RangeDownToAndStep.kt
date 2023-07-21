package loops

fun main() {
    println("range forward")
    for (i in 1..5) println(i)
    println("range backward")
    for (i in 5 downTo 1) println(i)
    println("range steps in 2's forward")
    for (i in 1..5 step 2) println(i)
    println("range steps in 2's backward")
    for (i in 5 downTo 1 step 2) println(i)
}