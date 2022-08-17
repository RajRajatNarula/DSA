import java.util.ArrayList;

class Solution
{
    public void search(String text,String pattern)
    {
        int m=pattern.length();
        int n=text.length();
        ArrayList<Integer> arr=new ArrayList<>();
        String concat=pattern+"$"+text;
        int x=concat.length();
        int i=0;
        while(i<x)
        {
            if(i<=m)
            {
                arr.add(0);
            }
            else
            {
                int left=0,right=0;
                if(concat.charAt(left) == concat.charAt(i))
                {
                    
                    right=i;
                    while(concat.charAt(left) == concat.charAt(right) && right<x)
                    {
                        
                        left+=1;
                        right+=1;
                    }
                }
                
                arr.add(left);
            }
            i+=1;
        }
        for(i=0;i<arr.size();i++)
        {
            if(arr.get(i)==m)
            {
                System.out.println("Pattern found at index: "+(i-m-1));
            }
        }
       
        
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        String text = "GEEKS FOR GEEKS";
        String pattern = "GEEK";
 
        sol.search(text, pattern); 
    }
}