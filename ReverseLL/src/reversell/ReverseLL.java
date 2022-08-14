import java.util.*;
class LinkedList
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    
    public void reversell()
    {
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        
        head=prev;
        
    }
    
    public void push(int newdata)
    {
        Node newnode=new Node(newdata);
        newnode.next=head;
        head=newnode;
    }
    
    public void printll()
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    
    
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        for(int i=0;i<6;i++)
        {
            ll.push(i);
        }
        ll.printll();
        System.out.println("");
        ll.reversell();
        System.out.println("");
        ll.printll();
    }
}