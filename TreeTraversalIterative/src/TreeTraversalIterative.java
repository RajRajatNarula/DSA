
import java.util.Stack;

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
    public void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Node temp=root;
        Stack<Node> stack=new Stack<>();
        stack.push(temp);
        while(stack.isEmpty()==false)
        {
            Node top=stack.pop();
            System.out.print(top.data+" ");
            if(top.right!=null)
            {
                stack.push(top.right);
            }
            
            if(top.left!=null)
            {
                stack.push(top.left);
            }
        }
    }
    
    public void inorder(Node root)
    {
          
    }
    
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(2);
        root.left.right=new Node(8);
        root.right.left=new Node(12);
        root.right.right=new Node(18);
        
        // ********************************   DFS   ****************************
        
        System.out.println("PREORDER");
        sol.preorder(root);
        System.out.println("\n-----------------");
        
        System.out.println("INORDER");
        sol.inorder(root);
        System.out.println("\n-----------------");
        
//        System.out.println("POSTORDER");
//        sol.postorder(root);
    }
}