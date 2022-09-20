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
    public void kdistancenode(Node root,int k)
    {
        if(root==null)
        {
            return;
        }
        
        if(k==0)
        {
            System.out.println(root.data);
        }
        
        kdistancenode(root.left, k-1);
        kdistancenode(root.right, k-1);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        Node  root = new Node(2);
        root . left = new Node(35);
        root . left . left = new Node(2);
        root . left . right = new Node(3);
        root . right = new Node(10);
        root . right . left = new Node(5);
        root . right . right = new Node(2);
        sol.kdistancenode(root,2);
    }
}