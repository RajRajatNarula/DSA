import java.util.*;
class Sol
{
    public static int maxprofit(int[] nums)
    {
        int minnum=nums[0];
        int maxprofit=0;
        
        for(int i:nums)
        {
            if(minnum>i)
            {
                minnum=i;
            }
            if(maxprofit<i-minnum)
            {
                maxprofit=i-minnum;
            }
        }
        return maxprofit;
    }
    
    public static void main(String[] args)
    {
        int nums[]={7,1,5,3,6,4};
        int profitmax=maxprofit(nums);
        System.out.println("Maximum profit is: "+profitmax);
    }
}