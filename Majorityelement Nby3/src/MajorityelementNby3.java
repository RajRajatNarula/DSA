import java.util.*;
class Sol
{
    public static void majority(int[] nums)
    {
        int count1=0,count2=0;
        int candidate1=0,candidate2=0;
        
        for(int i:nums)
        {
            if(i==candidate1)
            {
                count1+=1;
            }
            else if(i==candidate2)
            {
                count2+=1;
            }
            else if(count1==0)
            {
                candidate1=i;
                count1=1;
            }
            else if(count2==0)
            {
                candidate2=i;
                count2=1;
            }
            else
            {
                count1-=1;
                count2-=1;
            }
        }
        
        count1=0;
        count2=0;
        for(int i:nums)
        {
            if(i==candidate1)
            {
                count1+=1;
            }
            if(i==candidate2)
            {
                count2+=1;
            }
        }
        
        if(count1>nums.length/3)
        {
            System.out.println(candidate1);
        }
        if(count2>nums.length/3)
        {
            System.out.println(candidate2);
        }
    }
    
    
    public static void main(String[] args)
    {
        int[] nums={1,2,2,3,2,3,3,4};
        majority(nums);
    }
}