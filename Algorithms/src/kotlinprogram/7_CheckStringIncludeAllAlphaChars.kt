package kotlinprogram

fun main(arg: Array<String>) {
    print(checkPangram("qwertyuiopasdfghjklzxcvbnmqwertyuufffffffffdfghjklkzxcvbnm,mnbvvvv"))
}

fun checkPangram(s: String): Boolean {
    var set = mutableSetOf<Char>()
    for (i in 0 until s.length) {
        if (s.get(i) in 'A'..'Z' || s.get(i) in 'a'..'z') {
            set.add(s.get(i).toLowerCase())
        }
        if(set.size == 26){
            return true
        }
    }
    return false
}