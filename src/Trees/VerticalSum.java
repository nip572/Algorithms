package Trees;

import java.util.HashMap;

/**
 * Created by Nipun on 12/13/16.
 */
public class VerticalSum {


    public static void verticalSum(Node root){

        HashMap<Integer , Integer> hm = new HashMap<Integer, Integer>();
        if(root == null){
            return;
        }
        verticalSumUtil(root , 0 , hm);
        if(hm != null){
            System.out.println(hm.entrySet());
        }

    }

    private static void verticalSumUtil(Node root , int hD , HashMap<Integer , Integer> hm ){

        if(root == null){
            return;
        }

        verticalSumUtil(root.getLeftChild() , hD -1 ,hm);
        int prevSum = (hm.get(hD) == null)? 0 : hm.get(hD);
        hm.put(hD , prevSum + root.getData());
        verticalSumUtil(root.getRightChild(), hD +1 ,hm);
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

        verticalSum(node);
    }

}
