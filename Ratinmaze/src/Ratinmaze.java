import java.util.*;
class Solution
{
    public void ratinmaze(int i,int j,int[][] arr,int[][] vis,ArrayList<String> res,String moves,int[] di,int[] dj,int n)
    {
       
        
        if(i==n-1 && j==n-1)
        {
            res.add(moves);
            return;
        }
        
        String direction="DLRU";
          
        for(int ind=0;ind<n;ind++)
        {
            int indexi=i+di[ind];
            
            int indexj=j+dj[ind];
            if(indexi>=0 && indexj>=0 && indexi<n && indexj<n && vis[indexi][indexj]==0 && arr[indexi][indexj]==1)
            {
                vis[i][j]=1;
                ratinmaze(indexi,indexj,arr,vis,res,moves+direction.charAt(ind),di,dj,n);
                vis[i][j]=0;
            }
        }
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int n = 4;
        int[][] arr = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        int[][] vis=new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(vis[i], 0);
        }
        
        ArrayList<String> res=new ArrayList<>();
        String moves="";
        int[] di={1,0,0,-1};
        int[] dj={0,-1,1,0};
        
        if(arr[0][0]==1)
        {
            sol.ratinmaze(0,0,arr,vis,res,moves,di,dj,n);
        }
        System.out.println(res);
    }
}