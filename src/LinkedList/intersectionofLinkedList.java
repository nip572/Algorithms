package LinkedList;

/**
 * Created by Nipun on 10/26/16.
 */
public class intersectionofLinkedList {

    public static void doOperation(Node n1, Node n2){

        Node ptr = traverseTillEnd(n1);
        Node ptr2 = traverseTillEnd(n2);
        if(ptr == ptr2){
            System.out.println("Intersection exist");
            int length1 = calculateLength(n1);
            System.out.println(length1);
            int length2 = calculateLength(n2);
            System.out.println(length2);
            int Diff = Math.abs(length1 - length2);
            System.out.println(Diff);
            if (length1 >= length2) {
                Node large = n1;
                Node small = n2;
                for(int i = 0 ; i <= Diff ; i++ ){
                    large = large.nextNode;
                }
                System.out.println("large. Data = " + large.data);
                while(large != small){
                    if(large == small){
                        System.out.println("Loop exist at " + large.data);
                    }
                    large = large.nextNode;
                    small = small.nextNode;

                }
            } else {
                Node large = n2;
                Node small = n1;
                for(int i = 0 ; i <= Diff ; i++ ){
                    large = large.nextNode;
                }
                while(large != small){
                    if(large == small){
                        System.out.println("Loop exist at " + large.data);
                    }
                    large = large.nextNode;
                    small = small.nextNode;

                }
            }
        }
        else {
            System.out.println("Intersection does't exist");
        }
    }

    public static int calculateLength(Node node){

        if(node == null){
            return 0;
        }
        int length = 0;
        Node current = node;

        while(current != null){
            current = current.nextNode;
            length++;
        }
        return  length;
    }

    public static Node traverseTillEnd(Node node){

        if(node == null){
            return null;
        }

        Node current = node;
        while (current.nextNode != null){
            current = current.nextNode;
        }
        return current;
    }

    public static void main(String[] args){

        Node node = new Node(1);
        node.nextNode = new Node(2);
        node.nextNode.nextNode = new Node(3);
        node.nextNode.nextNode.nextNode = new Node(4);
        node.nextNode.nextNode.nextNode.nextNode = new Node(5);
        Node node2 = new Node(1);
        node2.nextNode = node.nextNode.nextNode;
        doOperation(node , node2);

    }
}
