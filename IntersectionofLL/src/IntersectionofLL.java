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
        System.out.println("");
    }
    
    
    
    
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        Node a=ll.head;
        
        ll.push(4);
        ll.push(2);
        ll.push(1);
        ll.push(3);
        ll.push(1);
        ll.head=ll.head.next.next;
        ll.printll(a);
        
        
        LinkedList ll2=new LinkedList();
        ll2.push(4);
        Node b=ll2.head;
        ll2.head.next=ll.head;
        
        
        
        Solution sol=new Solution();
        int res=sol.intersection(ll.head,ll2.head);
        if(res!=0)
        {
            System.out.println("Intersection Node Is: "+res);
        }
        else
        {
            System.out.println("Intersection Node Does Not Exist");
        }
    }
    
}

class Solution
{
    static int intersection(Node node1,Node node2)
    {
        HashSet<Node> hs=new HashSet<>();
        Node start=node1;
        while(start!=null)
        {
            hs.add(start);
            start=start.next;
        }
        
        start=node2;
        while(start!=null)
        {
            if(hs.contains(start))
            {
                return start.data;
            }
            else
            {
                start=start.next;
            }
        }
        return 0;
    }
}