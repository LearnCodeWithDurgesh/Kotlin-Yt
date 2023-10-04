class User(
    val name: String,
    val phone: String,
    val address: String
) {
    fun ramu() {
        println(name)
        println(phone)
        println(address)
    }
}

fun main() {
    val number1: Int = 34
    val number2: Byte = 12
    val number3: Short = 56
    val number4: Long = 342345252
    val marks: Float = 34.67F
    val marksInComputer: Double = 1232.46
    val ch: Char = 'Q'
    val isActive: Boolean = false
    val userName: String = "John Tiwari"
    val message: String = "I love kotlin and i am going to program android apps"
    val favActivities: Array<String> = arrayOf("cricket", "chess", "music", "programming")
    println(favActivities[1])
    println(favActivities[2])
    favActivities[2] = "Listen Music"
    println(favActivities[2])
    println("number 1 is $number1")
    val user1: User = User("Durgesh", "252525", "Gomti Nagar lucknow")
    user1.ramu()

}