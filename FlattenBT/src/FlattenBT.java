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
    
    public void flatten(Node root)
    {
        if(root==null)
        {
            return;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(stack.isEmpty()==false)
        {
            Node node=stack.pop();
            
            if(node.right!=null)
            {
                stack.push(node.right);
            }
            
            if(node.left!=null)
            {
                stack.push(node.left);
            }
            
            if(stack.isEmpty()==false)
            {
                node.right=stack.peek();
            }
            
            node.left=null;
        }
    }
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node  root = new Node(1);
        root . left = new Node(2);
        root . left . left = new Node(3);
        root . left . right = new Node(4);
        root . right = new Node(5);
        root . right . right = new Node(6);
        root . right . right . left = new Node(7);
        sol.flatten(root);
        Node current=root;
        while(current.right!=null)
        {
            System.out.print(current.data+" -> ");
            current=current.right;
        }
        System.out.print(current.data);
        System.out.println("");
    }
}