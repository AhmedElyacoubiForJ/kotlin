package conditionals

fun main() {
    // when in kotlin is like switch in java
    var gender = 'F'
    when (gender) {
        'F' -> println("Female")
        'M' -> println("Male")
        else -> println("Unknown gender")
    }

    gender = 'M'
    when (gender) {
        'F' -> println("Female")
        'M' -> println("Male")
        else -> println("Unknown gender")
    }

    gender = 'U'
    when (gender) {
        'F' -> println("Female")
        'M' -> println("Male")
        else -> println("Unknown gender")
    }

    // when as expression
    gender = 'M'
    var result = when (gender) {
        'F' -> "Female"
        'M' -> "Male"
        else -> "Unknown gender"
    }
    println(result)

    gender = 'Ö'
    result = when (gender) {
        'F' -> "Female"
        'M' -> "Male"
        else -> "Unknown gender"
    }
    println(result)

}