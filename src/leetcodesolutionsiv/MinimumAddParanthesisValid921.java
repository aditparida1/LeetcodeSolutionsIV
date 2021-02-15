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
public class MinimumAddParanthesisValid921
{
    public int minAddToMakeValid(String ip) 
    {
        int result = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < ip.length(); i++)
        {
            if(ip.charAt(i) == '(')
            {
                st.push(ip.charAt(i));
            }
            else
            {
                if(st.isEmpty())
                {
                    result++;
                }
                else
                {
                    st.pop();
                }
            }
        }
        result += st.size();
        return result;
    }
}
