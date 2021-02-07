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
public class FindEventualSafeStates802
{
    public List<Integer> eventualSafeNodes(int[][] graph) 
    {
        List<Integer> result = new ArrayList<>();
        int[] visited = new int[graph.length];
        
        for (int i = 0; i < graph.length; i++)
        {
            if(visited[i] == 0)
            {
                visited[i] = 1;
                boolean possible = isPossible(graph, i, visited);
                if(possible)
                {
                    visited[i] = 2;
                }
                else
                {
                    visited[i] = 1;
                 }
            }
        }
        for (int i = 0; i < visited.length; i++)
        {
            if(visited[i] == 2)
            {
                result.add(i);
            }
        }
        return result;
    }
    private boolean isPossible(int[][] graph, int curr, int[] visited)
    {
        for(int neigh: graph[curr])
        {
            if(visited[neigh] == 2)
                continue;
            if(visited[neigh] == 1)
                return false;
            visited[neigh] = 1;
            boolean possible = isPossible(graph, neigh, visited);
            if(!possible)
                return false;
            visited[neigh] = 2;
        }
        return true;
    }
}
