package Trees;

import java.util.Stack;

/**
 * Created by Nipun on 10/31/16.
 */
public class InorderNonRecursive {

    public static void doOperation(Node root){

        Node current  = root;
        Stack<Node> s = new Stack<Node>();
        while(true){

            while(current != null){
                s.push(current);
                current = current.getLeftChild();
            }

            if(s.empty()){
                break;
            }
            current = s.pop();
            System.out.print(current.getData() + " ");
            current = current.getRightChild();
        }

    }

    public static void doOperation2(Node root){

        if(root != null){
            doOperation(root.getLeftChild());
            System.out.print(" " + root.getData());
            doOperation(root.getRightChild());
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

        //Do Operation

        doOperation(node);


    }
}

