package eu.grayroot.graytreemaplib;

public enum NodeConfigs {

    NODE_1(true, "1", "1.1", "1.2", "2"),
    NODE_1_1(false, "1.1", null, null, null),
    NODE_1_2(false, "1.2", "1.2.1", null, "1.2.2"),
    NODE_1_2_1(false, "1.2.1", null, null, null),
    NODE_1_2_2(false, "1.2.2", "1.2.2.1", "1.2.2.2", null),
    NODE_1_2_2_1(false, "1.2.2.1", null, null, null),
    NODE_1_2_2_2(false, "1.2.2.2", null, null, null),
    NODE_2(true, "2", "2.1", "2.2", null),
    NODE_2_1(false, "2.1", null, null, null),
    NODE_2_2(false, "2.2", "2.2.1", "2.2.2", "2.2.3"),
    NODE_2_2_1(false, "2.2.1", null, null, null),
    NODE_2_2_2(false, "2.2.2", null, "2.2.2.1", null),
    NODE_2_2_2_1(false, "2.2.2.1", null, null, null),
    NODE_2_2_3(false, "2.2.3", null, null, null),
    NODE_3(true, "3", "3.1", "3.2", "3.3"),
    NODE_3_1(false, "3.1", null, null, null),
    NODE_3_2(false, "3.2", "3.2.1", "3.2.2", null),
    NODE_3_2_1(false, "3.2.1", null, null, null),
    NODE_3_2_2(false, "3.2.2", null, null, null),
    NODE_3_3(false, "3.3", null, null, null),

    ;
    private boolean mainNode;
    private String nodeId;
    private String childrenLeftNodeId;
    private String childrenFrontNodeId;
    private String childrenRightNodeId;

    NodeConfigs(boolean mainNode, String nodeId, String childrenLeftNodeId, String childrenFrontNodeId, String childrenRightNodeId) {
        this.mainNode = mainNode;
        this.nodeId = nodeId;
        this.childrenLeftNodeId = childrenLeftNodeId;
        this.childrenFrontNodeId = childrenFrontNodeId;
        this.childrenRightNodeId = childrenRightNodeId;
    }

    public boolean isMainNode() {
        return mainNode;
    }

    public String getNodeId() {
        return nodeId;
    }

    public String getChildrenLeftNodeId() {
        return childrenLeftNodeId;
    }

    public String getChildrenFrontNodeId() {
        return childrenFrontNodeId;
    }

    public String getChildrenRightNodeId() {
        return childrenRightNodeId;
    }
}
