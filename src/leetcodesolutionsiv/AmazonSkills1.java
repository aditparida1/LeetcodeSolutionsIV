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
public class AmazonSkills1
{
    public int findNumofCombinations(int[] skills, int minAssociates, int minLvl, int maxLvl)
    {
        long total = 0;
        Arrays.sort(skills);
        int leftBound = binSearch(minLvl,skills);
        int rightBound = binSearch(maxLvl + 1, skills);
        int len = rightBound - leftBound;
        for(int i = minAssociates; i <= len; ++i)
        {
            total += ncr(len, i);
        }
        return (int)total;
    }
    long ncr(long n, long r)
    {
        return fact(n)/(fact(r) * fact(n - r));
    }
    int binSearch(int key, int[] input)
    {
        int left = 0; int right = input.length - 1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(key <= input[mid])
            {
                right = mid - 1;
            }
            else if(key > input[mid])
            {
                left = mid + 1;
            }
        }
        return left;
    }
    long fact(long n)
    {
        if(n <= 1)
            return 1;
        return fact(n-1) * n;
    }
}
