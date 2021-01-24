
package leetcodesolutionsiv;
import java.util.*;

public class ClosestLeafNode742
{
    public int findClosestLeaf(TreeNode root, int k) 
    {
        Map<Integer, List<Integer>> map = new HashMap<>();
        HashSet<Integer> leavesSet = new HashSet<>();
        convertToGraph(root, map, leavesSet);
        
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        visited.add(k);
        q.add(k);
        while(!q.isEmpty())
        {
            
            int curr = q.poll();
            if(leavesSet.contains(curr))
                return curr;
            List<Integer> neighs = map.get(curr);
            for(int neigh: neighs)
            {
                if(!visited.contains(neigh))
                {
                    visited.add(neigh);
                    q.add(neigh);
                }
            }
        }
        
        
        return 0;
    }
    private void convertToGraph(TreeNode root, Map<Integer, List<Integer>> map, HashSet<Integer> leavesSet)
    {
        if(root == null)
            return;
        if(!map.containsKey(root.val))
        {
            map.put(root.val, new ArrayList<>());
            if(root.left != null)
            {
                map.get(root.val).add(root.left.val);
                if(!map.containsKey(root.left.val))
                    map.put(root.left.val, new ArrayList<>());
                map.get(root.left.val).add(root.val);
            }
            if(root.right != null)
            {
                map.get(root.val).add(root.right.val);
                if(!map.containsKey(root.right.val))
                    map.put(root.right.val, new ArrayList<>());
                map.get(root.right.val).add(root.val);
            }
        }
        else
        {
            if(root.left != null)
            {
                map.get(root.val).add(root.left.val);
                if(!map.containsKey(root.left.val))
                    map.put(root.left.val, new ArrayList<>());
                map.get(root.left.val).add(root.val);
            }
            if(root.right != null)
            {
                map.get(root.val).add(root.right.val);
                if(!map.containsKey(root.right.val))
                    map.put(root.right.val, new ArrayList<>());
                map.get(root.right.val).add(root.val);
            }
        }
        if(root.left == null && root.right == null)
        {
            leavesSet.add(root.val);
        }
        convertToGraph(root.left, map, leavesSet);
        convertToGraph(root.right, map, leavesSet);
    }
}
