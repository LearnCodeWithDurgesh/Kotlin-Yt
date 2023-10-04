package oops

class Car {

    var price: Double;
    var carModel: String;
    var carColor: String;

    constructor(carModel: String, carColor: String) : this(carModel, carColor, 0.0) {
        println("First constructor")
    }

    constructor(model: String, color: String, price: Double) {
        this.carColor = color
        this.carModel = model
        this.price = price
        println("Second constructor")
    }

    fun displayDetails() {
        println(carModel)
        println(carColor)
        println(price)
    }


}

fun main() {

    val car1 = Car("CAR ABC", "Blue")
    car1.displayDetails()
//    var car2 = Car("TATA ABC", "WHITE", 2020202.0)
//    car2.displayDetails()
}