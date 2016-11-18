package LinkedList;

/**
 * Created by Nipun on 10/25/16.
 */
public class LinkedList {

    Node current;
    Node head;

    public void add(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
        }
        else{
            current = head;

            while (current.nextNode != null){
                current = current.nextNode;
            }
            current.nextNode = node;
        }

    }

    public void print(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            current = head;
            while (current!= null){
                System.out.print(current.data + "->");
                current = current.nextNode;
            }
        }
    }
}
