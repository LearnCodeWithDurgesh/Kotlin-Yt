fun main() {


//    Logical Operators
    val paper1 = 10
    val paper2 = 11

    if (paper1 > 60 || paper2 > 60) {
        println("Bike ")
    } else {
        println("Chata")
    }

    var isPassed = true
    if (!isPassed) {
        println("You are pass")
    } else {
        println("You are not pass")
    }


//    Comparison operator


    var dabba1 = 45
    var dabba2 = 46


    if (dabba1 > dabba2) {
        println("dabba1 is greater than dabba2")
    } else {
        println("dabba2 is greater than dabba1")
    }

    println(dabba1 == dabba2)
    println(dabba1 != dabba2)
    println(dabba1 > dabba2)
    println(dabba1 < dabba2)
    println(dabba1 >= dabba2)


//    Arithmetic Assignment operator

    var temp1 = 30
    var temp2 = 40

    temp1 += temp2
    println(temp1)
    temp1 -= temp2
    println(temp1)
    temp1 *= temp2
    println(temp1)
    temp1 /= temp2
    println(temp1)
    temp1 %= temp2
    println(temp1)


//    Assignment operator
    var name = "Substring Technologies"
    name = "Learn Code With Durgesh"


//    Arithmetic Operations
    val x = 100
    val y = 5

    println(x + y)
    println(x - y)
    println(x * y)
    println(x / y)
    println(x % y)
    var temp = 60
    val inc = temp.inc()
    println("Increment : " + inc)

    println(x.plus(y))
    println(x.minus(y))


}