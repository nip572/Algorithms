package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Nipun on 11/30/16.
 */
public class LevelOrderReverse {

public static void doOperation(Node root){

    Queue<Node> queue = new LinkedList<>();
    Stack<Node> stack = new Stack<>();
    Node temp;
    queue.add(root);{
        while (!queue.isEmpty()){
            temp = queue.poll();
            if(temp.getRightChild() != null){
                queue.add(temp.getRightChild());
            }
            if(temp.getLeftChild() != null){
                queue.add(temp.getLeftChild());
            }
            stack.push(temp);
        }
        while (!stack.isEmpty()){
        System.out.print(stack.pop().getData() + " ");}
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

        doOperation(node);
    }



}



