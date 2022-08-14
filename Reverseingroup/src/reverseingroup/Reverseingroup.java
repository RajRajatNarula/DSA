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
    
    public void insert(int newdata)
    {
        Node newnode=new Node(newdata);
        if(head==null)
        {
            head=newnode;
            return;
        }
        else
        {
            Node start=head;
            while(start.next!=null)
            {
                start=start.next;
            }
            start.next=newnode;
            return;
        }
    }
    
    public void push(int newdata)
    {
        Node newnode=new Node(newdata);
        newnode.next=head;
        head=newnode;
    }
    
    public void printll(Node node)
    {
        Node start=node;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
        System.out.println("");
    }
    
    public Node reverseingroup(Node head,int k)
    {
        if(head==null)
        {
            return null;
        }
        
        Node prev=null;
        Node current=head;
        Node next=null;
        int count=0;
        while(count<k && current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count+=1;
        }
        
        if(next!=null)
        {
            head.next=reverseingroup(current,k);
        }
        return prev;
    }
    
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        for(int i=1;i<=10;i++)
        {
            ll.insert(i);
        }
        ll.printll(ll.head);
        ll.head=ll.reverseingroup(ll.head, 2);
        ll.printll(ll.head);
    }
}