package oops

import jdk.swing.interop.SwingInterOpUtils


fun calculateArea(shape: Shape) {
//    calculate area
    shape.findArea()
}

fun main() {
    val shape: Shape = Rectangle()
    calculateArea(shape)
}

open class Shape {
    open fun findArea() {
        println("finding area of shape")
    }

}

class Circle : Shape() {
    override fun findArea() {

        println("Finding area of circle")

    }
}

class Rectangle : Shape() {
    override fun findArea() {
        println("Finding area of rectangle")
    }
}



