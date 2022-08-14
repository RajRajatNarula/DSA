import java.util.*;
class Solution
{
    public void kthelement(int[] arr1,int[] arr2,int m,int n,int k)
    {
        if(m>n)
        {
            kthelement(arr2,arr1,n,m,k);
            return;
        }
        int low=Math.max(0, k-n);//If size of k is more than elements in 2nd array, then in case where 0 elements are picked from arr1 we wont be able to get enough elements to get required no.of number
        int high=Math.min(k, m); // If size of k is less than size of array 1, we can take low as 0 and high as k
        while(low<=high)
        {
            int cut1=(low+high)/2;
            int cut2=k-cut1;
            
            int l1=(cut1==0)?Integer.MIN_VALUE:arr1[cut1-1];
            int l2=(cut2==0)?Integer.MIN_VALUE:arr2[cut2-1];
            int r1=(cut1==m)?Integer.MAX_VALUE:arr1[cut1];
            int r2=(cut2==n)?Integer.MAX_VALUE:arr2[cut2];
            
            if(l1<=r2 && l2<=r1)
            {
                System.out.println(Math.max(l1, l2));
                return;
            }
            else if(l1>=r2)
            {
                high=cut1-1;
            }
            else
            {
                low=cut1+1;
            }
        }
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int arr1[] = {1,4,7,10,12};
        int arr2[] = {2,3,6,15};
        int m = arr1.length;
        int n = arr2.length;
        int k=2;
        sol.kthelement(arr1,arr2,m,n,k);
    }
}