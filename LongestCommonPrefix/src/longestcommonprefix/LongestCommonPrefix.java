import java.util.*;
class Solution
{
    public int minlength(String[] arr)
    {
        int minlen=arr[0].length();
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i].length()<minlen)
            {
                minlen=arr[i].length();
            }
        }
        return minlen;
    }
    
    public void lcp(String[] arr)
    {
        int n=arr.length;
        int minlen=minlength(arr);
        char current;
        String res="";
        for(int i=0;i<minlen;i++)
        {
            current=arr[0].charAt(i);
            
            for(int j=1;j<n;j++)
            {
                if(arr[j].charAt(i)!=current)
                {
                    System.out.println("Longes Common Prefix: "+res);
                    return;
                }
                
            }
            res+=current;
            
        }
        
        System.out.println("Longes Common Prefix: "+res);
        
                
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        String[] arr={"apple","applications","appe"};
        sol.lcp(arr);
        
    }
}