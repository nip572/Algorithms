package Trees;

/**
 * Created by Nipun on 12/11/16.
 */
public class RootToLeafAllPaths {


    public static void printPathRecurse(Node root){

        int[] path = new int[1000];
        int pathLen = 0;
        doOperation(root ,path , pathLen);
    }

    public static void doOperation(Node root , int[] path , int pathLen){

        if(root== null){
            return;
        }
        path[pathLen++] = root.getData();
        if (root.getLeftChild() == null && root.getRightChild() == null){

            printPath(path , pathLen);
        }
        else {
            doOperation(root.getLeftChild() , path ,pathLen);
            doOperation(root.getRightChild() , path  ,pathLen);
        }
    }

    private  static void printPath(int[] path, int pathLen) {

        for (int i = 0 ; i <pathLen ; i++){

            System.out.print(path[i] + " ");

        }
        System.out.println();

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

        printPathRecurse(node);




    }


}
