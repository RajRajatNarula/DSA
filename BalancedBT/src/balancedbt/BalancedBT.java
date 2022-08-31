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
    
    public int checkifbalanced(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int lh=checkifbalanced(root.left);
        if(lh==-1) return -1;
        
        int rh=checkifbalanced(root.right);
        if(rh==-1) return -1;
        
        if(Math.abs(lh-rh)>1) return -1;
        
        return 1+Math.max(lh, rh);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(2);
        root.left.left.left=new Node(112);
        root.left.left.left.left=new Node(1112);
        root.left.right=new Node(8);
        root.right.left=new Node(12);
        root.right.right=new Node(18);
        int ans=sol.checkifbalanced(root);
        if(ans==-1)
        {
            System.out.println("NOT BALANCED");
        }
        else
        {
            System.out.println("BALANCED");
        }
    }
}