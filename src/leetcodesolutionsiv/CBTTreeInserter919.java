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
public class CBTTreeInserter919
{
    TreeNode root;
    List<TreeNode> lastLevel;
    List<TreeNode> currLevel;
    int lastLevelIndex = -1;
    public CBTTreeInserter919(TreeNode root)
    {
        this.root = root;
        int levels = root == null ? 0 : this.getHeight(root);
        if(levels != 0)
        {
            lastLevel = new ArrayList<>();
            currLevel = new ArrayList<>();
            
            if(levels == 1)
            {
                lastLevel.add(root);
                lastLevelIndex = 0;
                
            }
            else
            {
                fillLevels(root, 1, levels);
                lastLevelIndex = (currLevel.size() - 1) / 2;
                if((currLevel.size()) % 2 == 0)
                    lastLevelIndex++;
                if(lastLevel.size() * 2 == currLevel.size())
                {
                    lastLevel = currLevel;
                    lastLevelIndex = 0;
                    currLevel = new ArrayList<>();
                }
            }
        }
    }
    public void fillLevels(TreeNode root, int currLeveli, int levels)
    {
        if(root == null)
            return;
        if(currLeveli == levels)
        {
            currLevel.add(root);
            return;
        }
        if(currLeveli == levels - 1)
        {
            lastLevel.add(root);
        }
        fillLevels(root.left, currLeveli + 1, levels);
        fillLevels(root.right, currLeveli + 1, levels);
    }
    public int getHeight(TreeNode root)
    {
        int count = 0;
        while(root != null)
        {
            root = root.left;
            count++;
        }
        return count;
    }
    public int insert(int v) 
    {
        if(root == null)
        {
            root = new TreeNode(v);
            lastLevel = new ArrayList<>();
            currLevel = new ArrayList<>();
            lastLevel.add(root);
            lastLevelIndex = 0;
            return 0;
        }
        else
        {
            TreeNode temp = lastLevel.get(lastLevelIndex);
            if(temp.left == null)
            {
                temp.left = new TreeNode(v);
                currLevel.add(temp.left);
                return temp.val;
                
            }
            else
            {
                temp.right = new TreeNode(v);
                currLevel.add(temp.right);
                lastLevelIndex++;
                if(lastLevelIndex >= lastLevel.size())
                {
                    lastLevel = currLevel;
                    currLevel = new ArrayList<>();
                    lastLevelIndex = 0;
                }
                return temp.val;
            }
        }
    }
    
    public TreeNode get_root() 
    {
        return root;
    }
}
