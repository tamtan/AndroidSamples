package kotlinprogram

fun main(arg: Array<String>) {
    var s: String = reverseString("today I am so tired")
    print(s)
}

fun reverseString(s: String): String {
    if (s == null || s.length <= 1) {
        return s
    }
    var str: CharArray = s.toCharArray()

    return reverseRecursive(str, 0, str.size - 1)


}

fun reverseRecursive(str: CharArray, s: Int, e: Int): String {
    if (s >= e) {
        return str.joinToString("")
    }
    var temp = str[s]
    str[s] = str[e]
    str[e] = temp
    return reverseRecursive(str, s + 1, e - 1)
}
