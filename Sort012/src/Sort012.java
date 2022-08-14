import java.util.*;
class Sol
{
    public static int[] sort012(int[] nums)
    {
        int low=0,mid=0,high=nums.length-1;
        
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                
                low+=1;
                mid+=1;
               
                       
            }
            
            else if(nums[mid]==1)
            {
                mid+=1;
            }
            else
            {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                
                high-=1;
                
            }
        }
        
        return nums;
        
    }
    
    public static void main(String[] args)
    {
        int[] nums={1,2,2,0,0,1,0,2};
        int[] result=sort012(nums);
        System.out.print("Sorted Array: ");
        for(int i:result)
        {
            System.out.print(i+" ");
        }
    }
}