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
    public int maxsumpath(Node root,int[] m)
    {
        if(root==null)
        {
            return 0;
        }
        
        int lh=maxsumpath(root.left, m);
        int rh=maxsumpath(root.right, m);
        
        m[0]=Math.max(m[0], lh+rh+root.data);
       
        
        return root.data+Math.max(lh, rh);
    }
    
    public static void main(String[] args)
    {
       Solution sol=new Solution();
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        int[] m=new int[1];
        m[0]=Integer.MIN_VALUE;
        int result = sol.maxsumpath(root,m);
        
        System.out.println("Max Sum Path is: "+m[0]);
    }
}