package classesandobjects

fun main() {
    val tv1 = SmartDevice7(
        "Samsung Smart TV",
        999.99
    )
    val tv2 = SmartDevice7(
        "Samsung Smart TV",
        999.99
    )
    val tv22 = SmartDevice7(
        "Samsung Smart TV",
        888.88
    )
    println("comparing properties equality of objects.")
    println("== ${tv1 == tv2}")
    println("comparing in memory location.")
    println("=== ${tv1 === tv2}")
    println()
    println("== ${tv1 == tv22}")
    println("comparing in memory location.")
    println("=== ${tv1 === tv22}")
}

class SmartDevice7(
    var brand: String?,
    var price: Double?,
    var isSwitchedOn: Boolean = false
) {
    fun turnOn() {
        isSwitchedOn = true
        println("$brand is switching on")
    }
    fun turnOff() {
        isSwitchedOn = false
        println("$brand is switching off")
    }
    override fun toString(): String {
        return "SmartDevice6(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice7

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }
    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + isSwitchedOn.hashCode()
        return result
    }
}