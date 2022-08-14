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
    
    public Node merge(Node l1,Node l2)
    {
        if(l1==null)
        {
            return l2;
        }
        
        if(l2==null)
        {
             return l1;
        }
        
        if(l1.data>l2.data)
        {
            swap(l1,l2);
        }
        
        Node res=l1;
        
        
        while(l1!=null && l2!=null)
        {
            Node temp=NU
            
            while(l1!=null && l1.data<=l2.data)
            {
                temp=l1;
                System.out.println(l1.data);
                l1=l1.next;
                
            }
            temp.next=l2;
            swap(l1,l2);
        }
        return res;
        
    }
    
    public void swap(Node l1,Node l2)
    {
        Node temp=l1;
        l1=l2;
        l2=temp;
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
    }
    
    public static void main(String[] args)
    {
        LinkedList ll1=new LinkedList();
        int i=10;
        while(i>0)
        {
            ll1.push(i);
            i-=2;
        }
        ll1.printll(ll1.head);
        System.out.println("");
        
        LinkedList ll2=new LinkedList();
        int j=9;
        while(j>0)
        {
            ll2.push(j);
            j-=2;
        }
        ll2.printll(ll2.head);
        System.out.println("");
        ll1.head=ll1.merge(ll1.head, ll2.head);
        
        
        
        
        
        
    }
    
}