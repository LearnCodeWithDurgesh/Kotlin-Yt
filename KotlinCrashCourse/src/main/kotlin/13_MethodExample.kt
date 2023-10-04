
fun test()
{

    println("Outside function")
}


class MethodExample
{
    fun test()
    {
        println("Method call")
    }

}

fun main() {
    test()
    val ex=MethodExample()
    ex.test()

}