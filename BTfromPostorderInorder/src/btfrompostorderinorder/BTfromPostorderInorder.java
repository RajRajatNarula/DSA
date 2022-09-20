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
    public Node buildtree(int[] postorder,int[] inorder)
    {
        if(postorder==null || inorder==null || postorder.length!=inorder.length)
        {
            return null;
        }
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i], i);
        }
        
        Node root=createtree(postorder,0,postorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
    
    public Node createtree(int[] postorder,int poststart, int postend,int[] inorder, int instart, int inend, Map<Integer,Integer> map)
    {
        if(poststart>postend || instart>inend)
        {
            return null;
        }
        
        Node root=new Node(postorder[postend]);
        int inroot=map.get(postorder[postend]);
        int leftnum=inroot-instart;
        
        root.left=createtree(postorder,poststart,poststart+leftnum-1,inorder,instart,inroot-1,map);
        root.right=createtree(postorder,poststart+leftnum,postend-1,inorder,inroot+1,inend,map);
        
        return root;
    }
    
    public void printtree(Node root)
    {
        if(root == null)
        {
            return;
        }
        
        printtree(root.left);
        printtree(root.right);
        System.out.print(root.data+ " ");
    }
    
    public static void main(String[] args)
    {
        
        Solution sol=new Solution();
        int[] inorder={40,20,50,10,60,30};
        int[] postorder={40,50,20,60,30,10};
        Node root=sol.buildtree(postorder,inorder);
        sol.printtree(root);
    }
}