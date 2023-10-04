package oops



open class Sohanlal {
    open var property: String = "2000sq.feet."
    open fun buildHouse() {
        println("Build parent house")
        println("solanlal house")
    }

}

class John : Sohanlal() {
    override var property = "4000 sq. feet."
    override fun buildHouse() {
//        println(super.property)
//        super.buildHouse()
        println("John new house")
    }
}

fun main() {
//    val sohanlal = Sohanlal()
//    println(sohanlal.property)
//    sohanlal.buildHouse()
    val john = John()
    println(john.property)
    john.buildHouse()
}
