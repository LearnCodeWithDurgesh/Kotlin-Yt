package oops.other

fun main() {

    val sun = Day.SUN
    println(sun)
    println("Day number ${sun.number}")
    sun.getDetailView()
    val value = Day.SUN





}

enum class Day(val number: Int) {
    SUN(1),
    MON(2),
    TUE(3),
    WED(4),
    THU(5),
    FRI(6),
    SAT(7);

    fun getDetailView() {
        println("Detail View")
    }

}

