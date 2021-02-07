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

public class ScoreofParanthesis856
{
    public int scoreOfParentheses(String ip) 
    {
        if(ip == null || ip.length() == 0)
            return 0;
        int result = 0;
        Stack<String> st = new Stack<>();
        for(int i = 0; i < ip.length(); ++i)
        {
            String sub = ip.substring(i, i+1);
            if(sub.equals("("))
            {
                st.push(sub);
                
            }
            else
            {
                int intermediate = 0;
                while(!st.isEmpty())
                {
                    String popped = st.pop();
                    if(!popped.equals("("))
                    {
                        intermediate += Integer.parseInt(popped);
                    }
                    else
                    {
                        break;
                    }
                }
                if(intermediate == 0)
                {
                    st.push("1");
                }
                else
                {
                    st.push(Integer.toString(intermediate * 2));
                }
            }
        }
        while(!st.isEmpty())
        {
            result += Integer.parseInt(st.pop());
        }
        return result;
    }
}
