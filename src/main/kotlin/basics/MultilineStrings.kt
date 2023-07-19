package basics

fun main() {
    val msg = """
        Hello
            %s
                How
            Are
        You
        """.trimIndent()
    println(msg.format("Ahmed"))
}