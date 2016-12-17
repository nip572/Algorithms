package LinkedList;

/**
 * Created by Nipun on 12/13/16.
 */
public class SizeRecursive {


    public static int getSize(Node node){

        if( node == null){
            return 0;
        }

             return getSize(node.nextNode) +1;
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
