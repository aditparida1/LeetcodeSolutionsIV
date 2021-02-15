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
public class WordSubSets916
{
    public List<String> wordSubsets(String[] A, String[] B) 
    {
        Map<Character, Integer>[] map = new HashMap[A.length]; 
        for (int i = 0; i < A.length; i++)
        {
            map[i] = new HashMap<>();
            for (int j = 0; j < A[i].length(); j++)
            {
                if(!map[i].containsKey(A[i].charAt(j)))
                {
                    map[i].put(A[i].charAt(j), 1);
                }
                else
                {
                    map[i].put(A[i].charAt(j), map[i].get(A[i].charAt(j)) + 1);
                }
            }
        }
        Map<Character, Integer>[] toCheck = new HashMap[B.length];
        for (int i = 0; i < B.length; i++)
        {
            toCheck[i] = getMap(B[i]);
        }
        Map<Character, Integer> check = new HashMap<>();
        for (int i = 0; i < toCheck.length; i++)
        {
            for(char key: toCheck[i].keySet())
            {
                if(!check.containsKey(key))
                {
                    check.put(key, toCheck[i].get(key));
                }
                else
                {
                    check.put(key, Math.max(check.get(key), toCheck[i].get(key)));
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < map.length; i++)
        {
            boolean isTrue = true;
            for(char key: check.keySet())
            {
                if(!map[i].containsKey(key) || map[i].get(key) < check.get(key))
                {
                    isTrue = false;
                    break;
                }
            }
            if(isTrue)
            {
                result.add(A[i]);
            }
        }
        return result;
    }
    private Map<Character, Integer> getMap(String ip)
    {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ip.length(); i++)
        {
            if(!map.containsKey(ip.charAt(i)))
            {
                map.put(ip.charAt(i), 1);
            }
            else 
            {
                map.put(ip.charAt(i), map.get(ip.charAt(i)) + 1);
            }
        }
        return map;
    }
}
