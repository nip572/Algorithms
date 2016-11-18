package LinkedList;

/**
 * Created by Nipun on 10/25/16.
 */
public class DetectLoop {

    public  static void doOperation(Node node){
        if(node == null){
            System.out.println("List is empty");
            return;
        }
        else {
            Node sloPtr = node;
            Node fastPtr = node;

            while (fastPtr != null && fastPtr.nextNode != null){

                sloPtr = sloPtr.nextNode;
                fastPtr = fastPtr.nextNode.nextNode;
                if(sloPtr == fastPtr){
                    System.out.println("Loop Exist");
                    break;
                }
            }
            if(fastPtr == null || fastPtr.nextNode == null){
                System.out.println("Doesnt exist");
                return;
            }
                sloPtr = node;
                while(sloPtr != fastPtr){
                    sloPtr = sloPtr.nextNode;
                    fastPtr = fastPtr.nextNode;
                }
            if(sloPtr == fastPtr){
                System.out.println(sloPtr.data);
            }

        }
    }
    public  static  void  main(String[] args){
        Node node = new Node(1);
        node.nextNode = new Node(2);
        node.nextNode.nextNode = new Node(3);
        node.nextNode.nextNode.nextNode = new Node(4);
        node.nextNode.nextNode.nextNode.nextNode = node.nextNode;
        doOperation(node);


    }

}
