import java.util.*;

class Solution
{
    
    public void checkanagrams(String str1,String str2)
    {
        
        if(str1.length()!=str2.length())
        {
            System.out.println("NOT ANAGRAMS");
            return;
        }
        
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for(char i:str1.toCharArray())
        {
            hm.put(i, 0);
        }
        
        for(int i=0;i<str1.length();i++)
        {
            hm.put(str1.charAt(i), hm.get(str1.charAt(i))+1);
            hm.put(str2.charAt(i), hm.get(str2.charAt(i))-1);
        }
        
        for(int i:hm.values())
        {
            if(i!=0)
            {
                System.out.println("NOT ANAGRAMS");
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