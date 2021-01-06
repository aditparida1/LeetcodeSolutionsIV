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
public class WordBreak139
{
    Boolean[] dp;
    public boolean wordBreak(String s, List<String> wordDict) 
    {
        dp = new Boolean[s.length()];
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < wordDict.size(); i++)
        {
            set.add(wordDict.get(i));
        }
        return isPossible(s, set, 0);
    }
    private boolean isPossible(String s, HashSet<String> set, int currIdx)
    {
        if(currIdx >= s.length())
        {
            return true;
        }
        if(dp[currIdx] != null)
            return dp[currIdx];
        int start = currIdx;
        
        for (int i = currIdx + 1; i <= s.length(); i++)
        {
            String subString = s.substring(currIdx, i);
            if(set.contains(subString))
            {
                boolean isPoss = isPossible(s, set, i);
                if(isPoss)
                {
                    dp[currIdx] = true;
                    return isPoss;
                }
            }
        }
        dp[currIdx] = false;
        return false;
    }
}
