package Trees;

/**
 * Created by Nipun on 12/13/16.
 */
public class CheckIfRootToLeafHasASum {


    public static boolean doOperation(Node root , int sum){

        int[] path = new int[1000];
        int pathLen = 0;
         return doOperationUtil(root , path ,pathLen , sum);

    }

    private static boolean doOperationUtil(Node root , int[] path , int pathLen , int sum){

        if(root == null){
            return  false;
        }
        path[pathLen++] = root.getData();
         if(root.getRightChild() == null && root.getLeftChild() == null){

            int sum1 = sumArray(path  , pathLen);
             if(sum1 == sum){
                 return true;
             }
        }
        else {
             return doOperationUtil(root.getLeftChild() , path , pathLen ,sum) ||
                     doOperationUtil(root.getRightChild() , path , pathLen ,sum)  ;
         }

        return false;
    }

    private static int sumArray(int[] path, int pathLen) {

        int sum = 0;
        for(int i = 0 ; i < pathLen ; i++){
            sum = sum + path[i];
        }
        return sum;

    }


    public static  void main(String[] args){

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

        System.out.println(doOperation(node ,0));



    }



}
