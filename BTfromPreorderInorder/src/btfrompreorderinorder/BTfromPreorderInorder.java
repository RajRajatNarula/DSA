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
    public Node buildtree(int[] preorder,int[] inorder)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i], i);
        }
        
        Node root=createtree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
    
    public Node createtree(int[] preorder,int prestart,int preend,int[] inorder,int instart,int inend,Map<Integer,Integer> map)
    {
        if(prestart>preend || instart>inend)
        {
            return null;
        }
        
        Node root=new Node(preorder[prestart]);
        int inroot=map.get(preorder[prestart]);
        int leftnum=inroot-instart;
        
        
        root.left=createtree(preorder, prestart+1, prestart+leftnum, inorder, instart, inroot-1, map);
        root.right=createtree(preorder,prestart + leftnum + 1, preend, inorder, inroot+1, inend, map);
        
        return root;
    }
    
    public void printtree(Node root)
    {
        if(root == null)
        {
            return;
        }
        
        System.out.print(root.data+ " ");
        printtree(root.left);
        printtree(root.right);
    }
    
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int preorder[] = {10,20,40,50,30,60};
        int inorder[] = {40,20,50,10,60,30};
        Node root=sol.buildtree(preorder,inorder);
        sol.printtree(root);
    }
}