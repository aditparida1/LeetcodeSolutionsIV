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
public class PossibleBipartition886
{
    public boolean possibleBipartition(int N, int[][] dislikes) 
    {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 1; i <= N; i++)
        {
            map.put(i, new HashSet<>());
        }
        createGraph(dislikes, map);
        Set<Integer> red = new HashSet<>();
        Set<Integer> blue = new HashSet<>();
        for(int i = 1; i <= N; ++i)
        {
            if(!red.contains(i) && !blue.contains(i))
            {
                if(!bfs(i, map, red, blue))
                {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean bfs(int node, Map<Integer, Set<Integer>> map, Set<Integer> red, Set<Integer> blue)
    {
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(node);
        
        blue.add(node);
        boolean isBlue = true;
        while(q.isEmpty())
        {
            int curr = q.poll();
            if(blue.contains(curr))
                isBlue = true;
            else
                isBlue = false;
            Set<Integer> neighbors = map.get(curr);
            for(int neigh: neighbors)
            {
                if(isBlue && blue.contains(neigh))
                {
                    return false;
                }
                if(!isBlue && red.contains(neigh))
                {
                    return false;
                }
                if(isBlue && !red.contains(neigh))
                {
                    q.add(neigh);
                    red.add(neigh);
                }
                else if(!isBlue && !blue.contains(neigh))
                {
                    q.add(neigh);
                    blue.add(neigh);
                }
            }
        }
        return true;
    }
    private void createGraph(int[][] dislikes, Map<Integer, Set<Integer>> map)
    {
        
        for(int[] edges: dislikes)
        {
            if(map.containsKey(edges[0]))
            {
                map.get(edges[0]).add(edges[1]);
            }
            else
            {
                map.put(edges[0], new HashSet<>());
                map.get(edges[0]).add(edges[1]);
            }
            if(map.containsKey(edges[1]))
            {
                map.get(edges[1]).add(edges[0]);
            }
            else
            {
                map.put(edges[1], new HashSet<>());
                map.get(edges[1]).add(edges[0]);
            }
        }
    }
}
