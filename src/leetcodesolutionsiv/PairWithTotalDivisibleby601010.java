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
public class PairWithTotalDivisibleby601010
{
    public int numPairsDivisibleBy60(int[] time) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 60; i++)
        {
            map.put(i, 0);
        }
        for (int i = 0; i < time.length; i++)
        {
            int rem = time[i] % 60;
            map.put(rem, map.get(rem) + 1);
        }
        int res = 0;
        for (int i = 1; i <= 29; i++)
        {
            int setb = map.get(60 - i);
            int seta = map.get(i);
            res += seta * setb;
        }
        int set0x30 = map.get(0);
        if(set0x30 >= 2)
        {
            res += fact(set0x30) /(2 * fact(set0x30 - 2));
        }
        set0x30 = map.get(30);
        if(set0x30 >= 2)
        {
            res += fact(set0x30) /(2 * fact(set0x30 - 2));
        }
        return res;
    }

    private int fact(int i)
    {
        if( i <= 1)
            return 1;
        return i * fact(i - 1);
    }
    public int numPairsDivisibleBy60II(int[] time) {
        int remainders[] = new int[60];
        int count = 0;
        for (int t: time) {
            if (t % 60 == 0) { // check if a%60==0 && b%60==0
                count += remainders[0];
            } else { // check if a%60+b%60==60
                count += remainders[60 - t % 60];
            }
            remainders[t % 60]++; // remember to update the remainders
        }
        return count;
    }
}
