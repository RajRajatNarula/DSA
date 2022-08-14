    import java.util.*;
class Solution
{
    public void largesthist(int[] histogram)
    {
        Stack<Integer> stack=new Stack<>();
        int maxarea=0;
        int n=histogram.length;
        for(int i=0;i<=n;i++)
        {
            while(stack.isEmpty()==false &&(i==n || histogram[stack.peek()]>=histogram[i]))
            {
                int height=histogram[stack.peek()];
                stack.pop();
                int width;
                if(stack.isEmpty())
                {
                    width=i;
                }
                else
                {
                    width=i-stack.peek()-1;
                }
                
                maxarea=Math.max(maxarea,height*width);
            }
            stack.push(i);
        }
        System.out.println("Largest Histogram is: "+maxarea);
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int histo[] = {3, 1, 5, 6, 2, 3};
        sol.largesthist(histo);
    }
}