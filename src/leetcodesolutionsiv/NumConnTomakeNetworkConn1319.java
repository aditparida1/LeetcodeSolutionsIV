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
public class NumConnTomakeNetworkConn1319
{
    public int makeConnected(int n, int[][] connections) 
    {
        Map<Integer, Set<Integer>> graph = getGraph(connections);
        int connectedComponent = 0;
        int extraConnections = 0;
        Set<Integer> visited = new HashSet<>();
        for(int i = 0; i < n; ++i)
        {
            if(!visited.contains(i))
            {
                Queue<Integer> q = new LinkedList<>();
                visited.add(i);
                q.add(i);
                connectedComponent++;
                Map<Integer, Set<Integer>> map = new HashMap<>();
                while(!q.isEmpty())
                {
                    int curr = q.poll();
                    Set<Integer> neighbors = graph.get(curr);
                    if(neighbors == null)
                        continue;
                    for(int neigh: neighbors)
                    {
                        if(!visited.contains(neigh))
                        {
                            visited.add(neigh);
                            q.offer(neigh);
                            int min = Math.min(curr, neigh);
                            int max = Math.max(curr, neigh);
                            if(!map.containsKey(min))
                            {
                                extraConnections++;
                                map.put(min, new HashSet<>());
                                map.get(min).add(max);
                            }
                        }
                        else
                        {
                            int min = Math.min(curr, neigh);
                            int max = Math.max(curr, neigh);
                            if(!map.containsKey(min))
                            {
                                extraConnections++;
                                map.put(min, new HashSet<>());
                                map.get(min).add(max);
                            }
                            else
                            {
                                if(!map.get(min).contains(max))
                                {
                                    extraConnections++;
                                    map.get(min).add(max);
                                }
                            }
                            
                        }
                    }
                }
            }
        }
        if(connectedComponent - 1 > extraConnections)
            return -1;
        return connectedComponent - 1;
    }
    private Map<Integer, Set<Integer>> getGraph(int[][] connections)
    {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for(int[] conn : connections)
        {
            if(!graph.containsKey(conn[0]))
            {
                graph.put(conn[0], new HashSet<>());
            }
            if(!graph.containsKey(conn[1]))
            {
                graph.put(conn[1], new HashSet<>());
            }
            graph.get(conn[0]).add(conn[1]);
            graph.get(conn[1]).add(conn[0]);
        }
        return graph;
    }
}
