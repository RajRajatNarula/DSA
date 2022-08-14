import java.util.*;
class Solution
{
    
    public String kthpermutation(int n,int k)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++)
        {
            fact*=i;
            arr.add(i);
        }
        
        if(k>fact*n)
        {
            return "Value of K is greater than the permutations possible";
        }
        arr.add(n);
        k=k-1;
        String str="";
        while(true)
        {
            str=str+""+arr.get(k/fact);
            arr.remove(k/fact);
            if(arr.size()==0)
            {
                break;
            }
            k=k%fact;
            fact=fact/arr.size();
        }
        return str;
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int n=4,k=128;
        String res=sol.kthpermutation(n,k);
        System.out.println(res);
    }
}