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
    public void leftview(Node root)
    {
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(queue.isEmpty()==false)
        {
            int size=queue.size();
            
            for(int i=0;i<size;i++)
            {
                Node node=queue.remove();
                
                // Condition to print left view
                if(i==0)
                {
                    System.out.println(node.data);
                }
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node root=new Node(10);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.right=new Node(15);
        root.right.right=new Node(20);
        sol.leftview(root);
    }
}