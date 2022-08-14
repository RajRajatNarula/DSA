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
    
    public void printll(Node node)
    {
        Node start=node;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
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
        head =prev;
    }
    
    public static void main(String[] args)
    {
        LinkedList ll1=new LinkedList();
        for(int i=1;i<=4;i++)
        {
            ll1.push(i);
        }
        ll1.reversell();
        ll1.printll(ll1.head);
        System.out.println("");
        
        LinkedList ll2=new LinkedList();
        for(int i=2;i<=6;i++)
        {
            ll2.push(i);
        }
        ll2.printll(ll2.head);
        System.out.println("");
        
        
        Solution sol=new Solution();
        Node res=sol.addtwolist(ll1.head,ll2.head);
        LinkedList ll=new LinkedList();
        ll.printll(res);
        
    }
}

class Solution
{
    static Node addtwolist(Node a,Node b)
    {
       Node dummy=new Node(0);
       Node temp=dummy;
       int carry=0;
       while(a!=null || b!=null || carry==1)
       {
           int sum=0;
           if(a!=null)
           {
               sum+=a.data;
               a=a.next;
           }
           
           if(b!=null)
           {
               sum+=b.data;
               b=b.next;
           }
           
           sum+=carry;
           carry=sum/10;
           Node node=new Node(sum%10);
           temp.next=node;
           temp=temp.next;
       }
       return dummy.next;
    }   
}