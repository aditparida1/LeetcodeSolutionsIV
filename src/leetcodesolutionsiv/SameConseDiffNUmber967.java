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
public class SameConseDiffNUmber967
{
    public int[] numsSameConsecDiff(int n, int k) 
    {
        int[] res = null;
        Set<String> set = new HashSet<>();
        
        for (int i = 1; i < 10; i++)
        {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toString(i));
            traverse(sb, n, k, set);
        }
        res = new int[set.size()];
        int i = 0;
        for(String ip: set)
        {
            res[i] = Integer.parseInt(ip);
            i++;
        }
        return res;
    }
    
    private void traverse(StringBuilder sb, int n, int k, Set<String> res)
    {
        if(n == sb.length())
        {
            res.add(sb.toString());
            return;
        }
        int lastAdded = Integer.parseInt(Character.toString(sb.charAt(sb.length() - 1)));
        if(lastAdded + k <= 9)
        {
            sb.append(Integer.toString(lastAdded + k));
            traverse(sb, n, k, res);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(lastAdded - k >= 0)
        {
            sb.append(Integer.toString(lastAdded - k));
            traverse(sb, n, k, res);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    
}
