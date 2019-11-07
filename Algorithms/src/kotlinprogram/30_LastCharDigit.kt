package kotlinprogram

fun main(arg: Array<String>) {
    print(lastCharDigit("adfadf909"))
}

fun lastCharDigit(s: String): String {
    var chars = s.toCharArray();
    var last = chars[chars.size-1]
    var lastInt = last.toInt() - '0'.toInt() + 1
    var newS = s.substring(0..s.length - 2) + lastInt.toString()
    return  newS
}