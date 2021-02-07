
package leetcodesolutionsiv;
import java.util.*;

public class BinaryTreePruning814
{
    public TreeNode pruneTree(TreeNode root) 
    {
        traverseUpdate(root);
        
        return cullTraverse(root);
    }
    private boolean traverseUpdate(TreeNode node)
    {
        if(node == null)
            return false;
        boolean left = traverseUpdate(node.left);
        boolean right = traverseUpdate(node.right);
        if(node.val == 0)
        {
            boolean res = left || right;
            if(!res)
            {
                node.val = -1;
                return false;
            }
        }
        return true;
    }
    private TreeNode cullTraverse(TreeNode node)
    {
        if(node == null || node.val == -1)
        {
            return null;
        }
        node.left = cullTraverse(node.left);
        node.right = cullTraverse(node.right);
        return node;
    }
}
