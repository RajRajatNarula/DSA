import java.util.*;
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

class LinkedList
{
    Node head;
    
    public void push(int newdata)
    {
        Node newnode=new Node(newdata);
        newnode.next=head;
        head=newnode;
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
    
    public void printll(Node node)
    {
        Node start=node;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    
    public void deletenode(int value)
    {
        Node prev=null;
        Node current=head;
        if(current.data==value)
        {
            head=current.next;
            return;
        }
        while(current!=null)
        {
            if(current.data==value)
            {
                prev.next=current.next;
                current=null;
            }
            else
            {
                prev=current;
                current=current.next;
            }
        }
    }
    
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        for(int i=1;i<=5;i++)
        {
            ll.push(i);
        }
        
        ll.printll(ll.head);
        System.out.println("");
        ll.reversell();
        ll.printll(ll.head);
        System.out.println("");
        ll.deletenode(1);
        ll.printll(ll.head);
    }
}