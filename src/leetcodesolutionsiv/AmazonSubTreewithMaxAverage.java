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
public class AmazonSubTreewithMaxAverage
{
    static double max = Integer.MIN_VALUE;
    public static int subtreeMaxAvg(NAryNode root) 
    {
        traverse(root);
        return (int)max;
    }
    static int[] traverse(NAryNode root)
    {
        
        NAryNode[] children = root.children;
        int[] res = new int[]{root.val, 1};
        for (int i = 0; i < children.length; i++)
        {
            int[] sub = traverse(children[i]);
            res[0] += sub[0];
            res[1] += sub[1];
        }
        double avg = ((double)res[0] / res[1]);
        max = Math.max(avg, max);
        return res;
    }
}
class NAryNode {
        int val;
        NAryNode[] children;

        public NAryNode(int val, NAryNode[] children) {
            this.val = val;
            this.children = children;
        }
}