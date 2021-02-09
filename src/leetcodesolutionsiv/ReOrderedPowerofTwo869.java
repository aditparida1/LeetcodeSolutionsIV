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
public class ReOrderedPowerofTwo869
{
    public boolean reorderedPowerOf2(int N) 
    {
        String ip = Integer.toString(N);
        List<Character> ls = new ArrayList<>();
        for (int i = 0; i < ip.length(); i++)
        {
            ls.add(ip.charAt(i));
        }
        //Set<Character> set = new HashSet<>();
        
        return isPossible(ip, new StringBuilder(), ls);
    }
    private boolean isPossible(String ip, StringBuilder sb, List<Character> ls)
    {
        if(ls.size() == 0)
        {
            int target = Integer.parseInt(sb.toString());
            
            return isPowerof2(target);
        }
        for(int i = 0; i < ls.size(); ++i)
        {
            char temp = ls.get(i);
            if(sb.length() == 0 && temp == '0')
                continue;
            ls.remove(i);
            sb.append(temp);
            boolean isPoss = isPossible(ip, sb, ls);
            if(isPoss)
                return true;
            sb.deleteCharAt(sb.length() - 1);
            ls.add(i, temp);
        }
        return false;
    }
    private boolean isPowerof2(int num)
    {
        if((num != 0) && (num & (num - 1)) == 0)
            return true;
        return false;
    }
}
