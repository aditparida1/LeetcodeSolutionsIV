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
public class MostProfitAssigningWork826
{
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) 
    {
        ProfitDifficultyHolder[] holder = new ProfitDifficultyHolder[difficulty.length];
        for (int i = 0; i < holder.length; i++)
        {
            holder[i] = new ProfitDifficultyHolder(profit[i], difficulty[i]);
        }
        Arrays.sort(holder, new Comparator<ProfitDifficultyHolder>(){
            @Override
            public int compare(ProfitDifficultyHolder o1, ProfitDifficultyHolder o2)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(o1.difficulty < o2.difficulty)
                {
                    return -1;
                }
                return 1;
            }
            
        });
        int[] maxProfitCache = new int[holder.length];
        for (int i = 0; i < maxProfitCache.length; i++)
        {
            if(i == 0)
                maxProfitCache[i] = holder[i].profit;
            else
            {
                maxProfitCache[i] = Math.max(maxProfitCache[i - 1], holder[i].profit);
            }
        }
        int res = 0;
        for (int i = 0; i < worker.length; i++)
        {
            int desiredDiff = worker[i] + 1;
            int target = binarySearch(desiredDiff, holder) - 1;
            if(target < 0)
                continue;
            res += maxProfitCache[target];
        }
        return res;
    }
    public int binarySearch(int key, ProfitDifficultyHolder[] input)
    {
        int low = 0; int high = input.length - 1;
        while(low <= high)
        {
            int mid = low + high;
            mid/=2;
            if(key <= input[mid].difficulty)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
    }
    
}
class ProfitDifficultyHolder
{
    int profit;
    int difficulty;
    public ProfitDifficultyHolder(int profit, int difficulty)
    {
        this.difficulty = difficulty;
        this.profit = profit;
    }
}