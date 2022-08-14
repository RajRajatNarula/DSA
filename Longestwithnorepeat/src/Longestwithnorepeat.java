import java.util.*;
class Sol
{
    public static void main(String[] args)
    {
        String str="abcdefab";
        
        HashMap<Character  ,Integer> hm=new HashMap<Character,Integer>();
        int j=0;
        int maxlength=0;
        for(int i=0;i<str.length();i++)
        {
            if(hm.get(str.charAt(i))==null)
            {
                hm.put(str.charAt(i), i);
            }
            else
            {
                maxlength=Integer.max(maxlength,i-j);
                j+=1;
            }
        }
        System.out.println(maxlength);
    }
}