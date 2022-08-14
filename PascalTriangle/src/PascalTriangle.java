import java.util.*;
class Sol
{
    public static List<List<Integer>> triangle(int n)
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
                    ans.add(1);
                }
                else
                {
                    ans.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre=ans;
            res.add(ans);
            
        }
        return res;
        
    }
    
    public static void main(String[] args)
    {
        int n=5;
        List<List<Integer>> result=triangle(5);
        for(List i:result)
        {
            System.out.println(i);
        }
    }
}