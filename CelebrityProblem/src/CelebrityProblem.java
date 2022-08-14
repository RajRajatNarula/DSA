import java.util.*;
class Solution
{
    
    public void findcelebrity(int n,int[][] matrix)
    {
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<n;i++)
        {
            stack.push(i);
        }
        
        while(stack.size()>=2)
        {
            int i=stack.pop();
            int j=stack.pop();
            
            if(matrix[i][j]==1)
            {
                stack.push(j);
            }
            else
            {
                stack.push(i);
            }
        }
        
        int potentialceleb=stack.pop();
        
        for(int i=0;i<n;i++)
        {
            if(i!=potentialceleb && (matrix[potentialceleb][i]==1 || matrix[i][potentialceleb]==0))
                    {
                        System.out.println("There is NO Celebrity");
                        return;
                    }
        }
        
        System.out.println("Celebrity is: "+potentialceleb);
        
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int n=4;
        int[][] matrix={ {0, 0, 1, 0},
                         {0, 0, 1, 0},
                         {0, 1, 0, 0},
                         {0, 0, 1, 0} };
        sol.findcelebrity(n,matrix);
    }
}