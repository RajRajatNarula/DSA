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
    
    public void middle()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("\nThe Middle Element of LL is: "+slow.data);
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
        for(int i=0;i<=11;i++)
        {
            ll.push(i);
        }
        ll.printll();
        ll.middle();
    }
}