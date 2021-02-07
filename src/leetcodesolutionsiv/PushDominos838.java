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
public class PushDominos838
{
    public String pushDominoes(String dominoes) 
    {
        if(dominoes == null || dominoes.trim().isEmpty())
        {
            return "";
        }
        int[] dp = new int[dominoes.length()];
        for (int i = 0; i < dominoes.length(); i++)
        {
            if(dominoes.charAt(i) == '.')
            {
                dp[i] = 0;
            }
            else if(dominoes.charAt(i) == 'L')
            {
                dp[i] = -1;
            }
            else
            {
                dp[i] = 1;
            }
        }
        int lastSeenOneIdx = -1;
        for (int i = 0; i < dp.length; i++)
        {
            if(dp[i] == -1)
            {
                if(lastSeenOneIdx == -1)
                {
                    for(int j = i - 1; j >= 0; --j)
                    {
                        if(dp[j] == -1)
                            break;
                        dp[j] = -1;
                    }
                }
                else
                {
                    int len = i - lastSeenOneIdx + 1;
                    int toChange = len/2;
                    for(int j = 0; j < toChange; ++j)
                    {
                        dp[i - j] = -1;
                    }
                    if(len %2 != 0)
                    {
                        dp[i - toChange] = 0;
                    }
                    lastSeenOneIdx = -1;
                }
            }
            else if(dp[i] == 1)
            {
                lastSeenOneIdx = i;
            }
            else
            {
                if(lastSeenOneIdx != -1)
                {
                    dp[i] = 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dp.length; i++)
        {
            if(dp[i] == 0)
            {
                sb.append('.');
            }
            else if(dp[i] == 1)
            {
                sb.append('R');
            }
            else
            {
                sb.append("L");
            }
        }
        return sb.toString();
    }
}
