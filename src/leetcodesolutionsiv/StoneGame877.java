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
public class StoneGame877
{
    public boolean stoneGame(int[] piles) 
    {
        int[] sum = new int[piles.length];
        for (int i = 0; i < piles.length; i++)
        {
            if( i == 0)
                sum[i] = piles[i];
            else
                sum[i] = sum[i - 1] + piles[i];
        }
        int max = getMax(true, 0, piles.length - 1, sum, piles, new HashMap<>());
        if(max > sum[sum.length - 1] - max)
            return true;
        return false;
    }
    private int getMax(boolean isAlex, int left, int right, int[] sum, int[] piles, Map<String, Integer> map)
    {
        if(left == right)
            return piles[left];
        String key = left + "#"+ right;
        if(map.containsKey(key))
        {
            return map.get(key);
        }
        int leftTaken = 0;
        int rightTaken = 0;
        
        leftTaken = getMax(!isAlex, left + 1, right, sum, piles, map);
        rightTaken = getMax(!isAlex, left, right - 1, sum, piles, map);
        
        int myLeftSum = sum[right] - sum[left + 1] + piles[left + 1]  - leftTaken + piles[left];
        int myRightSum = sum[right - 1] - sum[left] + piles[left]  - rightTaken + piles[right];
        if(myLeftSum > leftTaken)
        {
            map.put(key, myLeftSum);
            return myLeftSum;
        }
        else if (myRightSum > rightTaken)
        {
            map.put(key, myRightSum);
            return myRightSum;
        }
        if(myLeftSum > myRightSum)
            map.put(key, myLeftSum);
        else
            map.put(key, myRightSum);
        return myLeftSum > myRightSum ? myLeftSum : myRightSum;
    }
}
