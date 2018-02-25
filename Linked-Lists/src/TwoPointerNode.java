public class TwoPointerNode {
    private int data;
    private TwoPointerNode previousNode;
    private TwoPointerNode nextNode;

    public TwoPointerNode(int _data) {
        this.data = _data;
    }

    public void setNextNode(TwoPointerNode _nextNode) {
        this.nextNode = _nextNode;
    }

    public void setPreviousNode(TwoPointerNode _previousNode) {
        this.previousNode = _previousNode;
    }

    public TwoPointerNode getNextNode() {
        return this.nextNode;
    }

    public TwoPointerNode getPreviousNode() {
        return this.previousNode;
    }

    public void printData() {
        System.out.println(this.data);
    }
}
