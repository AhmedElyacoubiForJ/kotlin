package classesandobjects

fun main() {
    val tv = SmartDevice6(
        "Samsung Smart TV",
        999.99
    )
    println(tv)
    tv.turnOn()
    println(tv)
}

class SmartDevice6(
    var brand: String?,
    var price: Double?,
    var isSwitchedOn: Boolean = false
) {
    // other constructors
    constructor(): this(brand = null, price = null)
    constructor(brand: String) : this(brand, price = 0.0)

    // methods/functions
    fun getDeviceState() {
        println("$brand is on: $isSwitchedOn")
    }
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
}