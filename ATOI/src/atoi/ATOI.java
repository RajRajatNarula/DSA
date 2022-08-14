import java.util.*;
class Solution
{
    
    public void atoi(String num)
    {
        int start=0;
        int n=num.length();
        int sign=1;
        int res=0;
        while(num.charAt(start)==' ')
        {
            start+=1;
        }
        
        if(num.charAt(start)=='-')
        {
            sign=-1;
            start+=1;
        }
        
        
        
        for(int i=start;i<n;i++)
        {
            
            if(num.charAt(i)-'0'>=0 && num.charAt(i)-'0'<=9)
            {
                res=res*10 + num.charAt(i)-'0';
               
            }
        }
        
        System.out.println(sign*res);
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        String num="-1234";
        sol.atoi(num);
        
    }
}