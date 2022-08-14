import java.util.*;
class Sol
{
    public static void twosum(int[] num,int target)
    {
        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<num.length;i++)
        {
            if(hm.containsKey(target-num[i]))
            {
                System.out.println("["+hm.get(target-num[i])+","+i+"]");
            }
            else
            {
                hm.put(num[i], i);
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] num={2,7,11,15};
        int target=9;
        twosum(num,target);
    }
}