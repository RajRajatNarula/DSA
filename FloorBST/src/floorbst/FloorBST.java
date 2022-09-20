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
    public int flooring(Node root,int key)
    {
        int floor=-1;
        while(root!=null)
        {
            if(root.data==key)
            {
                floor=root.data;
                return floor;
            }
            
            if(key>root.data)
            {
                floor=root.data;
                root=root.right;
            }
            else
            {
                
                root=root.left;
            }
        }
        
        return floor;
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
        
        int res=sol.flooring(root,23 );
        System.out.println("Floor of given KEY is: "+res);
    }
}