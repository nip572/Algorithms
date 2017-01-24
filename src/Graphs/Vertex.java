package Graphs;

/**
 * Created by Nipun on 12/21/16.
 */
public class Vertex {

    boolean visted = false;
    char label;

    public Vertex(char label) {
        this.label = label;
    }

    public boolean isVisted() {
        return visted;
    }

    public void setVisted(boolean visted) {
        this.visted = visted;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }
}
