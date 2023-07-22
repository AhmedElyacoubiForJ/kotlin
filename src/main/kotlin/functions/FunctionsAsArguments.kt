package functions

fun main() {
    // parameter-option {} for foo()-call
    foo {
        println("bar()-call-impl_1.")
    }
    println()
    // parameter-option {} for foo()-call
    foo {
        println("bar()-call-impl_2.")
    }
    println()
    // parameter-option bar = {} for foo()-call
    foo(bar = {
        println("bar()-call-impl_1.")
    })
    println()
    // parameter-option bar = {} for foo()-call
    foo(bar = {
        println("bar()-call-impl_2.")
    })
    println()
    // foo()-call without parameter cause of default implementation
    foo()
}

// foo() has a bar() as parameter
// bar() can have different implementations
// from outside the foo()-call
fun foo(
    name: String = "",
    bar: () -> Unit = {
        println("bar()-call default implementation")
    }
) {
    println("foo()-call")
    bar()
}

// work only if the parameter function is at last
//fun foo(
//    bar: () -> Unit = {
//        println("bar()-call default implementation")
//    }, name: String = ""
//) {
//    println("foo()-call")
//    bar()
//}
