fun main() {
    println("Loops Example")
    var count = 1
//    while (count <= 10)
//    {
////        body statements
//        println("durgesh $count")
//        count++
//    }
//
//    println("Loop exited")

//    do {
//        println("durgesh $count")
//        count++
//    } while (count <= 10);

//    for (i in 100..110)
//    {
//
//        println("For loop $i")
//
//    }
//
//    for (i in 10 downTo 1) {
//        println(i)
//    }
//
//    for (i in 0..100 step 3) {
//        println(i)
//    }
//
//    for (i in 1 ..9) {
//        println("i = $i")
//    }
    val favActivities: Array<String> = arrayOf("cricket", "chess", "music", "programming")
    for (activity in favActivities.reversed()) {
        println(activity)
    }
}