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
    
    public int firstloopelement(Node node)
    {
        Node slow=node;
        Node fast=node;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                break;
            }
        }
        int count=0;
        Node entry=node;
        while(entry!=slow)
        {
            entry=entry.next;
            slow=slow.next;
            count+=1;
        }
        System.out.println("The First Loop Element is: "+slow.data);
        return count;
    }
    
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        for(int i=1;i<=5;i++)
        {
            ll.insert(i);
        }
        ll.printll(ll.head);
        ll.head.next.next.next.next.next=ll.head.next.next;
   
        System.out.println("First Loop Element is at Index: "+ll.firstloopelement(ll.head));
    }
}