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
public class BagofTokens948
{
    public int bagOfTokensScore(int[] tokens, int power) 
    {
        int max = 0;
        int score = 0;
        Arrays.sort(tokens);
        int left = 0; int right = tokens.length - 1;
        
        while(left <= right)
        {
            if(power >= tokens[left])
            {
                power -= tokens[left];
                score++;
                left++;
                max = Math.max(max, score);
            }
            else
            {
                if(score > 0)
                {
                    power += tokens[right];
                    right--;
                    score--;
                    max = Math.max(max, score);
                }
                else
                {
                    break;
                }
            }
        }
        
        
        return max;
    }
}
