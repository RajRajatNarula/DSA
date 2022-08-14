import java.util.*;
class Sol
{
    public static List<List<Integer>> foursum(int[] num,int target)
    {
        
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        int n=num.length;
        if(num==null || n==0)
        {
            return res;
        }
        Arrays.sort(num);
        for(int i=0;i<n;i++)
        {
            int target2=target-num[i];
            for(int j=i+1;j<n;j++)
            {
                int target3=target2-num[j];
                int front=j+1;
                int end=n-1;
                while(front<end)
                {
                    int sum=num[front]+num[end];
                    if(sum<target3)
                    {
                        front+=1;
                    }
                    else if(sum>target3)
                    {
                        end-=1;
                    }
                    else
                    {
                        ArrayList<Integer> ls=new ArrayList<Integer>();
                        ls.add(num[i]);
                        ls.add(num[j]);
                        ls.add(num[front]);
                        ls.add(num[end]);
                        res.add(ls);
                        while(front<end && num[front]==ls.get(2))
                        {
                            front+=1;
                        }
                        
                        while(front<end && num[end]==ls.get(3))
                        {
                            end-=1;
                        }
                    }
                    
                }
                
                while(j+1<n && num[j+1]==num[j])
                {
                    j+=1;
                }
                
            }
            
            while(i+1<n && num[i+1]==num[i])
            {
                i+=1;
            }
            
        }
        return res;
    }
    
    public static void main(String[] args)
    {
        int[] num={4,3,3,4,4,2,1,2,1,1};
        int target=9;
        List<List<Integer>> ans=foursum(num,target);
        
        for(int i=0;i<ans.size();i++)
        {
            for(int j=0;j<ans.get(i).size();j++)
            {
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println("");
        }
    }
}