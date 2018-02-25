public class DoublyLinkedList {
    protected TwoPointerNode head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void addNode(TwoPointerNode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        else {
            TwoPointerNode currentNode = this.head;

            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }

            currentNode.setNextNode(newNode);
            newNode.setPreviousNode(currentNode);
        }
    }

    public void deleteNode(TwoPointerNode removeNode) {
        TwoPointerNode node = findNode(removeNode);
        removeNode.getPreviousNode().setNextNode(removeNode.getNextNode());
    }

    public void printList() {
        TwoPointerNode currentNode = this.head;
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

    public void printListLeftFromNode(TwoPointerNode node) {
        System.out.println("Printing Left From Entered Node");
        TwoPointerNode startNode = findNode(node);

        while (startNode != null) {
            startNode.printData();
            startNode = startNode.getPreviousNode();
        }

        System.out.println("Finished printing list!");
    }

    public void printListRightFromNode(TwoPointerNode node) {
        System.out.println("Printing Right From Entered Node");
        TwoPointerNode startNode = findNode(node);

        while (startNode != null) {
            startNode.printData();
            startNode = startNode.getNextNode();
        }

        System.out.println("Finished printing list!");
    }

    public TwoPointerNode findNode(TwoPointerNode node) {
        TwoPointerNode currentNode = this.head;

        while (!currentNode.equals(node)) {
            try {
                currentNode = currentNode.getNextNode();

                if (currentNode == null) {
                    throw new NodeNotFoundException();
                }
            }
            catch (NodeNotFoundException e) {
                System.out.println("Node not found.");
            }
        }

        return currentNode;
    }
}
