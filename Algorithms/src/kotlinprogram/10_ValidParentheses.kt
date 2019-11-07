package kotlinprogram

import java.util.*

fun main(arg: Array<String>) {

}

fun isValid(s: String): Boolean {
    var stack = Stack<Char>()
    for (c in s) {
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c)
        } else if (!stack.empty()) {
            when (c) {
                ')' -> if (stack.pop() != '(') return false
                ']' -> if (stack.pop() != '[') return false
                '}' -> if (stack.pop() != '{') return false
            }
        } else {
            return false
        }
    }
    if (stack.size != 0) return false
    return true
}