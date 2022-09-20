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
    public Node lca(Node root,int a,int b)
    {
        if(root==null)
        {
            return null;
        }
        
        int cur=root.data;
        if(cur>a && cur>b)
        {
            return lca(root.left,a,b);
        }
        if(cur<a && cur<b)
        {
            return lca(root.right,a,b);
        }
        return root;
    }
    
     public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node root=new Node(20);
        
        root.left=new Node(10);
        root.right=new Node(30);
        
        root.left.left=new Node(5);
        root.left.right=new Node(15);
        
        root.right.left=new Node(25);
        root.right.right=new Node(35);
        
        Node res=sol.lca(root,30,35);
        System.out.println(res.data);
    }
}