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
    
    
    public void removenthfromback(int n)
    {
        Node fast=head;
        Node slow=head;
        
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
        
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        
        slow.next=slow.next.next;
    }
    
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        for(int i=1;i<5;i++)
        {
            ll.push(i);
        }
        ll.printll();
        System.out.println("");
        ll.removenthfromback(1);
        ll.printll();
    }
            
}