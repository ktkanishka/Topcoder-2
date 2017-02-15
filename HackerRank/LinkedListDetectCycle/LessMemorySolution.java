/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if(head == null) {
        return false;
    }
    Node slow = head;
    Node fast = head;
    while(fast != null && slow != null) {
        slow = slow.next;
        if(fast.next == null) {
            return false;
        } else {
            fast = fast.next.next;
        }
        if(slow == fast) {
            return true;
        }
    }
    return false;
}
