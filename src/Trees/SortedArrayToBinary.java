package Trees;

/**
 * Created by Nipun on 10/25/16.
 */

// 1,2,3,4,5
public class SortedArrayToBinary {

    public static Node doOperation(int[] arr , int start , int end){

    if(end < start) {
        return null;
    }
        int mid = (start + end)/2;
        Node node = new Node(arr[mid]);
        node.setLeftChild( doOperation(arr , start , mid-1));
        node.setRightChild(doOperation(arr ,mid+1 , end));
        return node;
    }

    public static void  inOrder(Node root){

        if(root == null){
            return;
        }
        inOrder(root.getLeftChild());
        System.out.println(root.getData());
        inOrder(root.getRightChild());
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int end = arr.length -1;
        int start = 0;
        inOrder(doOperation(arr , start , end));
    }


}
