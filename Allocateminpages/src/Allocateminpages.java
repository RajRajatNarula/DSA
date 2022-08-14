import java.util.*;
class Solution
{
    public boolean ispossible(int[] arr,int mid,int target)
    {
        int count=0;
        int sumtillnow=0;
        
        for(int i:arr)
        {
            
            if(sumtillnow+i>mid)
            {
                count+=1;
                
                sumtillnow=i;
                if(sumtillnow>mid)
                {
                    return false;
                }
            }
            else
            {
                sumtillnow+=i;
//                System.out.println(sumtillnow);
//                System.out.println("---------------------");
            }
        }
        
        if(count<target)
        {
            
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void minpages(int[] arr,int target)
    {
        if(arr.length<target)
        {
            System.out.println("No Possible Solution");
            return;
        }
        
        int low=arr[0];
        int high=0;
        
        for(int i:arr)
        {
            high+=i;
            low=Math.min(low,i);
        }
        
        int res=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(ispossible(arr,mid,target))
            {
                res=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        System.out.println(res);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr={12,34,67,90};
        int target=2;
        sol.minpages(arr,target);
    }
}