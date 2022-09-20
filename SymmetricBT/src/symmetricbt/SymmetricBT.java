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
    public boolean symmtric(Node l,Node r)
    {
        if(l==null && r==null)
        {
            return true;
        }
        if(l==null || r==null)
        {
            return false;
        }
        
        return ((l.data==r.data) && symmtric(l.left, r.right)  && symmtric(l.right, r.left));
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node  root = new Node(1);
        root . left = new Node(2);
        root . left . left = new Node(3);
        root . left . right = new Node(4);
        root . right = new Node(2);
        root . right . left = new Node(4);
        root . right . right = new Node(3);
        if(root==null)
        {
            System.out.println("Mirror of each other");
        }
        else
        {
            if(sol.symmtric(root.left,root.right))
            {
                System.out.println("Mirror of each other");
            }
            else
            {
                System.out.println("Not Mirror of each other");
            }
        }
    }
}