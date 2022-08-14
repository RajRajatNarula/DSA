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
        }
    }
    
    public Node rotatell(int k)
    {
        for(int i=0;i<k;i++){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current.next!=null)
        {
            prev=current;
            current=current.next;
        }
       
        current.next=head;
        head=current;
        prev.next=null;
        }
      return head;
    }
    
    public void optimalrotateLL(int k)
    {
        Node current=head;
        Node entry=head;
        int count=1;
        while(current.next!=null)
        {
            current=current.next;
            count+=1;
        }
        current.next=head;
        
        for(int i=1;i<count-k;i++)
        {
            entry=entry.next;
        }
        head=entry.next;
        entry.next=null;
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
    
    
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        for(int i=1;i<=5;i++)
        {
            ll.insert(i);
        }
        ll.printll(ll.head);
        
       
        ll.optimalrotateLL(2);
        ll.printll(ll.head);
    }
}




























