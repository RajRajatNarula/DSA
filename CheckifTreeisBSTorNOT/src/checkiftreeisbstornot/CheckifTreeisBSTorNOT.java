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
    public boolean bstornot(Node root,int minval,int maxval)
    {
        if(root==null)
        {
            return true;
        }
        
        if(root.data<minval || root.data>maxval)
        {
            return false;
        }
        else
        {
            return (bstornot(root.left, minval, root.data) && bstornot(root.right, root.data, maxval));
        }
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
        
        boolean res=sol.bstornot(root,-Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.println(res);
    }
}