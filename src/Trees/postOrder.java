package Trees;

import java.util.Stack;

/**
 * Created by Nipun on 11/16/16.
 */
public class postOrder {

    public static void doOperationRecursive(Node root){

        if(root == null){
            return;
        }
        doOperationRecursive(root.getLeftChild());
        doOperationRecursive(root.getRightChild());
        System.out.print(root.getData() + " ");
    }

    public static void doOperationIterative(Node root){

        if(root == null){
            return;
        }
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();
        s1.push(root);
        while(!s1.isEmpty()){
          Node temp = s1.pop();
            s2.push(temp);
            if(temp.getLeftChild() != null){
            s1.push(temp.getLeftChild());}
            if(temp.getRightChild() != null) {
                s1.push(temp.getRightChild());
            }
        }
        while (!s2.isEmpty()){
            Node temp = s2.pop();
            System.out.print(temp.getData() + " ");
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
        System.out.println("recursive");
        doOperationRecursive(node);
        System.out.println("Iterative");
        doOperationIterative(node);
    }
}
