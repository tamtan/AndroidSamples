package kotlinprogram


import java.util.*

data class Empy(var id: Int, var name: String, var salary: Int) {
    override fun toString(): String {
        return "$id $name $salary"
    }
}

class EmpyComp : Comparator<Empy> {
    override fun compare(o1: Empy, o2: Empy): Int {
        return o1.component3().compareTo(o2.component3())
    }
}

fun main(arg: Array<String>) {
    var list = mutableListOf<Empy>()
    list.add(Empy(1, "tam", 200))
    list.add(Empy(10, "Raghu", 25000))
    list.add(Empy(120, "Krish", 45000))
    list.add(Empy(210, "John", 14000))
    list.add(Empy(150, "Kishore", 24000))
    val max = Collections.max(list, EmpyComp())
    print(max)
}