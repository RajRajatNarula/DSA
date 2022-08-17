import java.util.*;
class Solution
{
    public void search(String txt,String pat,int q)
    {
        int d=256;
        int n=txt.length();
        int m=pat.length();
        int i,j;
        int p=0;
        int t=0;
        int h=1;
        
        
//        Try to learn the use of h
        for(i=0;i<m-1;i++)
        {
            h=(h*d)%q;
        }
        
        for(i=0;i<m;i++)
        {
            p=(d*p + pat.charAt(i))%q;
            t=(d*t + txt.charAt(i))%q;
        }
        
        for(i=0;i<n-m;i++)
        {
            if(p==t)
            {
                for(j=0;j<m;j++)
                {
                    if(pat.charAt(j)!=txt.charAt(i+j))
                    {
                        break;
                    }
                    
                    
                }
                if(j==m)
                    {
                        System.out.println("Pattern found at Index: "+i);
                    }
            }
            
            if(i<n-m)
            {
                t=(d*(t-txt.charAt(i)*h)+txt.charAt(i+m))%q;
                
                
                
                if(t<0)
                {
                    t=t+q;
                    
                }
            }
        }
        
    }
    
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        int q=101;
        sol.search(txt,pat,q);
        
    }
}