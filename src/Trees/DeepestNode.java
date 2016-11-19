package Trees;

public class DeepestNode{

    static int deepestLevel ;
    static int value;
    public static int deep(Node root){
        doOperation(root , 0);
        return value;
    }

    //Inorder
    public static void doOperation(Node root , int level){
        if(root != null){
            doOperation(root.getLeftChild() , ++level);
            if(level > deepestLevel){
                value = root.getData();
                deepestLevel = level;
            }
            doOperation(root.getRightChild() , level);
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

        node.rightChild.leftChild = node6;
        node.rightChild.rightChild = node7;

        System.out.println(deep(node));
    }

}