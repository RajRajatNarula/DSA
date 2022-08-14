import java.util.*;
class Lru
{
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    Map<Integer,Node> map=new HashMap<>();
    
    int capacity;
    
    public Lru(int cap)
    {
        capacity=cap;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key)
    {
        if(map.containsKey(key))
        {
            Node node=map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else
        {
            return -1;
        }
    }
    
    public void put(int key,int value)
    {
        if(map.containsKey(key))
        {
            remove(map.get(key));
        }
        
        if(map.size()==capacity)
        {
            remove(tail.prev);
        }
        
        insert(new Node(key,value));
        
    }
    
    
    
    
    
    public void insert(Node node)
    {
        map.put(node.key, node);
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
        
    }
    
    public void remove(Node node)
    {
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    
    
    public void printdll()
    {
        Node start=head;
        while(start!=null)
        {
            System.out.println(start.key+" "+start.value);
        }
    }
    
    public static void main(String[] args)
    {
        Lru lru=new Lru(3);
//        lru.insert(new Node(1,10));
//        lru.insert(new Node(2,20));
//        lru.insert(new Node(3,30));

        lru.put(1, 10);
        lru.put(2, 20);
        lru.put(3, 30);
        lru.put(4, 40);
        int ans=lru.get(1);
        System.out.println(ans);
        
        
        
    }
}

class Node
{
    Node next,prev;
    int key,value;
    Node(int k,int v)
    {
        key=k;
        value=v;
    }
}