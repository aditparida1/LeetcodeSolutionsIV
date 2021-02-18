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
public class ArrayofDoubledpairs954
{
    public boolean canReorderDoubled(int[] arr) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr)
        {
            if(!map.containsKey(i))
            {
                map.put(i, 0);
            }
            map.put(i, map.get(i) + 1);
        }
        int count = 0;
        for(int key: map.keySet())
        {
            int next = key * 2;
            if(map.get(key) > 0 && map.containsKey(next) && map.get(next) > 0)
            {
                if(next == 0)
                {
                    count += (map.get(next) / 2);
                }
                else
                {
                    
                    count += Math.min(map.get(next), map.get(key));
                    int min = Math.min(map.get(next), map.get(key));
                    map.put(next, map.get(next) - min);
                    map.put(key, map.get(key) - min);
                }
            }
        }
        if(count < arr.length / 2)
            return false;
        return true;
    }
    public boolean permute(int[] arr, int index, Map<Integer, Integer> map)
    {
        if(index >= arr.length / 2)
            return true;
        
        for(int key: map.keySet())
        {
            if(map.get(key) > 0)
            {
                map.put(key, map.get(key) - 1);
                int next = 2 * key;
                if(map.containsKey(next) && map.get(next) > 0)
                {
                    map.put(next, map.get(next) - 1);
                    if(permute(arr, index + 1, map))
                        return true;
                map.put(next, map.get(next) + 1);
                }
                
                map.put(key, map.get(key) + 1);
            }
        }
        return false;
    }
}
