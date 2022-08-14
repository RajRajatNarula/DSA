import java.util.*;
class Solution
{
    public void slidingwindow(int k,int[] arr)
    {
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            if(dq.isEmpty()==false && dq.peek()==i-k)
            {
                dq.poll();
            }
            
            while(dq.isEmpty()==false && arr[dq.peekLast()]<=arr[i])
            {
                dq.pollLast();
            }
            
            
            dq.offer(i);
           
            if(i>=k-1)
            {
                res.add(arr[dq.peek()]);
            }
        }
        
        System.out.println(res);
    }
    
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int k=3;
        int arr[]={4,0,-1,3,5,3,6,8};
        sol.slidingwindow(k,arr);
    }
}