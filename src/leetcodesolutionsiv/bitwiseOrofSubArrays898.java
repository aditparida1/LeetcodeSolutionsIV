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
public class bitwiseOrofSubArrays898
{
    //mem limit exceeds
    public int subarrayBitwiseORsII(int[] arr) 
    {
        int result = 0;
        Set<Integer> set  = new HashSet<>();
        int[][] dp = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            dp[i][i] = arr[i];
            if(!set.contains(arr[i]))
            {
                result++;
                set.add(arr[i]);
            }
        }
        for (int size = 2; size <= arr.length; size++)
        {
            for (int i = 0; i <= arr.length - size; i++)
            {
                int j = i + size - 1;
                int res = arr[j] | dp[i][j - 1];
                if(!set.contains(res))
                {
                    set.add(res);
                    result++;
                }
            }
        }
        return result;
    }
    public int subarrayBitwiseORsIII(int[] arr) 
    {
        int result = 0;
        Set<Integer> set  = new HashSet<>();
        Map<Integer, Integer>[] map = new HashMap[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            map[i] = new HashMap<>();
            map[i].put(1, arr[i]);
            if(!set.contains(arr[i]))
            {
                result++;
                set.add(arr[i]);
            }
        }
        for (int size = 2; size <= arr.length; size++)
        {
            for (int i = 0; i <= arr.length - size; i++)
            {
                int j = i + size - 1;
                int res = map[i].get(size - 1) | arr[j];
                map[i].put(size, res);
                if(!set.contains(res))
                {
                    set.add(res);
                    result++;
                }
            }
        }
        return result;
    }
    public int subarrayBitwiseORs(int[] arr) 
    {
        int result = 0;
        Set<Integer> set  = new HashSet<>();
        int[] dp = new int[arr.length];
        for(int i = 0; i < dp.length; ++i)
        {
            if(!set.contains(arr[i]))
            {
                result++;
                set.add(arr[i]);
                
            }
            dp[i] = arr[i];
        }
        for (int size = 2; size <= arr.length; size++)
        {
            for (int i = 0; i <= arr.length - size; i++)
            {
                int j = i + size - 1;
                int res = dp[i] | arr[j];
                if(!set.contains(res))
                {
                    set.add(res);
                    result++;
                }
                dp[i] = res;
            }
        }
        return result;
    }
}
