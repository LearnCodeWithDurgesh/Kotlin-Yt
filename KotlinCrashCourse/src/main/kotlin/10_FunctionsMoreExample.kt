fun countDigit1(number: Int): Int {
    var count = 0
    var n = number
    while (n > 0) {
        val r = n % 10
        count++
        n /= 10
    }
    return count
}

fun sayHello(message: String = "how are you?", type: String = "success") {
    if (type == "success") {
        println("success: hello $message")
    }
    else if (type=="warning")
    {
        println("warning : Alert $message")
    }
}

fun main() {

    val resultCount = countDigit1(1212)
    println("Number of digit is $resultCount")
    println("Number of digit is ${countDigit1(13141)}")
    sayHello("I am fine","warning")
    sayHello()
    sayHello(type="warning", message = "This is special message")
}

