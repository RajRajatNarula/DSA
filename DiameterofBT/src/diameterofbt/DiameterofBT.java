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
    public int diameter(Node root,int m)
    {
        if(root == null)
        {
            return 0;
        }
        int lh=diameter(root.left,m);
        int rh=diameter(root.right,m);
        
        m=Math.max(m, lh+rh);
        
        return 1+Math.max(lh, rh);
                
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node root=new Node(4);
        root.left=new Node(7);
        root.right=new Node(8);
        root.right.left=new Node(1);
        root.right.left.left=new Node(3);
        root.right.right=new Node(18);
        int m=0;
        int d=sol.diameter(root,m);
        System.out.println(d);
    }
}