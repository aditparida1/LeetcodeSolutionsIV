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
    public long getMaxProfit(int supplierCount, int[] inventory, int orders)
    {
        int mod = 1000000007;
        Arrays.sort(inventory);
        int curIndex = inventory.length - 1;
        int curValue = inventory[curIndex];
        long profit = 0;
        while (orders > 0) {
            while (curIndex >= 0 && inventory[curIndex] == curValue) {
                curIndex--;
            }
            // if all colors of balls are the same value, nextValue is 0
            int nextValue = curIndex < 0 ? 0 : inventory[curIndex];
            // number of colors of balls with same value 
            int numSameColor = inventory.length - 1 - curIndex;
            // number of items to buy
            int nums = (curValue - nextValue) * numSameColor;
            if (orders >= nums) {
                // buy all items
                profit += (long)(curValue + nextValue + 1) * (curValue - nextValue) / 2 * numSameColor;
            } else {
			    // orders left is less than the number of items to buy
                int numFullRow = orders / numSameColor;
                int remainder = orders % numSameColor;
                profit += (long)(curValue + curValue - numFullRow + 1) * numFullRow / 2 * numSameColor;
                profit += (long)(curValue - numFullRow) * remainder;
            }
            orders -= nums;
            profit = profit % mod;
            curValue = nextValue;
        }
        return (int)profit;
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

/*
public static long supplierInventory(int numSupplier, long [] inventory, long order){
        Map<Long,Long> map = new HashMap<>();
        long highest=0;
        long profit = 0;
        for(int i=0;i<inventory.length;i++){
            map.put(inventory[i],map.getOrDefault(inventory[i],0L)+1);
            if(highest<inventory[i])
                highest = inventory[i];
        }
        
        while(order>0 && !map.isEmpty()){
            long highestFreq = map.get(highest);
            if(order>highestFreq){
                profit += highestFreq*highest;
                order -= highestFreq;
                map.remove(highest);
                if(map.containsKey(highest-1)){
                    long curr = map.get(highest-1);
                    map.put(highest-1,map.get(highest-1)+highestFreq);
                }else
                    map.put(highest-1,highestFreq);
            
                highest--;
            }else{
                profit += highest*order;
                order=0;
            }
        }
        
        return profit;
    }
*/
