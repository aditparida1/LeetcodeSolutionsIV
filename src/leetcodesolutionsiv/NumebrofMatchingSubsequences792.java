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
public class NumebrofMatchingSubsequences792
{
    public int numMatchingSubseq(String input, String[] words) 
    {
        int result = 0;
        HashMap<Character, List<String>> map = new HashMap<>();
        for(String word: words)
        {
            char start = word.charAt(0);
            if(!map.containsKey(start))
            {
                map.put(start, new ArrayList<>());
            }
            map.get(start).add(word);
        }
        for (int i = 0; i < input.length(); i++)
        {
            char currChar = input.charAt(i);
            if(map.containsKey(currChar))
            {
                List<String> temp = map.get(currChar);
                map.remove(currChar);
                int count = getCountsAndUpdate(temp, map);
                result += count;
            }
        }
        return result;
    }
    private int getCountsAndUpdate(List<String> words, HashMap<Character, List<String>> map)
    {
        int count = 0;
        
        for(String currWord: words)
        {
            if(currWord.length() == 1)
            {
                count++;
            }
            else
            {
                String subString = currWord.substring(1, currWord.length());
                char currChar = subString.charAt(0);
                if(!map.containsKey(currChar))
                {
                    map.put(currChar, new ArrayList<>());
                }
                map.get(currChar).add(subString);
            }
        }
        
        return count;
    }
}
