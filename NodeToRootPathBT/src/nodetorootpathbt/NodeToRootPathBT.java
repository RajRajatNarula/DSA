
import java.util.ArrayList;

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
    public boolean nodetorootpath(Node root,ArrayList<Integer> arr,int x)
    {
        if(root==null)
        {
            return false;
        }
        
        arr.add(root.data);
        if(root.data==x)
        {
            return true;
        }
        
        if(nodetorootpath(root.left, arr, x) || nodetorootpath(root.right, arr, x))
        {
            return true;
        }
        
        arr.remove(arr.size()-1);
        return false;
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        root.right = new Node(3);
        
        ArrayList<Integer> arr=new ArrayList<>();
        
        if(sol.nodetorootpath(root,arr,7))
        {
            System.out.println(arr);
        }
        else
        {
            System.out.println("Not Found");
        }
        
    }
}