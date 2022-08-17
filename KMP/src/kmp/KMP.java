import java.util.*;
class Solution
{
    
    public void search(String text,String pat)
    {
        int m=pat.length();
        int n=text.length();
        
        int[] lps=new int[m];
        
        createlps(m,lps,pat);
        for(int i:lps)
        {
            System.out.println(i);
        }
        int j=0;
        int i=0;
        
        while(i<n)
        {
            if(pat.charAt(j)==text.charAt(i))
            {
                i+=1;
                j+=1;
            }
            
            if(j==m)
            {
                System.out.println("Pattern found at index: "+(i-m));
                j=lps[j-1];
                
            }
               
            else if (i < n && pat.charAt(j) != text.charAt(i)) {
                
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
            
        }
    }
    
    public void createlps(int m,int[] lps,String pat)
    {
        int len=0;
        int i=1;
        lps[0]=0;
        
        while(i<m)
        {
            if(pat.charAt(len)==pat.charAt(i))
            {
                len+=1;
                lps[i]=len;
                i+=1;
            }
            
            else
            {
                if(len!=0)
                {
                    len=lps[len-1];
                }
                else
                {
                    lps[i]=len;
                    i+=1;
                }
            }
        }
    }
    
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        String text = "AAADCAADC";
        String pat = "AADC";
        sol.search(text,pat);
    }
}