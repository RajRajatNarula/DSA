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
    public boolean search(Node root,int value)
    {
        while(root!=null && root.data!=value)
        {
            if(value<root.data)
            {
                root=root.left;
            }
            else
            {
                root=root.right;
            }
        }
        
        if(root==null)
        {
            return false;
        }
        else
        {
            return true;
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
        
        boolean res=sol.search(root,45);
        System.out.println(res);
    }
}