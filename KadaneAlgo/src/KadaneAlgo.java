import java.util.*;
class Sol
{
   public static void Maxsumm(int[] nums)
   {
       int maxcurrent=0;
       int maxsofar=0;
       int start=0,end=0,s=0;
       for(int i=0;i<nums.length;i++)
       {
           maxcurrent+=nums[i];
           if(maxcurrent>maxsofar)
           {
               maxsofar=maxcurrent;
               start=s;
               end=i;
           }
           else if(maxcurrent<0)
           {
               maxcurrent=0;
               s=i+1;
           }
       }
       System.out.println("Max subarray Sum: "+maxsofar+"\nStart Index: "+start+"\nEnding Index: "+end);
   }
   
   public static void main(String[] args)
   {
       int[] nums={-2,1,-3,4,-1,2,1,-5,4};
       Maxsumm(nums);
   }
}