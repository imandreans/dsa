package Tree;

public class MyTree {
    private MyTreeNode root;

    public MyTree() {
        root = null;
    }

    public MyTree(MyTreeNode root) {
        this.root = root;
    }

    public void setRoot(MyTreeNode root) {
        this.root = root;
    }

    public MyTreeNode getRoot() {
        return root;
    }

    public void insert(int data) {
        MyTreeNode newNode = new MyTreeNode(data);
        MyTreeNode parent;
        if (root == null) {
            root = new MyTreeNode(data);
        } else {
            parent = root;
            while (true) {
                if (newNode.getData() < parent.getData()) {
                    if (parent.getLeftNode() == null) {
                        parent.setLeftNode(newNode);
                        break;
                    } else {
                        parent = parent.getLeftNode();
                    }
                } else {
                    if (parent.getRightNode() == null) {
                        parent.setRightNode(newNode);
                        break;
                    } else {
                        parent = parent.getRightNode();
                    }
                }
            }

        }
    }

    public MyTreeNode search(int data) {
        MyTreeNode parent = root;

        while (true) {
            try {
                if (data == parent.getData()) {
                    System.out.println("Node " + data + " is found");
                    return parent;
                } else if (data < parent.getData()) {

                    // if (data == parent.getLeftNode().getData()) {
                    // System.out.println("Node " + data + " is found");

                    // return parent.getLeftNode();
                    // } else {
                    parent = parent.getLeftNode();
                    // }
                } else {
                    // if (data == parent.getRightNode().getData()) {
                    // System.out.println("Node " + data + " is found");
                    // return parent.getRightNode();
                    // } else {
                    parent = parent.getRightNode();
                    // }
                }
            } catch (NullPointerException e) {
                System.out.println("Node " + data + " not Found");
                return null;
            }
        }

    }

    private MyTreeNode delete(MyTreeNode node, int data) {
        // MyTreeNode node = root;
        if (node == null) {
            return node;
        }

        if (data < node.getData()) {
            node.setLeftNode(delete(node.getLeftNode(), data));
        } else if (data > node.getData()) {
            node.setRightNode(delete(node.getRightNode(), data));
        } else {
            if (node.getLeftNode() == null || node.getRightNode() == null) {
                MyTreeNode temp = node.getLeftNode() != null ? node.getLeftNode() : node.getRightNode();

                if (temp == null) {
                    return null;
                } else {
                    return temp;
                }
            } else {
                MyTreeNode successor = getSuccessor(node);
                node.setData(successor.getData());

                node.setRightNode(delete(node.getRightNode(), successor.getData()));
                return node;
            }
        }
        return node;
    }

    public MyTreeNode delete(int data) {
        return delete(root, data);
    }

    public MyTreeNode getSuccessor(MyTreeNode node) {
        if (node == null)
            return null;

        MyTreeNode temp = node.getRightNode();
        while (temp.getLeftNode() != null) {
            temp = temp.getLeftNode();
        }
        return temp;
    }

    private void preOrder(MyTreeNode localRoot) {
        if (localRoot != null) {
            System.out.println(localRoot.getData() + " ");
            preOrder(localRoot.getLeftNode());
            preOrder(localRoot.getRightNode());
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void postOrder(MyTreeNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.getLeftNode());
            inOrder(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void inOrder(MyTreeNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            inOrder(localRoot.getRightNode());
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    @Override
    public String toString() {

        return super.toString();
    }
}