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
public class ShortestBridge934
{
    public int shortestBridge(int[][] ip) 
    {
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < ip.length; i++)
        {
            boolean found = false;
            for(int j = 0; j < ip[0].length; ++j)
            {
                if(ip[i][j] == 1)
                {
                    q.add(new int[]{i, j});
                    ip[i][j] = -1;
                    found = true;
                    break;
                }
            }
            if(found)
                break;
        }
        int[][] dirs = new int[][]{{1,0},{-1,0}, {0,1}, {0, -1}};
        Queue<int[]> q2 = new LinkedList<>();
        while(!q.isEmpty())
        {
            int[] curr = q.poll();
            for(int[] dir: dirs)
            {
                int newi = curr[0] + dir[0];
                int newj = curr[1] + dir[1];
                if(isValid(ip, newi, newj) && ip[newi][newj] != -1)
                {
                    if(ip[newi][newj] == 0)
                    {
                        q2.add(new int[]{newi, newj});
                    }
                    else
                    {
                        q.add(new int[]{newi, newj});
                    }
                    ip[newi][newj] = -1;
                }
            }
        }
        
        int level = 1;
        
        while(!q2.isEmpty())
        {
            int size = q2.size();
            while(size > 0)
            {
                int[] curr = q2.poll();
                for(int[] dir : dirs)
                {
                    int newi = curr[0] + dir[0];
                    int newj = curr[1] + dir[1];
                    if(isValid(ip, newi, newj) && ip[newi][newj] != -1)
                    {
                        if(ip[newi][newj] == 0)
                        {
                            ip[newi][newj] = -1;
                            q2.offer(new int[]{newi, newj});
                        }
                        else
                        {
                            return level;
                        }
                    }
                }
                size--;
            }
            level++;
        }
        
        
        return level - 1;
    }
    
    private boolean isValid(int[][] ip, int i, int j)
    {
        if(i < 0 || j < 0 || i >= ip.length || j >= ip[0].length)
            return false;
        return true;
    }
}
