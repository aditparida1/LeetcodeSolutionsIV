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
public class AsteroidCollision735
{
    public int[] asteroidCollision(int[] asteroids) 
    {
        int[] res;
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < asteroids.length; ++i)
        {
            pushToStack(asteroids[i], st);
        }
        res = new int[st.size()];
        int i = 0;
        while(!st.isEmpty())
        {
            res[i] = st.pop();
            i++;
        }
        int left = 0;
        int right = res.length - 1;
        while(left < right)
        {
            int temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left ++;
            right--;
        }
        return res;
    }
    private void pushToStack(int val, Stack<Integer> st)
    {
        boolean isValDestroyed = false;
        while(!st.isEmpty())
        {
            if(val >= 0)
            {
                break;
            }
            else
            {
                if(st.peek() < 0)
                {
                    break;
                }
                else
                {
                    if(st.peek() > Math.abs(val))
                    {
                        isValDestroyed = true;
                        break;
                    }
                    else if(st.peek() == Math.abs(val))
                    {
                        isValDestroyed = true;
                        st.pop();
                        break;
                    }
                    else
                    {
                        st.pop();
                    }
                }
            }
        }
        if(!isValDestroyed)
        {
            st.push(val);
        }
    }
}
