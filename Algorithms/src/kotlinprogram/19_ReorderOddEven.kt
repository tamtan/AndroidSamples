package kotlinprogram

import kotlinprogram.model.ListNode

fun main(arg: Array<String>) {
    var x: ListNode? = null
}

fun oddEvenList(head: ListNode?): ListNode? {
    var result: ListNode = ListNode(0)

    var even: ListNode? = ListNode(0)
    var curEven: ListNode? = head

    var odd: ListNode? = ListNode(0)
    result.next = odd?.next
    var curOdd: ListNode? = head?.next
    while (curOdd != null) {
        odd?.next = curOdd
        curOdd = curOdd.next?.next ?: null
        odd = odd?.next

        if (curOdd == null) {
            odd?.next = even?.next
            while (curEven != null) {
                even?.next = curEven
                curEven = curEven.next?.next ?: null
                even = even?.next
            }
        }
    }
    return result
}
