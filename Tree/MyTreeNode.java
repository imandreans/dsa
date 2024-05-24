package Tree;

public class MyTreeNode {
    private int data;
    private MyTreeNode leftNode, rightNode;

    public MyTreeNode(int data) {
        this.data = data;
        leftNode = rightNode = null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setRightNode(MyTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void setLeftNode(MyTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public int getData() {
        return this.data;
    }

    public MyTreeNode getRightNode() {
        return this.rightNode;
    }

    public MyTreeNode getLeftNode() {
        return this.leftNode;
    }
}
