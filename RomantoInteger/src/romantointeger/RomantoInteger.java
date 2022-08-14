import java.util.*;
class Solution
{
    
    public void romtoint(String input)
    {
        HashMap<Character,Integer> table=new HashMap<>();
        
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);
        
        int n=input.length();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(i!=n-1 && table.get(input.charAt(i)) < table.get(input.charAt(i+1)))
            {
                sum+=table.get(input.charAt(i+1))-table.get(input.charAt(i));
                i+=1;
            }
            else
            {
                sum+=table.get(input.charAt(i));
            }
        }
        
        System.out.println("Roman to Integer of "+input+" is "+sum);  
    }
    
    public void inttorom(int num)
    {
        int n=num;
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"}; 
        String ans="";
        for(int i=0;i<values.length;i++)
        {
            while(num>=values[i])
            {
                num-=values[i];
                ans+=romanLetters[i];
            }
        }
        
        System.out.println("Integer to Roman of "+n +" is "+ans);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        String input = "MCMIV";
        sol.romtoint(input);
        sol.inttorom(1904);
    }
}