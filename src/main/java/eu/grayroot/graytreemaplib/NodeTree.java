package eu.grayroot.graytreemaplib;

import java.util.Arrays;

public class NodeTree {

    private String id;
    private NodeTree rightNode;
    private NodeTree frontNode;
    private NodeTree leftNode;

    public NodeTree(String id, NodeTree rightNode, NodeTree frontNode, NodeTree leftNode) {
        this.id = id;
        this.rightNode = rightNode;
        this.frontNode = frontNode;
        this.leftNode = leftNode;
    }

    public NodeTree(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NodeTree getRightNode() {
        return rightNode;
    }

    public void setRightNode(NodeTree rightNode) {
        this.rightNode = rightNode;
    }

    public NodeTree getFrontNode() {
        return frontNode;
    }

    public void setFrontNode(NodeTree frontNode) {
        this.frontNode = frontNode;
    }

    public NodeTree getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(NodeTree leftNode) {
        this.leftNode = leftNode;
    }

    public static void visualize(int offset, NodeTree node) {
        System.out.println(getSpaceX(offset, " |") +  " * " + node.getId());
        offset +=2;
        if(node.getLeftNode() != null) {
            visualize(offset, node.getLeftNode());
        }
        if(node.getFrontNode() != null) {
            visualize(offset, node.getFrontNode());
        }
        if(node.getRightNode() != null) {
            visualize(offset, node.getRightNode());
        }
    }

    public static String getSpaceX(int n, String text)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(text);
        }
        return sb.toString();
    }
}
