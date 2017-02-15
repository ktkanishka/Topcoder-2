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
    Node current = head;
    Set<Node> set = new HashSet<Node>();
    while(current != null) {
        if(set.contains(current)) {
            return true;
        }
        set.add(current);
        current = current.next;
    }
    return false;
}
