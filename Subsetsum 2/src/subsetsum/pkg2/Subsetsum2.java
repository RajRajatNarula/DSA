import java.util.*;
class Solution
{
    public void subsetsum(int ind,int[] arr,List<List<Integer>> list,List<Integer> num)
    {
        list.add(new ArrayList<>(num));
        for(int i=ind;i<arr.length;i++)
        {
            if(i>ind && arr[i]==arr[i-1]) continue;
        
            num.add(arr[i]);
            subsetsum(i+1,arr,list,num);
            num.remove(num.size()-1);
        }
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr=new int[]{1,2,2};
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        
        sol.subsetsum(0,arr,list,new ArrayList<>());
        System.out.println(list);
        
    }
}