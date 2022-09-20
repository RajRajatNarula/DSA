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
    public Node lca(Node root,int p,int q)
    {
        if(root==null || root.data==p || root.data==q)
        {
            return root;
        }
        
        Node left=lca(root.left, p, q);
        Node right=lca(root.right, p, q);
        
        
        if(left==null)
        {
            return right;
        }
        else if(right==null)
        {
            return left;
        }
        else
        {
            return root;
        }
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        
        Node res=sol.lca(root,5,15);
        System.out.println(res.data);
    }
}