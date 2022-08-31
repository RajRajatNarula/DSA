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
    public ArrayList<ArrayList<Integer>> zigzag(Node root)
    {
        Queue<Node> queue=new LinkedList<>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        
        if(root==null)
        {
            return list;
        }
        
        queue.offer(root);
        boolean flag=true;
        
        while(queue.isEmpty()==false)
        {
            int size=queue.size();
            ArrayList<Integer> sublist=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                if(queue.peek().left!=null)
                {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null)
                {
                    queue.offer(queue.peek().right);
                }
                
                if(flag==true)
                {
                    sublist.add(queue.poll().data);
                }
                else
                {
                    sublist.add(0,queue.poll().data);
                }
            }
            flag=!flag;
            list.add(sublist);
        }
        return list;
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node root=new Node(20);
        root.left=new Node(10);
        root.left.left=new Node(5);
        root.left.right=new Node(15);
        root.right=new Node(30);
        root.right.left=new Node(25);
        root.right.right=new Node(35);
        
        ArrayList<ArrayList<Integer>> result=sol.zigzag(root);
        System.out.println(result);
        
    }
}