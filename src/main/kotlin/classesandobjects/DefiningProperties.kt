package classesandobjects

fun main() {
    val tv = SmartDevice2()
    tv.brand = "Samsung Smart TV"
    tv.price = 999.99

    val phone = SmartDevice2()
    phone.brand = "Apple Iphone"
    phone.price = 1149.00
}

class SmartDevice2 {
    var brand: String = ""
    var price: Double = 0.0
}