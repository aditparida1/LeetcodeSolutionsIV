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
public class FruitIntoBasket904
{
    public int totalFruit(int[] tree) 
    {
        if(tree == null || tree.length == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int left = 0; int right = 0;
        while(right < tree.length)
        {
            if(!map.containsKey(tree[right]))
            {
                map.put(tree[right], 1);
            }
            else
            {
                map.put(tree[right], map.get(tree[right]) + 1);
            }
            
            if(map.size() > 2)
            {
                int len = right - left;
                max = Math.max(max, len);
                while(left < right && map.size() > 2)
                {
                    map.put(tree[left], map.get(tree[left]) - 1);
                    if(map.get(tree[left]) == 0)
                    {
                        map.remove(tree[left]);
                    }
                    left++;
                }
            }
            right++;
        }
        return max;
    }
}
