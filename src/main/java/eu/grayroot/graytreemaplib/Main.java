package eu.grayroot.graytreemaplib;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap exampleTree = new TreeMap();
        for (NodeConfigs nodeConfig : NodeConfigs.values()) {

            // FOUND A NEW PARENT NODE, WE SHOULD CREATE IT A NEW ENTRY POINT !
            if (nodeConfig.isMainNode()) {
                exampleTree.getTreeMaps().put(nodeConfig.getNodeId(), new NodeTree(nodeConfig.getNodeId()));
            }
        }
        System.out.println("Existing trees: " + exampleTree.getTreeMaps().size());

        HashMap<String, NodeTree> temporaryNodes = new HashMap<>();
        for (NodeConfigs nodeConfig : NodeConfigs.values()) {

            // IGNORE PARENT'S LESS NODES
            if (!nodeConfig.isMainNode()) {
                temporaryNodes.put(nodeConfig.getNodeId(), new NodeTree(nodeConfig.getNodeId()));
            }
        }
        System.out.println("Temporary nodes to waiting list: " + temporaryNodes.size());

        for (NodeConfigs nodeConfig : NodeConfigs.values()) {

            // IGNORE PARENT'S LESS NODES
            if (!nodeConfig.isMainNode()) {
                NodeTree node = temporaryNodes.get(nodeConfig.getNodeId());
                if (nodeConfig.getChildrenLeftNodeId() != null) {
                    node.setLeftNode(temporaryNodes.get(nodeConfig.getChildrenLeftNodeId()));
                }
                if (nodeConfig.getChildrenFrontNodeId() != null) {
                    node.setFrontNode(temporaryNodes.get(nodeConfig.getChildrenFrontNodeId()));
                }
                if (nodeConfig.getChildrenRightNodeId() != null) {
                    node.setRightNode(temporaryNodes.get(nodeConfig.getChildrenRightNodeId()));
                }
            }
        }
        //temporaryNodes.values().forEach(TreeNode::print);

        System.out.println("Now filling main nodes:");
        for (NodeConfigs main : NodeConfigs.values()) {
            if (main.isMainNode()) {
                NodeTree mainNode = exampleTree.getTreeMaps().get(main.getNodeId());
                if (main.getChildrenLeftNodeId() != null) {
                    NodeTree leftChild = temporaryNodes.get(main.getChildrenLeftNodeId());
                    mainNode.setLeftNode(temporaryNodes.get(main.getChildrenLeftNodeId()));
                }
                if (main.getChildrenFrontNodeId() != null) {
                    mainNode.setFrontNode(temporaryNodes.get(main.getChildrenFrontNodeId()));
                }
                if (main.getChildrenRightNodeId() != null) {
                    mainNode.setRightNode(temporaryNodes.get(main.getChildrenRightNodeId()));
                }
            }
        }

        for(NodeTree mainNode : exampleTree.getTreeMaps().values()) {
            NodeTree.visualize(0, mainNode);
            System.out.println("\n");
        }
    }
}