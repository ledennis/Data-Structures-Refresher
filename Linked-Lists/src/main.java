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

//        newDoublyList.printListLeftFromNode(fail);
//        newDoublyList.printListRightFromNode(fail);
        newDoublyList.printList();
        newDoublyList.printListLeftFromNode(g);
        newDoublyList.printListRightFromNode(g);
    }
}
