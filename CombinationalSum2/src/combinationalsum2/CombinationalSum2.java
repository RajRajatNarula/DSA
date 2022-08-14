import java.util.*;
class Solution
{
    public void combinationalsum(int ind,int[] arr,int target,List<List<Integer>> list,ArrayList<Integer>  num)
    {
        if(target==0)
        {
            list.add(new ArrayList<>(num));
            return;
        }
        
        for(int i=ind;i<arr.length;i++)
        {
            if(i>ind && arr[i]==arr[i-1])
            {
                continue;
            }
            if(arr[i]>target)
            {
                break;
            }
            
            num.add(arr[i]);
            combinationalsum(i+1,arr,target-arr[i],list,num);
            num.remove(num.size()-1);
        }
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int arr[]={10,1,2,7,6,1,5};
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> num=new ArrayList<>();
        sol.combinationalsum(0,arr,8,list,num);
        System.out.println(list);
    }
}