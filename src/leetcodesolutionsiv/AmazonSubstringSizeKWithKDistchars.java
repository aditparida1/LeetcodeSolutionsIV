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
public class AmazonSubstringSizeKWithKDistchars
{
    public static String[] subString(String s, int k)
    {
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i <= s.length() - k; ++i)
        {
            String sub = s.substring(i, i + k);
            if(!set.contains(sub))
            {
                if(isValid(sub))
                    set.add(sub);
            }
        }
        String[] res = new String[set.size()];
        int i = 0;
        for(String temp : set)
        {
            res[i] = temp;
            i++;
        }
        return res;        
    }
    private static boolean isValid(String ip)
    {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < ip.length(); ++i)
        {
            if(set.contains(ip.charAt(i)))
                return false;
            set.add(ip.charAt(i));
        }
        return true;
    }
}
