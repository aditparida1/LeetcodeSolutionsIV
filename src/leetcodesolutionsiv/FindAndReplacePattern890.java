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
public class FindAndReplacePattern890
{
    public List<String> findAndReplacePattern(String[] words, String pattern) 
    {
        List<String> matching = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
        {
            if(isMatching(words[i], pattern))
                matching.add(words[i]);
        }
        return matching;
    }
    private boolean isMatching(String ip, String pattern)
    {
        Map<Character, Character> map = new HashMap<>();
        int min = Math.min(pattern.length(), ip.length());
        for (int i = 0; i < min; i++)
        {
            Character currChar = ip.charAt(i);
            Character patt = pattern.charAt(1);
            if(!map.containsKey(currChar))
            {
                map.put(currChar, patt);
            }
            else
            {
                if(map.get(currChar) != patt)
                    return false;
            }
        }
        return true;
    }
}
