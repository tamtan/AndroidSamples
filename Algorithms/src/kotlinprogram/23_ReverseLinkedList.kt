package kotlinprogram

import kotlinprogram.model.ListNode

fun main(arg: Array<String>) {
    var node = ListNode(
        1,
        ListNode(2, (ListNode(3, ListNode(4, null))))
    )
    reverseLinkedList(node)
}

fun reverseLinkedList(node: ListNode): ListNode? {
    var reversed: ListNode? = null
    var current: ListNode? = node
    while (current != null) {
        reversed = ListNode(current.`val`).apply { next = reversed }
        current = current.next
    }
    return reversed
}

fun reverseList(head: ListNode?, prevNode: ListNode? = null): ListNode? {
    if (head == null) return prevNode
    val next = head?.next
    head.next = prevNode
    return reverseList(next, head)
}
