package basics

fun main() {
    var name: String = "El Yacoubi"
    // in java you can assign null to variables but kotlin no
    // name = null
    println(name.uppercase())

    // allowed only with ?
    var brand: String? = null
    // println(brand.uppercase()) not allowed
    println(brand?.uppercase())
}