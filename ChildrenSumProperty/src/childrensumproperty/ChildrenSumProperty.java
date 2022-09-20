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
    
    public void childsumprop(Node root)
    {
        if(root==null)
        {
            return;
        }
        int child=0;
        
        if(root.left!=null)
        {
            child+=root.left.data;
        }
        
        if(root.right!=null)
        {
            child+=root.right.data;
        }
        
        if(child>root.data)
        {
            root.data=child;
        }
        else if(child<=root.data)
        {
            if(root.left!=null) root.left.data=root.data;
            if(root.right!=null) root.right.data=root.data;
        }
        
        childsumprop(root.left);
        childsumprop(root.right);
        
        int tot=0;
        
        if(root.left!=null) tot+=root.left.data;
        if(root.right!=null) tot+=root.right.data;
        if(root.left!=null || root.right!=null)  root.data=tot;
        
        
    }
    
    public void preorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        
        System.out.print(node.data+ " ");
        preorder(node.left);
        preorder(node.right);
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
        sol.preorder(root);
        sol.childsumprop(root);
        System.out.println("");
        sol.preorder(root);
    }
}