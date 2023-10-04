//create function
fun ramu() {
//    task to execute
//    function body to execute
    println("Pani daal diya")
    println("Completed")
//    any logic you want

}


fun pintu(money: Int, saman: String): String {
    println("OK")
    println("I am  going to buy $saman for $money")
    println("done")
    return "Take $saman  for $money"
}

//starting point
fun main() {
    println("Hi i am main function")
//    function call
    ramu()

//    sayHello()

    val result = pintu(400, "Jalebi")
    println(result)


}

//fun sayHello() {
//    println("Hello how are you?")
//}