package classesandobjects

fun main() {
    val tv = SmartDevice4()
    tv.brand = "Samsung Smart TV"
    tv.price = 999.99
    println("${tv.brand} ${tv.price}")
    tv.turnOn()
    tv.getDeviceState()

    println()
    
    val phone = SmartDevice4()
    phone.brand = "Apple Iphone"
    phone.price = 1149.00
    println("${phone.brand} ${phone.price}")
    phone.turnOn()
    tv.getDeviceState()
    tv.turnOff()
    tv.getDeviceState()
}

class SmartDevice4 {
    // properties
    var brand: String = ""
    var price: Double = 0.0
    var isSwitchedOn: Boolean = false

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