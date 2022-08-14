import java.util.*;
class Sol
{
    public static int[][] rotate(int[][] nums,int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<row;i++)
        {
            for(int j=i;j<col;j++)
            {
                int temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col/2;j++)
            {
                int temp=nums[i][j];
                nums[i][j]=nums[i][col-1-j];
                nums[i][col-1-j]=temp;
            }
        }
        
        return nums;
        
    }
    
    public static void main(String[] args)
    {
        int[][] nums={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row=nums.length;
        int col=nums[0].length;
        int[][] res=rotate(nums,row,col);
        
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