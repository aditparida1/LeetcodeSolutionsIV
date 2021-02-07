/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolutionsiv;

/**
 *
 * @author aditp
 */
public class SmallestSubTreeWithDeepestNodes865
{
    //TreeNode singleNdoe = null;
    TreeNode doubleNode = null;
    public TreeNode subtreeWithAllDeepest(TreeNode root) 
    {
        //singleNdoe = null;
        doubleNode = null;
        int height = getHeight(root);
        traverse(root, 1, height);
        return doubleNode;
    }
    private int getHeight(TreeNode current)
    {
        if(current == null)
            return 0;
        int left = getHeight(current.left);
        int right = getHeight(current.right);
        return Math.max(right , left) + 1;
    }
    private boolean traverse(TreeNode current, int level, int maxLvl)
    {
        if(current == null)
            return false;
        if(level == maxLvl)
        {
            if(doubleNode == null)
                doubleNode = current;
            return true;
        }
            
        
        boolean left = traverse(current.left, level + 1, maxLvl);
        
        boolean right = traverse(current.right, level + 1, maxLvl);
        
        if(left && right)
            doubleNode = current;
        return left || right;
    }
}
