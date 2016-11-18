package Trees;

/**
 * Created by Nipun on 10/25/16.
 */
public class Node {

    private int data;
     Node rightChild;
     Node leftChild;
    private Node parent;

    public Node(int data){
        this.data = data;
    }

    public void setData(int num){
        data = num;
    }

    public int getData(){
        return data;
    }

    public void setLeftChild(Node node){
        this.leftChild = node;
    }

    public  Node getLeftChild(){
        return this.leftChild;
    }


    public void setRightChild(Node node){
        this.rightChild = node;
    }

    public  Node getRightChild(){
        return this.rightChild;
    }


}
