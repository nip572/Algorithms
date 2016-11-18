package Trees;

/**
 * Created by Nipun on 11/15/16.
 */
public class checkBalance {

    public  static int getHeight(Node root){

        if(root == null){
            return -1;
        }
        else{
            return Math.max(getHeight(root.getLeftChild()) , getHeight(root.getRightChild())) +1;
        }
    }

    public static boolean doOperation(Node root){

        if(root == null){
            return true;
        }
        int diffheight = getHeight(root.getLeftChild()) - getHeight(root.getRightChild());
        if(Math.abs(diffheight) > 1){
            return false;
        }
        else {
            return doOperation(root.getLeftChild()) && doOperation(root.getRightChild());
        }

    }


    public static  void main(String[] args){
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        node.leftChild = node2;
       // node.rightChild = node3;
        node.leftChild.leftChild = node4;
        node.leftChild.rightChild = node5;
        //node.rightChild.leftChild = node6;
        //node.rightChild.rightChild = node7;

        System.out.println(doOperation(node));
    }
}
