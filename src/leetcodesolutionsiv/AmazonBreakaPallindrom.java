/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolutionsiv;

/**
 *
 * @author aditp
 */
public class AmazonBreakaPallindrom
{
    public static String breakPallindrom(String input)
    {
        if(input.length() == 0 || input.length() == 1)
            return "";
        input = input.toLowerCase();
        int found = -1;
        for(int i = 0; i < input.length() / 2; ++i)
        {
            if(input.charAt(i) != 'a')
            {
                found = i;
                break;
            }
        }
        if(found == -1)
        {
            StringBuilder sb = new StringBuilder();
            sb.append(input.substring(0, input.length() - 1));
            sb.append('b');
            return sb.toString();
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(input.substring(0, found));
        sb.append('a');
        sb.append(input.substring(found + 1));
        return sb.toString();
    }
}
