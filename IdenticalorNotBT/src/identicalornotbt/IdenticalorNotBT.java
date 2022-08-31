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
    public boolean identicalornot(Node root1,Node root2)
    {
        if(root1==null && root2==null)
        {
            return true;
        }
        if(root1==null || root2==null)
        {
            return false;
        }
        
        return ((root1.data==root2.data) && identicalornot(root1.left, root2.left) && identicalornot(root1.right, root2.right));
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.right.left = new Node(4);
        root1.right.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.right.left = new Node(4);
        root2.right.right = new Node(5);
        
        if(sol.identicalornot(root1,root2))
        {
            System.out.println("The Trees are IDENTICAL");
        }
        else
        {
            System.out.println("The Trees are NOT IDENTICAL");
        }
    }
}