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
public class SubArraySumDivisiblebyK974
{
    public int subarraysDivByK(int[] ip, int k) 
    {
        int res = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ip.length; i++)
        {
            sum += ip[i];
            if(sum % k == 0)
                res++;
            int mod = sum % k;
            if(mod < 0)
                mod += k;
            if(!map.containsKey(mod))
            {
                map.put(mod, 0);
            }
            res += map.get(mod);
            map.put(mod, map.get(mod) + 1);
        }
        return res;
    }
}
