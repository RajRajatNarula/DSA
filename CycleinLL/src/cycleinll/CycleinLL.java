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
    
    public boolean cycleinll(Node node)
    {
        Node slow=node;
        Node fast=node;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
        
    }
    
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        for(int i=1;i<=5;i++)
            
        {
            ll.insert(i);
        }
        ll.head.next.next.next.next=ll.head.next;
        boolean res=ll.cycleinll(ll.head);
        if(res==true)
        {
            System.out.println("Linked List Contains Cycle ");
        }
        else
        {
            System.out.println("Linked List Does Not Contains Cycle ");
        }
    }
}