package conditionals

fun main() {
    val n1 = 30
    val n2 = 20

    // ternary in java
    //var v0 = (n1 >= n2) ? ":)" : ":("

    // ternary in kotlin
    val v1 = if(n1 >= n2) ":)" else ":("
    println(v1)

    val v2 =
        if(n1 <= n2) ":)"
        else if (n1 == 30) "exact"
        else ":("
    println(v2)
}