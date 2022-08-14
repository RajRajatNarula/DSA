import java.util.*;
class Solution
{
    
    public void subset(int ind,int sum,int n,int[] arr,ArrayList<Integer> num)
    {
        if(ind==n)
        {
            num.add(sum);
            return;
        }
        
        subset(ind+1,sum+arr[ind],n,arr,num);
        
        subset(ind+1,sum,n,arr,num);
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int[] arr=new int[]{3,1,2};
        
        int n=arr.length;
        ArrayList<Integer> num=new ArrayList<>();
        sol.subset(0,0,n,arr,num);
        Collections.sort(num);
        for(int i=0;i<num.size();i++)
        {
            System.out.print(num.get(i)+" ");
        }
    }
}