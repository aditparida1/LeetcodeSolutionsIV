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
public class DAilyTemp739
{
    public int[] dailyTemperatures(int[] T) 
    {
        int[] res = new int[T.length];
        int i = 0;
        Stack<Integer> st = new Stack<>();
        while(i < T.length)
        {
            if(st.size() == 0)
            {
                st.push(i);
            }
            else
            {
                while(!st.isEmpty() && T[st.peek()] < T[i])
                {
                    int j = st.pop();
                    res[j] = i - j;
                }
                st.push(i);
            }
            
            i++;
        }
        return res;
    }
}
