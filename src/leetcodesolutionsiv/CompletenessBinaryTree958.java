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
public class CompletenessBinaryTree958
{
    boolean lastLvlNulled = false;
    public boolean isCompleteTree(TreeNode root) 
    {
        lastLvlNulled = false;
        return traverse(root, 1, height(root));
    }
    private int height(TreeNode node)
    {
        if(node == null)
            return 0;
        int left = height(node.left);
        int right = height(node.right);
        
        return Math.max(left, right) + 1;
    }
    private boolean traverse(TreeNode root, int currLevel, int maxLevel)
    {
        if(currLevel == maxLevel)
        {
            if(lastLvlNulled && root != null)
                return false;
            if(root == null)
                lastLvlNulled = true;
            return true;
        }
        else
        {
            if(root == null)
                return false;
            boolean left = traverse(root.left, currLevel + 1, maxLevel);
            if(!left)
                return false;
            boolean right = traverse(root.right, currLevel + 1, maxLevel);
            if(!right)
                return false;
            return true;
        }
    }
}
