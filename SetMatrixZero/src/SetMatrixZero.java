import java.util.*;
class Sol
{
    public static void setzeroes(int[][] nums,int row,int col)
    {
        
        
        int[] dummy1=new int[row];
        int[] dummy2=new int[col];
        
        Arrays.fill(dummy1, -1);
        Arrays.fill(dummy2, -1);
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(nums[i][j]==0)
                {
                    dummy1[i]=0;
                    dummy2[j]=0;
                }
            }
        }
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(dummy1[i]==0 || dummy2[j]==0)
                {
                    nums[i][j]=0;
                }
            }
        }
        
    }
    
    public static void main(String[] args)
    {
        int nums[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int row=nums.length;
        int col=nums[0].length;
        setzeroes(nums,row,col);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println("");
        }
    }
}