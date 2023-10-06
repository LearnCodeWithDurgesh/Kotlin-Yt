package oops

interface MyInter {
    val p1: String
    fun m1()
    fun m2() {
        println("this is interface m2 method")
    }
}

interface Cloneable {
    fun clone()
}

interface Runnable {
    fun run()
}

class Child1 : MyInter, Cloneable, Runnable {

    override val p1: String = "this is property of p1 in child1"
    override fun m1() {
        println("this is m1 of child1")
    }

    override fun clone() {
        println("Cloning child1")
    }

    override fun run() {
        println("running child 1")
    }
}

fun main() {

    val inter = Child1()
    inter.m1()
    inter.m2()
    println(
        inter.p1
    )
}