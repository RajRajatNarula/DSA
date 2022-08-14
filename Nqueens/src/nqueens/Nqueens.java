import java.util.*;
class Solution
{
    
    public void queens(int col,int n,char[][] board,int[] left,int[] ld, int[] ud,List<List<String>> list)
    {
        
        if(col==board.length)
        {
            list.add(converttostring(board));
            return;
        }
        
        for(int row=0;row<n;row++)
        {
            
            if(left[row]==0 && ld[row+col]==0 && ud[board.length-1+col-row]==0)
            {
                board[row][col]='Q';
                left[row]=1;
                ld[row+col]=1; 
                ud[n-1+col-row]=1;
                
                queens(col+1,n,board,left,ld,ud,list);
                
                board[row][col]='.';
                left[row]=0;
                ld[row+col]=0; 
                ud[n-1+col-row]=0;
                
            }
        }
    }
    
    public List<String> converttostring(char[][] board)
    {
        List<String> res=new LinkedList<String>();
        for(int i=0;i<board.length;i++)
        {
            String str=new String(board[i]);
            res.add(str);
        }
       
        return res;
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int n=4;
        char[][] board=new char[n][n];
        int[] left=new int[n];
       
        int[] ld=new int[2*n-1];
      
        int[] ud=new int[2*n-1];
       
        List<List<String>> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i], '.');
        }
        sol.queens(0,n,board,left,ld,ud,list);
        for(int i=0;i<list.size();i++)
        {
            System.out.println("Arrangment:"+(i+1) );
               for(int j=0;j<n;j++)
                    {
                        System.out.println(list.get(i).get(j));
                    }
               System.out.println("");
        }
        
        
    }

}