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
    public double countnode(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
        double lh=leftheight(root);
        
        double rh=rightheight(root);
        
        if(lh==rh)
        {
            
            return (Math.pow(2, rh)) -1;
        }
        
        else
        {
            return 1 + countnode(root.left) + countnode(root.right);
        }
        
    }
    
    public int leftheight(Node node)
    {
        int count = 0;
        while(node!=null)
        {
            count+=1;
            node=node.left;
        }
        return count;
    }
    
    public int rightheight(Node node)
    {
        int count=0;
        while(node!=null)
        {
            count+=1;
            node=node.right;
        }
        return count;
    }
    
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node  root = new Node(2);
        root . left = new Node(35);
        root . left . left = new Node(2);
        root . left . right = new Node(3);
        root . right = new Node(10);
        root . right . left = new Node(5);
        root . right . right = new Node(2);
        root . left . left . left = new Node(12);
        root . left . left . right = new Node(13);
        root . left . right . left = new Node(14);
        root . left . right . right = new Node(15);
        double ans = sol.countnode(root);
        System.out.println(ans);
        
    }
}