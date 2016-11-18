package LinkedList;

/**
 * Created by Nipun on 10/25/16.
 */
public class returnMidlleElement {

    public static Node doOperation( Node head){

        Node sloPtr = head;
        Node fastPtr = head;

        while(fastPtr != null && fastPtr.nextNode != null){
            sloPtr = sloPtr.nextNode;
            fastPtr= fastPtr.nextNode.nextNode;
        }
        return sloPtr;
    }

    public static void main(String[] args){

        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        Node node = doOperation(ll.head);
        System.out.println(node.data);
    }


}
