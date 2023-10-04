fun nNames(vararg names: String) {
    println(names::class.java.name)

}

fun sumNNumbers(vararg nums: Int) {
    var sum = 0
    for (value in nums) {
        println(value)
        sum += value
    }
    println("sum is $sum")
}


fun sumTwoNumbers(
    number1: Int,
    number2: Int,
    callBack: () -> Unit
) {
    println("Sum of two numbers is ${number1 + number2}")
    callBack()
}


fun cube(number: Int, callBack: (message: String) -> Unit):
            (number: String) -> Unit {
    println("Cube is ${number * number * number}")
    callBack("cube calculated")
    return callBack
}


fun main() {
//    val callBackFunction = {
//        println("Sum completed")
//    }
//    sumTwoNumbers(12, 34, callBackFunction)
//    sumTwoNumbers(11, 12) {
//        println("this is another method two call lambda")
//    }
//
//    val reFun=cube(3) {
//        println(it)
//    }
//
//    reFun("returned function")
    sumNNumbers(12, 23, 12, 12)
    nNames("durgesh")
}