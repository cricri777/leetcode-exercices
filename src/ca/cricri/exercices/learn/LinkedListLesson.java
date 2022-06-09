package ca.cricri.exercices.learn;

public class LinkedListLesson {
    public static void main(String[] args) throws Exception {
        /**
            Input
            ["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
            [[], [1], [3], [1, 2], [1], [1], [1]]
            Output
                    [null, null, null, null, 2, null, 3]

            Explanation
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.addAtHead(1);
            myLinkedList.addAtTail(3);
            myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
            myLinkedList.get(1);              // return 2
            myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
            myLinkedList.get(1);              // return 3
        */

        //  Your MyLinkedList object will be instantiated and called as such:
        MyLinkedList obj = new MyLinkedList(10);
        int param_1 = obj.get(0);
        System.out.println(param_1);
        obj.addAtHead(11);
        obj.addAtTail(12);
        System.out.println(obj);
        obj.addAtIndex(2, 14);
        System.out.println(obj);
        obj.deleteAtIndex(1);
        System.out.println(obj);

    }
}

class Node {
    private int val;
    private Node nextNode;

    @Override
    public String toString() {
        return "Node{val=" + val + ", nextNode=" + nextNode + '}';
    }

    public Node(int val) {
        this.val = val;
    }

    public Node() {
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
class MyLinkedList {

    private Node head;
    private int size;
    public MyLinkedList(int headValue) {
        head = new Node(headValue);
        size = 1;
    }

    public int get(int index) throws Exception {
        Node current = this.head;
        if(current == null || index > size) {
            throw new Exception("head null or index bigger than linkedlist size");
        }

        for(int i=0; i<index; i++){
            current = current.getNextNode();
        }
        return current.getVal();
    }

    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.setNextNode(head);
        head = newHead;
        size++;
    }

    public void addAtTail(int val) {
        Node newTail = new Node(val);
        Node current = this.head;
        while(current.getNextNode() != null) {
            current = current.getNextNode();
        }

        current.setNextNode(newTail);
        size++;
    }

    public void addAtIndex(int index, int val) throws Exception {
        if(this.head == null || index > size) {
            throw new Exception("head null or index bigger than linkedlist size");
        }

        if(index==0){
            addAtHead(val);
            size++;
            return;
        }


        Node current = this.head;
        for(int i=0; i<index-1; i++){
            current = current.getNextNode();
        }

        Node newNodeAtIndex = new Node(val);
        newNodeAtIndex.setNextNode(current.getNextNode());
        current.setNextNode(newNodeAtIndex);
        size++;
    }

    public void deleteAtIndex(int index) throws Exception {
        if(this.head == null || index > size) {
            throw new Exception("head null or index bigger than linkedlist size");
        }

        if(index == 0) {
            this.head = this.head.getNextNode();
            size--;
            return;
        }

        Node current = this.head;
        for(int i=0; i<index-1; i++){
            current = current.getNextNode();
        }
        Node nodeToDelete = current.getNextNode();
        current.setNextNode(nodeToDelete.getNextNode());
        size--;
    }

    @Override
    public String toString() {
        return "MyLinkedList{head=" + head + ", size=" + size + '}';
    }
}
