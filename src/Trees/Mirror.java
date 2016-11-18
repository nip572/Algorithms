package Trees;

import java.util.Stack;

/**
 * Created by Nipun on 11/16/16.
 */
public class Mirror {

    public static void doOperation(Node root){

        if(root == null){
            return;
        }
        doOperation(root.getLeftChild());
        doOperation(root.getRightChild());
        //Process
        process(root);

    }

    public static void process(Node root){

        if(root.getLeftChild()!= null && root.getRightChild()== null){
            Node temp = root.getLeftChild();
            root.setRightChild(temp);
        }
        else
        if(root.getRightChild()!= null && root.getLeftChild()== null){
            Node temp = root.getRightChild();
            root.setLeftChild(temp);
        }
        else
        if(root.getLeftChild()!= null && root.getRightChild()!= null){
            Node temp = root.getLeftChild();
            root.setLeftChild(root.getRightChild());
            root.setRightChild(temp);
        }
        else {
            return;
        }
    }


    public static void preOrderNonRecursive(Node root){
        if(root == null ){ return ;}
        Stack<Node> stack = new Stack<Node>();

        while(true){

            while(root!= null){
                process(root);
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


    public static void doOperation2(Node root){

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
        System.out.println("initial");
        doOperation2(node);
        System.out.println();
        System.out.println("Mirrored");
        doOperation(node);
        doOperation2(node);
        System.out.println();
        System.out.println("Mirrored Iterative");
        preOrderNonRecursive(node);
        doOperation2(node);

    }
}
