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
public class CanVisitAllRooms841
{
    public boolean canVisitAllRooms(List<List<Integer>> rooms) 
    {
        if(rooms == null || rooms.size() == 0)
        {
            return true;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < rooms.size(); i++)
        {
            set.add(i);
        }
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(0);
        set.remove(0);
        while(!q.isEmpty())
        {
            int currRoom = q.poll();
            List<Integer> neighbors = rooms.get(currRoom);
            for(int neigh : neighbors)
            {
                if(set.contains(neigh))
                {
                    set.remove(neigh);
                    q.add(neigh);
                }
            }
            if(set.isEmpty())
                return true;
        }
        return false;
    }
}
