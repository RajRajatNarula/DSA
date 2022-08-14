import java.util.*;
class Solution
{
    
    public void reversestring(String sentence)
    {
        int left=0;
        int right=sentence.length()-1;
        
        String temp="";
        String ans="";
        
        while(left<=right)
        {
             
            if(sentence.charAt(left)!=' ')
            {
                temp+=sentence.charAt(left);
               
            }
            else
            {
                if(!ans.equals(""))
                {
                    ans=temp+" "+ans;
                }
                else
                {
                    ans=temp;
                }
                temp="";
            }
            
            
            left+=1;
        }
        
        if(!temp.equals(""))
        {
            if(!ans.equals(""))
            {
                ans=temp+" "+ans;
            }
            else
            {
                ans=temp;
            }
        }
        
        
        System.out.println(ans);
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        sol.reversestring("Hi my name is Rajat Narula");
    }
}