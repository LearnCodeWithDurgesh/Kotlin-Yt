//WAP to take a number from user and count the digit.
//WAP to take number from user and reverse.
//WAP to take number from user and find the sum of cube of each digit of number
//WAP to take number from user and check prime number

fun countDigit(number: Int) {
//    logic for count digit
    var count = 0
    var n = number
    while (n > 0) {
        val r = n % 10
        count++
        n = n / 10
    }
    println("Number of digits is $count")

}

fun reverseNumber(number: Int): Int {
//    reverse logic
    var n = number
    var rev: Int = 0
    while (n != 0) {
        val r = n % 10
        rev = rev * 10 + r
        n = n / 10
    }
    println("reverse is $rev")
    return rev

}

fun checkPrime(number: Int): Boolean {

    var isPrime = true
    for (i in 2..<number) {
        if (number % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime

//    for (i in 1..n) {
//        if (n % i == 0) {
//            factorCount++
//        }
//    }
//    println("Factors : $factorCount")
//
//    return if (factorCount == 2)
//        true
//    else
//        false


}

fun main() {
    println("Enter number ")
    val number: Int = readln().toInt()
//    countDigit(number)
//    reverseNumber(number)
    if (checkPrime(number)) {
        println("Number is prime")
    } else {
        println("Number is not prime number")
    }



}