package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class findMaximumInTree{

    public static int doOperationRecursive(Node root){
        int max = Integer.MIN_VALUE;
        if(root != null){
            int left = doOperationRecursive(root.getLeftChild());
            int  right = doOperationRecursive(root.getRightChild());

            if(left > right){
                max = left;
            }  else {
                 max = right;
            }
            if(root.getData() > max){
                max = root.getData();
            }
        }
        return max;

    }

    public static int doOperationNonRecursive(Node root){
        if (root == null){ return -1;}
        int max = Integer.MIN_VALUE;
        int right;
        int left;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.remove();
            if(temp.getData() > max){
                max = temp.getData();
            }
            if(temp.getLeftChild() != null){
                q.add(temp.getLeftChild());
            }
            if(temp.getRightChild() !=null){
                q.add(temp.getRightChild());
            }
        }
        return  max;
    }
    public  static  void main(String[] args){

        Node node = new Node(1);
        Node node2 = new Node(8);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(7);
        Node node7 = new Node(6);
        node.leftChild = node2;
        node.rightChild = node3;
        node.leftChild.leftChild = node4;
        node.leftChild.rightChild = node5;
        node.rightChild.leftChild = node6;
        node.rightChild.rightChild = node7;
        System.out.println(doOperationNonRecursive(node));



    }

}












