package kotlinprogram

import kotlinprogram.model.DoubleListNode
import sun.awt.geom.Curve.prev


fun main(arg: Array<String>) {

}

fun reverse(head: DoubleListNode?): DoubleListNode? {
    var head = head
    var prev: DoubleListNode? = null

    while (head != null) {
        val next = head!!.next
        head!!.next = prev
        head!!.prev = next
        prev = head
        head = next
    }


    return prev
}