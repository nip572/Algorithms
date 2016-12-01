package Trees;

import java.util.Stack;

/**
 * Created by Nipun on 11/30/16.
 */
public class FindInBinaryTree {

    public static boolean doOperationRecursive(Node root , int data){

        if(root == null){
            return false;
        }
        if(root.getData() == data){
            return true;
        }
        return doOperationRecursive(root.getLeftChild(), data) || doOperationRecursive(root.getRightChild(), data);
    }


    public static boolean doOperationIterative(Node root , int data){



        Stack<Node> stack = new Stack<>();
        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.getLeftChild();
            }
            if (stack.isEmpty()) {
                break;
            }
            root = stack.pop();
            if(data == root.getData()){
                return true;
            }
            root = root.getRightChild();

        }
        return false;
    }

    public  static void main(String[] args){


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


        System.out.println("Recursive");
        System.out.println(doOperationRecursive(node , 7));
        System.out.println("ITERATIVE");
        System.out.println(doOperationIterative(node , 7));

    }




}
