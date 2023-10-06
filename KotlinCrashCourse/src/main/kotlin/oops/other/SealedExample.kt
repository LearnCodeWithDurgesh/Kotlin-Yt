package oops.other


sealed class Ball {

}


class GreenBall(val color: String = "Green") : Ball() {


}

class BlueBall(val color: String = "Blue") : Ball() {

}

class RedBall(val color: String = "Red") : Ball() {

}

fun main() {


    val value: Ball = BlueBall("Orange")



    when (value) {
        is RedBall -> println("this is ${value.color} ball")
        is BlueBall -> println("this is ${value.color} ball")
        is GreenBall -> println("this is ${value.color} ball")
    }


}

