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
public class PartitionDisjoint915
{
    public int partitionDisjoint(int[] ip) 
    {
        int res = 0;
        
        int[] leftBiggest = new int[ip.length];
        int[] rightSmallest = new int[ip.length];
        
        for (int i = 0; i < leftBiggest.length; i++)
        {
            if( i == 0)
            {
                leftBiggest[i] = ip[i];
                rightSmallest[rightSmallest.length - i - 1] = ip[ip.length - i - 1];
            }
            else
            {
                leftBiggest[i] = Math.max(leftBiggest[i - 1], ip[i]);
                rightSmallest[i] = Math.min(rightSmallest[i + 1], ip[i]);
            }
        }
        for (int i = 0; i < ip.length - 1; i++)
        {
            if(leftBiggest[i] <= rightSmallest[i + 1])
            {
                res = i + 1;
                break;
            }
        }
        return res;
    }
}
