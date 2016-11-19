package Trees;

/**
 * Created by Nipun on 11/19/16.
 */
public class CountLeaves {

    public static int doOperations(Node root){

        if(root == null){
            return  0;
        }
        if(root.getLeftChild() == null && root.getRightChild() == null){
            return 1;
        }
        else {
            return doOperations(root.getRightChild())+ doOperations(root.getLeftChild());
        }

    }
    public static void main(String[] args){

        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        node.leftChild = node2;
        node.rightChild = node3;
        node.leftChild.leftChild = node4;
        node.leftChild.rightChild = node5;
        node.rightChild.leftChild = node6;
        node.rightChild.rightChild = node7;
        System.out.println(doOperations(node));
    }
}
