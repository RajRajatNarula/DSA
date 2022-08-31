import java.util.*;
import javax.swing.plaf.RootPaneUI;
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
    
    public void preorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    
    public void inorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
        
    }
    
    public void postorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }
    
    
    
    public void levelorder(Node node)
    {
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while(queue.isEmpty()==false)
        {
            Node temp=queue.poll();
            System.out.print(temp.data+" ");
            
            if(temp.left!=null)
            {
                queue.add(temp.left);
            }
            
            if(temp.right!=null)
            {
                queue.add(temp.right);
            }
        }
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
        
        System.out.println("POSTORDER");
        sol.postorder(root);
        System.out.println("\n-------------------");
        
        //********************************   BFS   *****************************
        System.out.println("\nLEVEL ORDER");
        sol.levelorder(root);
        
    }
}