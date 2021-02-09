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
public class AmazonMaxAvailDiskSpace
{
    public static int availableSpace(int numComputer, int[] hardDiskSpace, int segmentLength) 
    {
        
        int max = -1;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < segmentLength; ++i)
        {
            if(map.containsKey(hardDiskSpace[i]))
            {
                map.put(hardDiskSpace[i], map.get(hardDiskSpace[i]) + 1);
            }
            else
            {
                map.put(hardDiskSpace[i], 1);
            }
        }
        Math.max(max, map.firstKey()); 
        for(int i = 1; i <= hardDiskSpace.length - segmentLength; ++i)
        {
            int toRem = hardDiskSpace[i - 1];
            map.put(toRem, map.get(toRem) - 1);
            if(map.get(toRem) == 0)
                map.remove(toRem);
            int toAdd = hardDiskSpace[i + segmentLength - 1];
            if(map.containsKey(toAdd))
            {
                map.put(toAdd, map.get(toAdd) + 1);
            }
            else
            {
                map.put(toAdd, 1);
            }
            max = Math.max(max, map.firstKey());
        }
        return max;
    }
}
