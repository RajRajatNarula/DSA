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
    public Node insert(Node root,int val)
    {
        if(root==null)
        {
            return new Node(val);
        }
        Node cur=root;
        while(true)
        {
            if(cur.data>val)
            {
                if(cur.left!=null) cur=cur.left;
                else 
                {
                    cur.left=new Node(val);
                    break;
                }
            }
            else
            {
                if(cur.right!=null) cur=cur.right;
                else 
                {
                    cur.right=new Node(val);
                    break;
                }
            }
        }
        
        return root;
    }
    
    public void print(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
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
        sol.print(root);
        System.out.println("");
        Node node=sol.insert(root,23);
        sol.print(node);
        
    }
}
