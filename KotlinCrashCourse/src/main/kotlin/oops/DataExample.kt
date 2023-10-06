package oops

class Test
{
    override fun toString(): String {
        return "this is tostring test"
    }
}

data class Person(var name: String, var age:Int) {

}

fun main() {
    val person1=Person("durgesh",26)
    println(person1.age)
    println(person1.name)
    val person1Copy = person1.copy()

    println(person1Copy.age)
    println(person1Copy.name)
    person1Copy.name="Ankit"
    println(person1.name)
    println(person1Copy.name)
    println("----------------")
    println(person1)
    println(person1Copy)

    println(Test())

}