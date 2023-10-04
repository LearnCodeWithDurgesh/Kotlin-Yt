fun main() {


    println("Enter marks: ")
    val marks = readln().toInt()
//
//    val grade: Char = if (marks in 91..100) {
//        'A'
//    } else if (marks in 81..90) {
//        'B'
//    } else if (marks in 71..80) {
//        'B'
//    } else {
//        'F'
//    }

    val grade: Char = when (marks) {
        in 91..100 -> 'A'
        in 81..90 -> 'B'
        in 71..80 -> {
            println("testing")
            'C'
        }

        else -> {
            'F'
        }
    }


    println("Grade is $grade")

}

