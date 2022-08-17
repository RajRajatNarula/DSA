import java.util.*;

class Solution
{
    
    public void checkanagrams(String str1,String str2)
    {
        int count[]=new int[256];
        
        
        if(str1.length()!=str2.length())
        {
            System.out.println("NOT ANAGRAMS");
            return;
        }
        
        Arrays.fill(count,0);
        
        
        for(int i=0;i<str1.length();i++)
        {
            count[str1.charAt(i)]+=1;
            count[str2.charAt(i)]-=1;
        }
        
        for(int i=0;i<256;i++)
        {
            if(count[i]!=0)
            {
                System.out.println("NOT ANAGRAMS");
                return;
            }
            
            
        }
        
        System.out.println("ANAGRAMS");
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        String str1="GEEKSFORGEEKS";
        String str2="FORGEEKSGEEKS";
        sol.checkanagrams(str1,str2);
    }
}