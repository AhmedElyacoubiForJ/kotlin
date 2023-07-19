package basics

fun main() {
    // How to compare string in kotlin
    val name1 = "Ahmed"
    val name2 = "Ahmed"
    val name3 = "ahmed"

    println("2 strings comparison same value with == : ${name1 == name2}")
    println("2 strings comparison same value with .equals : ${name1.equals(name2)}")

    println(name1.equals(name3))
    println(name1 == name3)

    println(" ${name1 === name2}")

    // memory location comparison
    println("same concept like java")
    println("comparison 2 strings s. value auf ref. with === : ${name1 === String("Ahmed".toCharArray())}")
    println("(String Pool) comparison 2 strings s. value auf ref. with === : ${name1 === name2}")




}

