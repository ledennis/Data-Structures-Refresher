public class main {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        SinglyLinkedList newList = new SinglyLinkedList();
        newList.addNode(a);
        newList.addNode(b);
        newList.addNode(c);
        newList.printList();
        newList.deleteNode(b);
        newList.printList();
    }
}
