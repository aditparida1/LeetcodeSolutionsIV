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
public class OpenLock752
{
    public int openLock(String[] deadends, String target) 
    {
        int result = 0;
        boolean isFound = false;
        Set<String> ends = new HashSet<>();
        for(String end: deadends)
        {
            ends.add(end);
        }
        Set<String> seen = new HashSet<>();
        if(ends.contains("0000"))
        {
            return -1;
        }
        Queue<String> q =  new LinkedList<>();
        q.offer("0000");
        seen.add("0000");
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size > 0)
            {
                String currentState = q.poll();
                if(currentState.equals(target))
                {
                    isFound = true;
                    break;
                }
                for (int i = 0; i < 4; i++)
                {
                    String nextStateUp = rotate(currentState, i, true);
                    String nextStepDown = rotate(currentState, i, false);
                    if(!seen.contains(nextStateUp) && !ends.contains(nextStateUp))
                    {
                        seen.add(nextStateUp);
                        q.offer(nextStateUp);
                    }
                    if(!seen.contains(nextStepDown) && !ends.contains(nextStepDown))
                    {
                        seen.add(nextStepDown);
                        q.offer(nextStepDown);
                    }
                }
                size--;
            }
            if(isFound)
            {
                break;
            }
            result++;
        }
        if(isFound)
        {
            return result;
        }
        return -1;
    }
    public String rotate(String ip, int index, boolean isUp)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(ip.substring(0, index));
        char c = ip.charAt(index);
        if(isUp)
        {
            if(c == '0')
            {
                c = '9';
            }
            else
            {
                c--;
            }
        }
        else
        {
            if(c == '9')
            {
                c = '0';
            }
            else
            {
                c++;
            }
        }
        sb.append(c);
        sb.append(ip.substring(index + 1));
        
        return sb.toString();
    }
}
