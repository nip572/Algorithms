package LinkedList;

/**
 * Created by Nipun on 12/13/16.
 */
public class nthFromEnd {

    public static int doOperation(Node head , int n){

        Node sloPtr = head;
        Node fastPtr = head;

        if(head == null){
            return -1;
        }

        int count = 0;
        while(count < n){
            if(fastPtr == null){
                System.out.println("Invalid Size");
                return -1;
            }
            fastPtr = fastPtr.nextNode;
            count++;
        }
        while (fastPtr != null){
            sloPtr = sloPtr.nextNode;
            fastPtr = fastPtr.nextNode;
        }
     return  sloPtr.data;
    }



    public static void main(String[] args){


        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        System.out.println(doOperation(ll.head , 6));

    }

}
