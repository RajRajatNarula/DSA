import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}

class Solution
{
    public void createparentmap(Node root,Map<Node,Node> parentmap)
    {
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        
        // If in the input if target is given as integer not as node , then while filling parent map comapare every
        // node data with the input integer and return the node whose value match
        
        while(queue.isEmpty()==false)
        {
            Node current=queue.remove();
            
            if(current.left!=null)
            {
                queue.offer(current.left);
                parentmap.put(current.left, current);
            }
            
            if(current.right!=null)
            {
                queue.offer(current.right);
                parentmap.put(current.right, current);
            }
        }
    }
    
    public void mintimetoburn(Node root,Node target,int k)
    {
        Map<Node,Node> parentmap=new HashMap<>();
        createparentmap(root,parentmap);
        
        Queue<Node> queue=new LinkedList<>();
        Map<Node,Boolean> visited=new HashMap<>();
        
        queue.offer(target);
        visited.put(target, true);
        int level=0;
        while(queue.isEmpty()==false)
        {
            
            
            
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                Node current=queue.remove();
                
                if(current.left!=null && visited.get(current.left)==null)
                {
                    visited.put(current.left, true);
                    queue.offer(current.left);
                }
                
                if(current.right!=null && visited.get(current.right)==null)
                {
                    visited.put(current.right, true);
                    queue.offer(current.right);
                }
                
                if(parentmap.get(current)!=null && visited.get(parentmap.get(current))==null)
                {
                    visited.put(parentmap.get(current), true);
                    queue.offer(parentmap.get(current));
                }
            }
            if(queue.isEmpty()==false)
            {
                level+=1;
            }
        }
        
        System.out.println(level);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        
        Node  root = new Node(2);
        root . left = new Node(35);
        root . left . left = new Node(2);
        root . left . right = new Node(3);
        root . right = new Node(10);
        root . right . left = new Node(5);
        root . right . right = new Node(2);
        
        sol.mintimetoburn(root,root  .left,1);
    }
}