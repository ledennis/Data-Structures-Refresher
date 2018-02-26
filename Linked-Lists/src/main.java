public class main {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        SinglyLinkedList newSinglyList = new SinglyLinkedList();
        newSinglyList.addNode(a);
        newSinglyList.addNode(b);
        newSinglyList.addNode(c);
        newSinglyList.printList();
        newSinglyList.deleteNode(b);
        newSinglyList.printList();
        newSinglyList.deleteNode(a);
        newSinglyList.printList();

        TwoPointerNode e = new TwoPointerNode(1);
        TwoPointerNode f = new TwoPointerNode(2);
        TwoPointerNode g = new TwoPointerNode(3);
        TwoPointerNode h = new TwoPointerNode(4);
        TwoPointerNode i = new TwoPointerNode(5);
        TwoPointerNode fail = new TwoPointerNode(111);

        DoublyLinkedList newDoublyList = new DoublyLinkedList();
        newDoublyList.addNode(e);
        newDoublyList.addNode(f);
        newDoublyList.addNode(g);
        newDoublyList.addNode(h);
        newDoublyList.addNode(i);


        newDoublyList.printList();
        newDoublyList.deleteNode(g);
        newDoublyList.printListLeftFromNode(h);
        newDoublyList.printListRightFromNode(f);

        CircularLinkedList newCircularLinkedList = new CircularLinkedList();
        newCircularLinkedList.addNode(e);
        newCircularLinkedList.addNode(f);
        newCircularLinkedList.addNode(g);
        newCircularLinkedList.addNode(h);
        newCircularLinkedList.addNode(i);

        newCircularLinkedList.printList();
        newCircularLinkedList.deleteNode(e);
        newCircularLinkedList.printList();
        newCircularLinkedList.printListRightFromNode(g);
        newCircularLinkedList.printListLeftFromNode(g);
        newCircularLinkedList.deleteNode(g);
        newCircularLinkedList.printList();
    }
}
