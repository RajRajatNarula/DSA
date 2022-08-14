import java.util.*;
class Solution
{
    public void partition(int ind,String str,ArrayList<String> arr,List<List<String>> list)
    {
        if(ind==str.length())
        {
            list.add(new ArrayList<>(arr));
            return;
        }
        
        for(int i=ind;i<str.length();i++)
        {
            if(ispalindrome(str,ind,i))
            {
                arr.add(str.substring(ind, i+1));
                partition(i+1,str,arr,list);
                arr.remove(arr.size()-1);
            }
        }
    }
    
    public boolean ispalindrome(String str,int start,int end)
    {
        while(start<=end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        String str="aabb";
        List<List<String>> list=new ArrayList<>();
        ArrayList<String> arr=new ArrayList<>();
        sol.partition(0,str,arr,list);
        System.out.println(list);
        
    }
}