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
public class LongestStringChain1048
{
    public int longestStrChain(String[] words) 
    {
        TreeMap<Integer, Set<String>> map = new TreeMap<>();
        HashMap<String, Integer> dp = new HashMap<>();
        int globalMax = 0;
        for (int i = 0; i < words.length; i++)
        {
            if(!map.containsKey(words[i].length()))
            {
                map.put(words[i].length(), new HashSet<>());
            }
            map.get(words[i].length()).add(words[i]);
        }
        
        for(int key: map.keySet())
        {
            if(!map.containsKey(key - 1))
            {
                for(String ip: map.get(key))
                {
                    dp.put(ip, 1);
                    globalMax = Math.max(globalMax, 1);
                }
            }
            else
            {
                Set<String> predset = map.get(key - 1);
                Set<String> succset = map.get(key);
                for(String succ: succset)
                {
                    int max = 0;
                    for(String pred: predset)
                    {
                        if(isOneAdded(pred, succ))
                        {
                            max = Math.max(max, dp.get(pred) + 1);
                        }
                    }
                    dp.put(succ, max);
                    globalMax = Math.max(max, globalMax);
                }
            }
        }
        
        
        return globalMax;
    }
    private boolean isOneAdded(String pred, String succ)
    {
        int i = 0;
        int j = 0;
        while(i < pred.length() && j < succ.length())
        {
            if(pred.charAt(i) == succ.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
                if(j - i > 1)
                    return false;
            }
        }
        return true;
    }
}
