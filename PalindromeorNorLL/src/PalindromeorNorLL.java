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
    
    public boolean palindrome(Node node)
    {
        Node slow=node;
        Node fast=node;
        
        while(fast.next!=null && fast.next.next!=null)
        {
           
            slow=slow.next;
            fast=fast.next.next;
          
        }
        slow.next=reverse(slow.next);
        slow=slow.next;
        Node entry=node;
        while(slow!=null)
        {
            if(slow.data!=entry.data)
            {
                return false;
            }
            slow=slow.next;
            entry=entry.next;
        }
        return true;
    }
    
    public Node reverse(Node node)
    {
        Node prev=null;
        Node current=node;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        
        return prev;
    }
    
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        for(int i=1;i<=6;i++)
        {
            ll.insert(i);
            
        }
        for(int i=1;i<=6;i++)
        {
            ll.push(i);
            
        }
        ll.printll(ll.head);
        boolean res=ll.palindrome(ll.head);
        if(res)
        {
            System.out.println("LL is a Palindrome");
            
        }
        else
        {
            System.out.println("LL is not a Palindrome");
        }
    }
}