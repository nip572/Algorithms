package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Nipun on 11/29/16.
 */
public class LevelOrderTraversal {

    public static void doOperation(Node root){

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){

            Node temp = q.poll();
            System.out.println(temp.getData());
            if(temp.getLeftChild() != null){
                q.add(temp.getLeftChild());
            }
            if(temp.getRightChild() != null){
                q.add(temp.getRightChild());
            }

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
