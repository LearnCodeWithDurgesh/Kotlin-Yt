package oops

class User {
    var userId: String = "defaultid"
        get() {
            println("getting values")
            return field
        }
        set(value) {
            println("setting value $value")
            if (value.isEmpty()) {
                println("Invalid Value for userid !!")
            }
            field = value
        }

    var userName: String = ""
        set(userName) {
            field = userName
        }
        get() = field

}


fun main() {

    val user1 = User()
    println(user1.userId)

    user1.userId = "aghioahgoa"


}