package classesandobjects

fun main() {
    val tv = SmartDevice3()
    tv.brand = "Samsung Smart TV"
    tv.price = 999.99
    println("${tv.brand} ${tv.price}")

    val phone = SmartDevice3()
    phone.brand = "Apple Iphone"
    phone.price = 1149.00
    println("${phone.brand} ${phone.price}")
}

class SmartDevice3 {
    var brand: String = ""
        // redundant getter & setter
        get() = field
        //get() = "foo"
        
        set(value) {
            field = value.uppercase()
        }
    var price: Double = 0.0
        //get() = field
        //set(value) {
        //    field = value
        //}
}