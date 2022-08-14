import java.util.*;
class Solution
{
    public void permutation(int[] arr,List<List<Integer>> list,ArrayList<Integer> num,boolean[] flag)
    {
        if(num.size()==arr.length)
        {
            list.add(new ArrayList<>(num));
            return;
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(!flag[i])
            {
                flag[i]=true;
                num.add(arr[i]);
                permutation(arr,list,num,flag);
                num.remove(num.size()-1);
                flag[i]=false;
            }
        }
        
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr={1,2,3};
        List<List<Integer>> list=new ArrayList<>();
        boolean[] flag=new boolean[arr.length];
        ArrayList<Integer> num=new ArrayList<>();
        sol.permutation(arr,list,num,flag);
        System.out.println(list);
    }
}