package eu.grayroot.graytreemaplib;

import java.util.HashMap;

public class TreeMap {

    private HashMap<String, NodeTree> treeMaps;

    public TreeMap() {
        this.treeMaps = new HashMap<>();
    }

    public HashMap<String, NodeTree> getTreeMaps() {
        return treeMaps;
    }

    public void setTreeMaps(HashMap<String, NodeTree> treeMaps) {
        this.treeMaps = treeMaps;
    }
}
