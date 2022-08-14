import java.util.*;
class Item
{
    int value;
    int weight;
    Item(int value,int weight)
    {
        this.value=value;
        this.weight=weight;
    }
}

class mycomparator implements Comparator<Item>
{

    @Override
    public int compare(Item o1, Item o2) {
        double r1=(double)(o1.value)/(double)(o1.weight);
        double r2=(double)(o2.value)/(double)(o2.weight);
        if(r1<r2)
            return 1;
        else if(r1>r2)
            return -1;
        else
            return -1;
        
    }
    
}

class Solution
{
    public void knapsack(int w,Item[] item,int n)
    {
        mycomparator mc=new mycomparator();
        Arrays.sort(item, mc);
        int currweight=0;
        double totalval=0.0;
        for(int i=0;i<n;i++)
        {
            if(currweight+item[i].weight<=w)
            {
                currweight+=item[i].weight;
                totalval+=item[i].value;
            }
            else
            {
                int remain=w-currweight;
                totalval+=(double)(item[i].value)/(double)(item[i].weight)*(double)remain;
            }
        }
        System.out.println("Total Value in knapsack: "+totalval);
    }
    
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int n=3;
        int w=50;
        Item[] item={new Item(100,20),new Item(60,10),new Item(120,30)};
        sol.knapsack(w, item, n);
    }
}