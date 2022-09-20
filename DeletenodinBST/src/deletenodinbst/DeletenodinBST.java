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
    public Node delete(Node root,int val)
    {
        if(root==null)
        {
            return null;
        }
        
        if(root.data==val)
        {
            return root=helper(root);
        }
        Node cur=root;
        while(cur!=null)
        {
            if(cur.data>val)
            {
                if(cur.left!=null && cur.left.data==val)
                {
                    cur.left=helper(cur.left);
                    break;
                }
                else
                {
                    cur=cur.left;
                }
            }
            else
            {
                if(cur.right!=null && cur.right.data==val)
                {
                    cur.right=helper(cur.right);
                    break;
                }
                else
                {
                    cur=cur.right;
                }
            }
        }
        return root;
        
    }
    
    public Node helper(Node node)
    {
        if(node.left==null)
        {
            return node.right;
        }
        
        else if(node.right==null)
        {
            return node.left;
        }
        
        else
        {
            Node rightchild=node.right;
            Node leftchildlastright=findlastright(node.left);
            leftchildlastright.right=rightchild;
            return node.left;
        }
    }
    
    public Node findlastright(Node node)
    {
        while(node.right!=null)
        {
            node=node.right;
        }
        
        return node;
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
        Node node=sol.delete(root,20);
        sol.print(node);
    }
}