package arraysandlists

fun main() {
    val arrayOfNulls = arrayOfNulls<String>(5)

    arrayOfNulls[arrayOfNulls.size - 1] = "hello"
    println(arrayOfNulls.contentToString())

    arrayOfNulls.fill("***")
    println(arrayOfNulls.contentToString())
}