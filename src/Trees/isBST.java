package Trees;

import java.util.Stack;

/**
 * Created by Nipun on 11/15/16.
 */
public class isBST {

    static boolean isBST(Node root){
        return  isBST(root , Integer.MIN_VALUE , Integer.MAX_VALUE);
    }

    static boolean isBST(Node root , int min, int max){

        if (root == null){
            return true;
        }
        if(root.getData() <= min || root.getData() > max){
         return false;
        }
        return isBST(root.getLeftChild() , min , root.getData()) && isBST(root.getRightChild() , root.getData() ,max);

    }

    public static boolean isBSTIterative(Node root){
        boolean b = false;
        boolean left = false;
        boolean right = false;

        Stack<Node> stack = new Stack<Node>();
        while(true){
            while ( root != null){
                //process
                System.out.println(root.getData());
               //if(root.getLeftChild() != null && root.getRightChild()!= null){  b = doOperation(root);}
                if(root.getLeftChild() != null){
                    if(root.getData() >= root.getLeftChild().getData()){
                        left =true;
                    }
                }
                if(root.getRightChild() != null){
                    if(root.getData() < root.getRightChild().getData()){
                        right =true;
                    }
                }
                if(right && left) b = true;

                stack.push(root);
                root = root.getLeftChild();
            }
            if(stack.isEmpty()){
                break;
            }
            root = stack.pop();
            root = root.getRightChild();
        }
        return b;
    }

    public static boolean doOperation(Node root){

        if(root.getData() >= root.getLeftChild().getData() && root.getData() < root.getRightChild().getData()){
            return true;
        }
        return false;
    }

    public static void main(String[] args){

        Node node = new Node(10);
        Node node2 = new Node(5);   //node.leftChild = node2; 5
        Node node3 = new Node(15);   //node.rightChild = node3;15
        Node node4 = new Node(3);   //node.leftChild.leftChild = node4; 3
        Node node5 = new Node(6);   //node.leftChild.rightChild = node5;6
        Node node6 = new Node(12);  //node.rightChild.leftChild = node6;12
        Node node7 = new Node(17);  // node.rightChild.rightChild = node7;17
        node.leftChild = node2;
         node.rightChild = node3;
        node.leftChild.leftChild = node4;
        node.leftChild.rightChild = node5;
        node.rightChild.leftChild = node6;
        node.rightChild.rightChild = node7;
        System.out.println(isBSTIterative(node));
    }
}
