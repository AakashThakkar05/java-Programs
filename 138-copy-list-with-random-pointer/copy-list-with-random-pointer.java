/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head;
        HashMap <Node,Node> map = new HashMap<>();
        if(head == null){
            return head;
        }
        while(curr != null){
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        while(curr != null){
            Node newNode = map.get(curr);
            newNode.next = map.get(curr.next);
            newNode.random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}