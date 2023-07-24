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

    val laptop = SmartDevice5()
    laptop.brand = "Acer aspire E 15"
    laptop.price = 399.00
    println("${laptop.brand} ${laptop.price}")
    laptop.turnOn()
    laptop.getDeviceState()

    println()

    val laptop2 = SmartDevice5("Lenovo")
    laptop2.price = 559.00
    println("${laptop2.brand} ${laptop2.price}")
    laptop2.turnOn()
    laptop2.getDeviceState()
}

class SmartDevice5(// constructor( key word not needed
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
}