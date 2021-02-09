/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolutionsiv;

import java.util.Arrays;

/**
 *
 * @author aditp
 */
public class KokoBanana875
{
    public int minEatingSpeed(int[] piles, int H) 
    {
        int result = 0;
        double avg = 0;
        int avgA = 0;
        for(int i = 0; i < piles.length; ++i)
        {
            avg += piles[i];
        }
        Arrays.sort(piles);
        avg /= H;
        if(avg > (int) avg)
        {
            avgA = (int) avg + 1;
        }
        else
        {
            avgA = (int) avg;
        }
        result = binarySearch(avgA, piles[piles.length - 1], piles, H);
        return result;
    }
    private int binarySearch(int left, int right, int[] numArr, int maxTime)
    {
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(isPossible(numArr, maxTime, mid))
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean isPossible(int[] num, int maxTime, int speed)
    {
        int count = 0;
        for (int i = 0; i < num.length; i++)
        {
            if(speed > num[i])
            {
                count++;
            }
            else
            {
                count += num[i] / speed;
                if(num[i] % speed != 0)
                    count++;
            }
            if(count > maxTime)
                return false;
        }
        return true;
    }
}
