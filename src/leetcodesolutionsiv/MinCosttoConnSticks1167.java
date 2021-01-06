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
public class MinCosttoConnSticks1167
{
    public int connectSticks(int[] sticks) 
    {
        int res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < sticks.length; i++)
        {
            pq.add(sticks[i]);
        }
        while(pq.size() > 1)
        {
            int a = pq.poll();
            int b = pq.poll();
            res += a + b;
            pq.add(a + b);
        }
        return res;
    }
}
