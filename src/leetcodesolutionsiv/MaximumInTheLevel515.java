
package leetcodesolutionsiv;
import java.util.*;

public class MaximumInTheLevel515
{
    public List<Integer> largestValues(TreeNode root) 
    {
        List<Integer> solution = new ArrayList<>();
        traverse(root, 0, solution);
        return solution;
    }
    private void traverse(TreeNode root, int level, List<Integer> ls)
    {
        if(root == null)
            return;
        if(level > ls.size() - 1)
        {
            ls.add(root.val);
        }
        else if(ls.get(level) < root.val)
        {
            ls.set(level, root.val);
        }
        traverse(root.left, level + 1, ls);
        traverse(root.right, level + 1, ls);
    }
}
