/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolutionsiv;
import java.util.*;
/**
 *
 * @author aditp
 */
public class AmazonSuplierProductMaxProfit
{
    public long getMaxProfit(int supplierCount, List<Integer> inventory, int order)
    {
        long result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inventory.size(); i++)
        {
            if(!map.containsKey(inventory.get(i)))
            {
                map.put(inventory.get(i), 1);
            }
            else
            {
                map.put(inventory.get(i),inventory.get(i)+ 1);
            }
        }
        
        PriorityQueue<Holder> pq = new PriorityQueue<>();
        for(int key: map.keySet())
        {
            pq.add(new Holder(key, map.get(key)));
        }
        
        while(order > 0)
        {
            Holder max = pq.poll();
            if(order <= max.freq)
            {
                order = 0;
                result += order * max.num;
            }
            else
            {
                Holder secondmax = new Holder(0,0);
                if(pq.size() != 0)
                {
                     secondmax = pq.poll();
                }
                
                int k = 0;
                int maxrounds = max.num - secondmax.num;
                while(k <= maxrounds && k * max.freq <= order)
                    k++;
                if(k * max.freq > order || k > maxrounds)
                {
                    k--;
                }
                result += sum(max.num, k) * max.freq;
                order -= k * max.freq;
                if(max.num - k == secondmax.num)
                {
                    secondmax.freq += max.freq;
                    pq.add(secondmax);
                }
                else
                {
                    max.num -= k;
                    pq.add(max);
                }
            }
        }
        
        return result;
    }
    public long sum(int num, int rounds)
    {
        double sum = (rounds / 2.0)*(num + num - rounds + 1);
        return (long)sum;
    }
}
class Holder implements Comparable<Holder>
{
    int num;
    int freq;
    Holder(int num, int freq)
    {
        this.num = num;
        this.freq = freq;
    }
    public int compareTo(Holder o)
    {
        if(this.num < o.num)
            return 1;
        else
            return -1;
    }
}
