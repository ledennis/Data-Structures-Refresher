import java.util.Stack;

public class SinglyLinkedList {
    private Stack<Node> list;
    private Node head;

    public SinglyLinkedList() {
        this.list = new Stack<Node>();
        this.head = null;
    }

    public void addNode(Node newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        else {
            Node currentNode = this.head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }

    public void deleteNode(Node deleteNode) {
        if (this.head == null) {
            System.out.println("No nodes in list");
        }
        else if (deleteNode == null) {
            System.out.println("This node is null");
        }
        else {
            Node currentNode = this.head;
            Node previousNode = null;
            while (!currentNode.equals(deleteNode)) {
                previousNode = currentNode;
                currentNode = currentNode.getNextNode();
            }
            previousNode.setNextNode(currentNode.getNextNode());
        }
    }

    public void printList() {
        Node currentNode = this.head;
        if (currentNode == null) {
            System.out.println("This list is empty!");
        }
        else {
            while (currentNode != null) {
                currentNode.printData();
                currentNode = currentNode.getNextNode();
            }
            System.out.println("Finished printing list!");
        }
    }
}
