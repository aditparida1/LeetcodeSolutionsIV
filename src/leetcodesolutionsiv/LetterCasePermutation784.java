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
public class LetterCasePermutation784
{
    public List<String> letterCasePermutation(String S) 
    {
        List<String> result = new ArrayList<>();
        permuteHelper(S, result, 0, new StringBuilder());
        return result;
    }
    private void permuteHelper(String ip, List<String> result, int index, StringBuilder sb)
    {
        if(index >= ip.length())
        {
            String candidate = sb.toString();
            result.add(candidate);
            return;
        }
        if(isAlpha(ip.charAt(index)))
        {
            char changedCase = changeCase(ip.charAt(index));
            sb.append(changedCase);
            permuteHelper(ip, result, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(ip.charAt(index));
        permuteHelper(ip, result, index + 1, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
    private boolean isAlpha(char c)
    {
        if(c >= 'A' && c <= 'Z')
            return true;
        if(c >= 'a' && c <= 'z')
            return true;
        return false;
    }
    private char changeCase(char c)
    {
        if(c >= 'A' && c <= 'Z')
            return (char)(c + 32);
        else
            return (char)(c - 32);
    }
}
