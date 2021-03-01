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
public class MinCostTick983
{
    public int mincostTickets(int[] days, int[] costs) 
    {
        int[] res = new int[365];
        Set<Integer> set = new HashSet<>();
        for(int i: days)
        {
            set.add(i - 1);
        }
        for(int i = 364; i >= 0; --i)
        {
            if(set.contains(i))
            {
                int oneDay = costs[0];
                if(i + 1 <= 364)
                {
                    oneDay += res[i + 1];
                }
                int sevenDay = costs[1];
                int nextDay = i + 7;
                if(nextDay <= 364)
                {
                    sevenDay += res[nextDay];
                }
                int thDay = costs[2];
                nextDay = i + 30;
                if(nextDay <= 364)
                {
                    thDay += res[nextDay];
                }
                res[i] = Math.min(Math.min(oneDay, sevenDay), thDay);
            }
            else
            {
                if(i == 364)
                {
                    res[i] = 0;
                }
                else
                {
                    res[i] = res[i + 1];
                }
            }
        }
        return res[0];
    }
}
