package oops

abstract class Animal {

    abstract val color: String

    //concrete method
    fun eat() {
        println("Animal is eating")
    }

    //abstract method
    abstract fun speak()
}

class Cat : Animal() {
    override val color: String="Black"

    override fun speak() {
        println("Cat is speaking")
    }
}

fun main() {
    val animal: Animal = Cat()
    animal.eat()
    animal.speak()
}