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
    public int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int lh=height(root.left);
        int rh=height(root.right);
        
        return 1+Math.max(lh,rh);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(2);
        root.left.left.left=new Node(1);
        root.left.right=new Node(8);
        root.right.left=new Node(12);
        root.right.right=new Node(18);
        int h=sol.height(root);
        System.out.println("Height of Binary Tree: "+h);
    }
}