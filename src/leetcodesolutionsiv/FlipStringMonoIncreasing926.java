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
public class FlipStringMonoIncreasing926
{
    public int minFlipsMonoIncr(String S) 
    {
        int numOf1 = 0; int numOf0 = 0;
        Holder[] hold = new Holder[S.length()];
        for (int i = 0; i < S.length(); i++)
        {
            if(S.charAt(i) == '0')
                numOf0++;
            else
                numOf1++;
            hold[i] = new Holder(numOf0, numOf1);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < hold.length; i++)
        {
            int leftNumof1 = hold[i].numOf1;
            int rightNumof0 = hold[hold.length - 1].numOf0 - hold[i].numOf0;
            min = Math.min(min, leftNumof1 + rightNumof0);
        }
        min = Math.min(min, hold[hold.length - 1].numOf0);
        return min;
    }
}
class Holder
{
    int numOf1;
    int numOf0;
    Holder(int numof0, int numOf1)
    {
        this.numOf0 = numof0;
        this.numOf1 = numOf1;
    }
}
