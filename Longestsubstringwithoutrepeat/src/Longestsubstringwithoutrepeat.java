import java.util.*;
class Sol
{
    public static int longestsubstring(String str)
    {
        int left=0,right=0,len=0;
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        while(right<str.length())
        {
            if(hm.containsKey(str.charAt(right)))
            {
                left=Math.max(hm.get(str.charAt(right)), left);
            }
            hm.put(str.charAt(right), right);
            len=Math.max(len, right-left+1);
            right+=1;
        }
        return len;
    }
    
    public static void main(String[] args)
    {
        String str="takeuforward";
        int res=longestsubstring(str);
        System.out.println("The Longest Substring Without Repeat is: "+res);
    }
}