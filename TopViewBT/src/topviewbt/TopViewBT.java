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

class Tuple
{
    Node node;
    int level;
    Tuple(Node _node,int _level)
    {
        node=_node;
        level=_level;
    }
}


class Solution
{
    public void topview(Node root)
    {
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null)
        {
            return;
        }
        
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Tuple> queue=new LinkedList<>();
        queue.add(new Tuple(root,0));
        System.out.println("here i am");
        while(queue.isEmpty()==false)
        {
           
            Tuple tup=queue.remove();
            Node node=tup.node;
            int level=tup.level;
            if(map.get(level)==null)
            {
                map.put(level, node.data);
            }
            if(node.left!=null)
            {
                queue.add(new Tuple(node.left,level-1));
            }
            if(node.right!=null)
            {
                queue.add(new Tuple(node.right,level+1));
            }
        }
        
        for(int i:map.keySet())
        {
            System.out.print(map.get(i)+" ");
        }
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.left = new Node(9);
        root.right.right = new Node(10);
        System.out.println("calling");
        sol.topview(root);
        
    }
}