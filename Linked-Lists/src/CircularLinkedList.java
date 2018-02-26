public class CircularLinkedList{
    protected TwoPointerNode head;
    protected int length;

    public CircularLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public void addNode(TwoPointerNode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        else if (this.head.getPreviousNode() == null) {
            this.head.setPreviousNode(newNode);
        }
        else {
            TwoPointerNode tail = this.head.getPreviousNode();

            this.head.setPreviousNode(newNode);
            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);
            newNode.setNextNode(this.head);
        }

        this.length++;
    }

    public void deleteNode(TwoPointerNode removeNode) {
        listIsEmpty();

        if (removeNode == this.head) {
            this.head = removeNode.getNextNode();
            this.head.setPreviousNode(removeNode.getPreviousNode());
            this.head.getPreviousNode().setNextNode(this.head);
        }
        else {
            TwoPointerNode node = findNode(removeNode);
            node.getPreviousNode().setNextNode(node.getNextNode());
        }

        this.length--;
    }

    public TwoPointerNode findNode(TwoPointerNode node) {
        listIsEmpty();

        TwoPointerNode currentNode = this.head;
        int count = 1;

        while (!currentNode.equals(node)) {
            try {

                if (count == this.length) {
                    throw new NodeNotFoundException();
                }

                currentNode = currentNode.getNextNode();
                count++;
            }
            catch (NodeNotFoundException e) {
                System.out.println("Node not found.");
            }
        }

        return currentNode;
    }

    public void listIsEmpty() {
        try {
            if (this.head == null) {
                throw new HeadIsNullException();
            }
        }
        catch (HeadIsNullException e) {
            System.out.println("List is empty");
        }
    }

    public void printList() {
        System.out.println("Starting to print Circular List.");
        listIsEmpty();
        TwoPointerNode currentNode = this.head;
        int count = 1;

        while (count <= this.length) {
            currentNode.printData();
            currentNode = currentNode.getNextNode();
            count++;
        }

        System.out.println("Finished printing Circular List!");
    }

    public void printListLeftFromNode(TwoPointerNode node) {
        listIsEmpty();
        System.out.println("Printing Left From Entered Node in Circular List");
        TwoPointerNode startNode = findNode(node);
        int count = 1;

        while (count <= this.length) {
            startNode.printData();
            startNode = startNode.getPreviousNode();
            count++;
        }

        System.out.println("Finished printing Circular List!");
    }

    public void printListRightFromNode(TwoPointerNode node) {
        System.out.println("Printing Right From Entered Node in Circular List");
        TwoPointerNode startNode = findNode(node);
        int count = 1;

        while (count <= this.length) {
            startNode.printData();
            startNode = startNode.getNextNode();
            count++;
        }

        System.out.println("Finished printing Circular List!");
    }
}
