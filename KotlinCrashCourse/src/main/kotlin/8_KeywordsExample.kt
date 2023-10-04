import java.util.ArrayList as SubList

typealias  DkSet=HashSet<String>


interface DkInter<in T> {
    fun display(value: T);
}

interface DkInter2<out T> {
    fun display(): T
}

fun main() {


    val set=DkSet()
    set.add("a")
    set.add("b")
    set.add("c")
    set.add("d")
    set.add("e")
    set.add("f")
    set.add("g")
    set.add("durgesh")
    println(set)


    val ob: Any = "String"

    if (ob is String) {
        println(ob.length)
    }


    val strOb: String = ob as String

    println(strOb.length)

    val list = SubList<String>()

    list.add("2R75NT")
    list.add("thunder")
    list.add("123456")

    println(list)

    println(list::class.java.name)

    for (i in list) {
        println(i)
    }


}