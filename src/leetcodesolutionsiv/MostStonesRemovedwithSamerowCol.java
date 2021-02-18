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
public class MostStonesRemovedwithSamerowCol
{
    public int removeStones(int[][] stones) 
    {
        int max = 0;
        GNode[] nodes = new GNode[stones.length];
        int idx = 0;
        for(int[] node: stones)
        {
            nodes[idx] = new GNode(node[0], node[1]);
            idx++;
        }
        Map<GNode, Set<GNode>> graph = new HashMap<>();
        for(int i = 0; i < nodes.length; ++i)
        {
            if(!graph.containsKey(nodes[i]))
                graph.put(nodes[i], new HashSet<>());
            for(int j = i + 1; j < nodes.length; ++j)
            {
                if(!graph.containsKey(nodes[j]))
                    graph.put(nodes[j], new HashSet<>());
                if(nodes[i].x == nodes[j].x || nodes[i].y == nodes[j].y)
                {
                    graph.get(nodes[i]).add(nodes[j]);
                    graph.get(nodes[j]).add(nodes[i]);
                }
            }
        }
        Set<GNode> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < nodes.length; i++)
        {
            if(!set.contains(nodes[i]))
            {
                set.add(nodes[i]);
                dfs(set, nodes[i], graph);
                count++;
            }
        }
        
        return stones.length - count;
    }
    private void dfs(Set<GNode> visited, GNode currNode, Map<GNode, Set<GNode>> graph)
    {
        Set<GNode> neighs = graph.get(currNode);
        for(GNode neigh: neighs)
        {
            if(!visited.contains(neigh))
            {
                visited.add(neigh);
                dfs(visited, neigh, graph);
            }
        }
    }
}
class GNode
{
    int x; int y;
    GNode(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
