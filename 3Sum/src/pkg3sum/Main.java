import java.util.*;
class Solution
{
    public ArrayList<ArrayList<Integer>> threesum(int[] arr)
    {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<arr.length-2;i++)
        {
            if(i==0 || (i>0 && arr[i]!=arr[i-1]))
            {
                int low=i+1;
                int high=arr.length-1;
                int sum=0-arr[i];
                while(low<high)
                {
                    if(arr[low]+arr[high]==sum)
                    {
                        ArrayList<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[low]);
                        temp.add(arr[high]);
                        res.add(temp);
                        low++;
                        high--;
                        while(low<high && arr[low]==arr[low+1]){low++;}
                        while(low<high && arr[high]==arr[high-1]){high--;}
                    }
                    else if(arr[low]+arr[high]<sum)
                    {
                        low++;
                    }
                    else
                    {
                        high--;
                    }
                }
            }
        }
        return res;      
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr=new int[]{-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> result=sol.threesum(arr);
        for(int i=0;i<result.size();i++)
        {
            System.out.println(result.get(i));
        }
    }
}