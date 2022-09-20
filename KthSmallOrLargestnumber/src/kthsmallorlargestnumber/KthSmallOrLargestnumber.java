// Not the most optimal approach

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
    
    public void inorder(Node root,List<Integer> count,int k)
    {
        if(root==null)
        {
            return;
        }
        
        inorder(root.left,count,k);
        if(count.size()<k)
        {
            count.add(root.data);
        }
        inorder(root.right,count, k);
        
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
        
        
        List<Integer> count=new ArrayList<>();
        sol.inorder(root,count,2);
        System.out.println(count.get(count.size()-1));
              
    }
}