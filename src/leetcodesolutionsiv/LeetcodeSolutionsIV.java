
package leetcodesolutionsiv;
import java.util.*;

public class LeetcodeSolutionsIV
{
    public static void main(String[] args)
    {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        var obj = new CBTTreeInserter919(root);
        System.out.println(obj.insert(3));
        System.out.println(obj.insert(4));
        System.out.println(obj.insert(5));
        System.out.println(obj.insert(6));
    }
    
}
