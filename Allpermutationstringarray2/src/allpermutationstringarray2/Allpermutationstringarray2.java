import java.util.*;
class Solution
{
    
    public void permutation(int ind,int[] arr,List<List<Integer>> list)
    {
        if(ind==arr.length)
        {
            ArrayList<Integer> num=new ArrayList<>();
            for(int i:arr)
            {
                num.add(i);
            }
            list.add(new ArrayList<>(num));
            return;
        }
        
        for(int i=ind;i<arr.length;i++)
        {
            swap(i,ind,arr);
            permutation(ind+1,arr,list);
            swap(i,ind,arr);
        }
        
    }
    
    public void swap(int i,int j,int[] arr)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr={1,2,3};
        List<List<Integer>> list=new ArrayList<>();
        sol.permutation(0,arr,list);
        System.out.println(list);
    }
}