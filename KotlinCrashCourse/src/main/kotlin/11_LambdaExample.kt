fun main() {
    val square = { x: Int -> x * x }
    val addition = { x: Int, y: Int -> x + y}


    val myVar = {
        println("hi i am lambda")
        println("sum of a and b is ${245 + 25}")
    }

    myVar()
    println(square(3))
    println("Addition using lambda function ${addition(45, 23).toString()}")


}