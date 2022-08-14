import java.util.*;
class Sol
{
    public static void triangle(int n)
    {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> ans,pre=null;
        for(int i=0;i<n;i++)
        {
            ans=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print(pre.get(j-1)+pre.get(j));
                }
            }
            
        }
        
    }
    
    public static void main(String[] args)
    {
        int n=5;
        triangle(5);
    }
}