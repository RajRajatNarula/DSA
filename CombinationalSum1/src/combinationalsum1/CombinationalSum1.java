import java.util.*;

class Solution
{
    
    public void combinationalsum(int ind,int[] arr,int target,List<List<Integer>> list,List<Integer> num)
    {
        if(ind==arr.length)
        {
            if(target==0)
            {
                list.add(new ArrayList<>(num));
            }
                
            return;
        }
        
        if(arr[ind]<=target)
        {
            num.add(arr[ind]);
            combinationalsum(ind,arr,target-arr[ind],list,num);
            num.remove(num.size()-1);
        }
        combinationalsum(ind+1,arr,target,list,num);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr=new int[]{2,3,6,7};
        int target=7;
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> num=new ArrayList<>();
        sol.combinationalsum(0,arr,target,list,num);
     
        System.out.println(list);
        
    }
}