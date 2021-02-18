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
public class FlipEquivalentBinTree951
{
    public boolean flipEquiv(TreeNode root1, TreeNode root2) 
    {
        return traverseFlip(root1, root2);
    }
    private boolean traverseFlip(TreeNode root1, TreeNode root2)
    {
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        if(root1.val != root2.val)
            return false;
        boolean noChangeLeft = traverseFlip(root1.left, root2.left);
        boolean noChangeRight = traverseFlip(root1.right, root2.right);
        boolean changeLeft = traverseFlip(root1.left, root2.right);
        boolean changeRight = traverseFlip(root1.right, root2.left);
        
        return (noChangeLeft && noChangeRight) || (changeLeft && changeRight);
    }
}
