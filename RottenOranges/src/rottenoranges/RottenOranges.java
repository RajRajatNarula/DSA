import java.util.*;
class Solution
{
    public void rottenoranges(int[][] arr)
    {
        if(arr==null || arr.length==0)
        {
            System.out.println("Array is Empty");
            return;
        }
        
        
        
        int row=arr.length;
        int col=arr[0].length;
        Queue<int[]> rotten=new LinkedList<>();
        int countfresh=0;
        
        
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]==2)
                {
                    rotten.offer(new int[]{i,j});
                }
                
                if(arr[i][j]!=0)
                {
                    countfresh+=1;
                }
            }
        }
        
        if(countfresh==0)
        {
            System.out.println("Array is filled with empty spaces");
            return;
        }
        
        int countmin=0,count=0;
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        
        while(rotten.isEmpty()==false)
        {
            int size=rotten.size();
            count+=size;
            for(int i=0;i<size;i++)
            {
                int[] point=rotten.poll();
                for(int j=0;j<4;j++)
                {
                    int x=point[0]+dx[j];
                    int y=point[1]+dy[j];
                    
                    if(x<0 || y<0 || x>=row || y>=col || arr[x][y]==0 || arr[x][y]==2)
                    {
                        continue;
                    }
                    
                    arr[x][y]=2;
                    rotten.offer(new int[]{x,y});
                }
            }
            
            if(rotten.isEmpty()==false)
            {
                countmin+=1;
            }
            
        }
        
        if(countfresh==count)
        {
            System.out.println("Time taken to rot all oranges are: "+countmin);
        }
        else
        {
            System.out.println("All oranges cannot rot");
        }
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int arr[][]={ {2,1,1} , {1,1,0} , {0,1,1} };
        sol.rottenoranges(arr);
    }
}