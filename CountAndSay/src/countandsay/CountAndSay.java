import java.util.*;
class Solution
{
    public void countsay(int n)
    {
        if(n==1) 
        {
            System.out.println("1");
            return;
        } 
        if(n==2)
        {
            System.out.println("11");
            return;
        }
        
        
        String str="11";
        for(int i=3;i<=n;i++)
        {
            str+="$";
            int len=str.length();
            String temp="";
            int count=1;
            char[] arr=str.toCharArray();
            for(int j=1;j<len;j++)
            {
                if(arr[j]!=arr[j-1])
                {
                    temp+=count;
                    temp+=arr[j-1];
                    count=1;
                }
                else
                {
                    count+=1;
                }
            }
            
            str=temp;
        }
        
        System.out.println(str);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int n=3;
        sol.countsay(n);
    }
}