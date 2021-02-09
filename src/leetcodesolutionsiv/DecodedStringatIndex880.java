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
public class DecodedStringatIndex880
{
    public String decodeAtIndex(String ip, int pos) 
    {
        long[] resultBox = new long[ip.length()];
        long unicount = 0;
        for (int i = 0; i < ip.length(); i++)
        {
            if(isDigit(ip.charAt(i)))
                unicount *= Integer.parseInt(ip.substring(i, i + 1));
            else
            {
                unicount++;
                resultBox[i] = unicount;
            }
        }
        
        int requiredPos = ip.length() - 1;
        for (; requiredPos >= 0; requiredPos--)
        {
            if(resultBox[requiredPos] != 0)
            {
                if(pos % resultBox[requiredPos] == 0)
                    break;
            }
        }
        if(requiredPos >= 0)
            return ip.substring(requiredPos, requiredPos + 1);
        return "";
    }
    private boolean isDigit(char ip)
    {
        if(ip >= 48 && ip <= 57)
            return true;
        return false;
    }
}
