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
    public String serialize(Node root)
    {
        Queue<Node> queue=new LinkedList<>();
        String res="";
        queue.add(root);
        while(queue.isEmpty()==false)
        {
            Node node=queue.poll();
            if(node==null)
            {
                res+="n ";
            }
            else
            {
                res+=node.data+" ";
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        
        return res;
    }
    
    public Node deserialize(String serial)
    {
        if(serial=="")
        {
            return null;
        }
        Queue<Node> queue=new LinkedList<>();
        String[] data=serial.split(" ");
        Node root1=new Node(Integer.parseInt(data[0]));
        queue.add(root1);
        for(int i=1;i<data.length;i++)
        {
            Node parent=queue.poll();
            if(!data[i].equals("n"))
            {
                Node left=new Node(Integer.parseInt(data[i]));
                parent.left=left;
                queue.add(left);
            }
            
            i+=1;
            
            if(!data[i].equals("n"))
            {
                Node right=new Node(Integer.parseInt(data[i]));
                parent.right=right;
                queue.add(right);
            }
        }
        System.out.println("root value"+root1.data);
        return root1;
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
        Node  root = new Node(2);
        root . left = new Node(35);
        root . left . left = new Node(2);
        root . left . right = new Node(3);
        root . right = new Node(10);
        root . right . left = new Node(5);
        root . right . right = new Node(2);
        root . left . right . left = new Node(14);
        root . left . right . right = new Node(15);
        root . right . right . left = new Node(12);
        root . right . right . right = new Node(13);
        
        String serial=sol.serialize(root);
        System.out.println(serial);
        System.out.println("");
        Node root1=sol.deserialize(serial);
        
        String seria=sol.serialize(root1);
        System.out.println(seria);
        
    }
}