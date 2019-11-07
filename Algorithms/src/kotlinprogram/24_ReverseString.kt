package kotlinprogram

fun main(arg: Array<String>) {
    reverseStr("who are you")
}

fun reverseStr(s: String){
    var chars = s.toCharArray()
    reverse(chars, 0, chars.size -1)
}

fun reverse(chars: CharArray, i: Int, j: Int){
    if(i>= j){
        return
    }
    val temp = chars[i]
    chars[i] = chars[j]
    chars[j] = temp
    reverse(chars, i+1, j-1)
}