import java.util.*;
class Solution
{
    public int trappingrainwater(int[] height)
    {
        int n=height.length;
        int left=0;
        int right=n-1;
        int res=0;
        int maxleft=0;
        int maxright=0;
        
        while(left<=right)
        {
            if(height[left]<=height[right])
            {
                if(height[left]>=maxleft)
                {
                    maxleft=height[left];
                }
                else
                {
                    res+=maxleft-height[left];
                }
                left+=1;
            }
            
            else
            {
                if(height[right]>=maxright)
                {
                    maxright=height[right];
                }
                else
                {
                    res+=maxright-height[right];
                }
                right-=1;
            }
            
        }
        return res;
    }
    
    public static void main(String[] args)
    {
        
        Solution sol=new Solution();
        int[] height=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int result=sol.trappingrainwater(height);
        System.out.println("Total water trapped: "+result);
    }
    
    
}