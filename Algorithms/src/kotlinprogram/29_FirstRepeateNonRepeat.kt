package kotlinprogram

fun main(arg: Array<String>) {
    firstRepeatedNonRepeatedChar("JavaConceptOfTheDay")
}

fun firstRepeatedNonRepeatedChar(s: String) {
    if (s.length == 0) {
        return
    }
    var chars = s.toCharArray()
    var repeat: Char? = null
    var nonRepeat: Char? = null
    var map = hashMapOf<Char, Int>()
    for (i in chars) {
        if (map.containsKey(i)) {
            if (repeat == null) {
                repeat = i
            }
        }

        map.put(i, map.get(i)?.plus(1) ?: 1)
    }
    for (i in chars) {
        if (map.get(i) == 1) {
            nonRepeat = i
            break
        }
    }
    print("$repeat $nonRepeat")
}