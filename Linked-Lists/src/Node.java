public class Node {
    private int data;
    private Node nextNode;

    public Node(int _data) {
        this.data = _data;
        this.nextNode = null;
    }

    public int getData() {
        return this.data;
    }

    public void printData() {
        System.out.println(this.data);
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node _nextNode) {
        this.nextNode = _nextNode;
    }

}
