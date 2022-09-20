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
    public int ceiling(Node root,int key)
    {
        int ceil=-1;
        while(root!=null)
        {
            if(root.data==key)
            {
                ceil=root.data;
                return ceil;
            }
            
            if(key>root.data)
            {
                root=root.right;
            }
            else
            {
                ceil=root.data;
                root=root.left;
            }
        }
        
        return ceil;
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
        
        int res=sol.ceiling(root,25);
        System.out.println("Ceiling of given KEY is: "+res);
    }
}