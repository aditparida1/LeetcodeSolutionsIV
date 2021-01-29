
package leetcodesolutionsiv;
import java.util.*;

public class AllPathsFromSourcetoTarget797
{
    public List<List<Integer>> allPathsSourceTarget(int[][] graph)
    {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < graph.length; ++i)
        {
            map.put(i, new ArrayList<>());
            for(int j = 0; j < graph[i].length; ++j)
            {
                map.get(i).add(graph[i][j]);
            }
        }
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfsTraverse(map, result, 0, graph.length - 1, path);
        return result;
    }
    private void dfsTraverse(Map<Integer, List<Integer>> map, List<List<Integer>> result, int curr, int dest, List<Integer> path)
    {
        if(curr == dest)
        {
            //add the path to the final list
            List<Integer> validPath = new ArrayList<>(path);
            result.add(validPath);
            return;
        }
        
        List<Integer> neighs = map.get(curr);
        for(int neigh: neighs)
        {
            path.add(neigh);
            dfsTraverse(map, result, neigh, dest, path);
            path.remove(path.size() - 1);
        }
    }
}
