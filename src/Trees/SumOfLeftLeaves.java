package Trees;

/**
 * Created by Nipun on 11/18/16.
 */
public class SumOfLeftLeaves {

    static int sum = 0;
    public static int doOperation(Node root){
        if(root == null){
            return 0;
        }
        if (root.getLeftChild()!= null){
        if(root.getLeftChild().getLeftChild() == null && root.getLeftChild().getRightChild() == null) {
            sum += root.getLeftChild().getData();
        }
        }
        if(root.getLeftChild() != null){
        doOperation(root.getLeftChild());
        }
        if (root.getRightChild() != null){
        doOperation(root.getRightChild());
        }
        return sum;

    }
    public static void main (String[] args){

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

        System.out.println(doOperation(node));

    }
}
