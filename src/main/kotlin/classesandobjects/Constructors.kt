package classesandobjects

fun main() {
    val tv = SmartDevice5(
        "Samsung Smart TV",
        999.99
    )
    println("${tv.brand} ${tv.price}")
    tv.turnOn()
    tv.getDeviceState()

    println()

    val phone = SmartDevice5 (
        "Apple Iphone",
        1149.00
    )
    println("${tv.brand} ${tv.price}")
    tv.turnOn()
    tv.getDeviceState()
}

class SmartDevice5(// constructor( key word not needed
    var brand: String,
    var price: Double,
    var isSwitchedOn: Boolean = false,
) {
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
}