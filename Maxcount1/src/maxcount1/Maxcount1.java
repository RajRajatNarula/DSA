import java.util.*;
class Solution
{
    public int maxcount1(int[] arr)
    {
        int maxcount=0;
        int currentcount=0;
        for(int i:arr)
        {
            if(i==1)
            {
               currentcount+=1;
                
                if(maxcount<currentcount)
                {
                    maxcount=currentcount;
                    
                }
            }
            else
            {
                
                currentcount=0;
            }
        }
        return maxcount;
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr=new int[]{1, 1, 0, 1, 1, 1};
        int res=sol.maxcount1(arr);
        System.out.println("Max consecutive count of 1 is: "+res);
    }
}