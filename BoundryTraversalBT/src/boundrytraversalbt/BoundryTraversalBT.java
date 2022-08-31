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
    public boolean isleaf(Node node)
    {
        return (node.left==null && node.right==null);
    }
    
    public void lefttraversal(Node node,ArrayList<Integer> ans)
    {
        while(node!=null)
        {
            if(isleaf(node)==false)
            {
                ans.add(node.data);
            }
            if(node.left!=null)
            {
                node=node.left;
                
            }
            else
            {
                node=node.right;
            }
                    
        }
    }
    
    public void addleaves(Node node,ArrayList<Integer> ans)
    {
        if(isleaf(node)==true)
        {
            ans.add(node.data);
        }
        
        if(node.left!=null)
        {
            addleaves(node.left,ans);
        }
        if(node.right!=null)
        {
            addleaves(node.right,ans);
        }
    }
    
    public void righttraversal(Node node,ArrayList<Integer> ans)
    {
        ArrayList<Integer> result=new ArrayList<>();
        
        while(node!=null)
        {
            if(isleaf(node)==false)
            {
                result.add(node.data);
            }
            if(node.right!=null)
            {
                node=node.right;
            }
            else
            {
                node=node.left;
            }
            
        }
        
        for(int i=result.size()-1;i>=0;i--)
        {
            ans.add(result.get(i));
        }
        
    }
    
    public void boundrytraversal(Node root,ArrayList<Integer> ans)
    {
        if(isleaf(root)==false)
        {
            ans.add(root.data);
        }
        
        lefttraversal(root.left,ans);
        addleaves(root,ans);
        righttraversal(root.right,ans);
        
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);
        ArrayList<Integer> ans=new ArrayList<>(); 
        
        sol.boundrytraversal(root,ans);
    }
}