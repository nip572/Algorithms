package Trees;

import java.util.Stack;

/**
 * Created by Nipun on 11/2/16.
 */
public class PreOrder {


    public static void preOrderNonRecursive(Node root){
        if(root == null ){ return ;}
        Stack<Node> stack = new Stack<Node>();

        while(true){

            while(root!= null){
                System.out.print(root.getData() + " " );
                stack.push(root);
                root = root.getLeftChild();
            }
            if(stack.isEmpty()){
                break;
            }
            root = stack.pop();
            root = root.getRightChild();
        }

        return;

    }

    public  static  void main(String[] args){

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

        preOrderNonRecursive(node);
    }
}
