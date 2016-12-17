package LinkedList;

/**
 * Created by Nipun on 12/13/16.
 */
public class SizeIterative {


    public static int getSize(Node head){

        if(head == null){
            return 0;
        }
        Node current = head;
        int count = 0;
        while(current!= null){
            count++;
            current = current.nextNode;
        }
        return count;
    }

    public static void main(String[] args){


        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        System.out.println(getSize(ll.head));

    }


}
