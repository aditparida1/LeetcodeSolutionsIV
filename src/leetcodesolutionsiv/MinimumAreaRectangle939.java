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
public class MinimumAreaRectangle939
{
    public int minAreaRect(int[][] points) 
    {
        int result = Integer.MAX_VALUE;
        HashMap<Integer, List<int[]>> xMap = new HashMap<>();
        HashMap<Integer, List<int[]>> yMap = new HashMap<>();
        
        for (int[] point: points)
        {
            if(!xMap.containsKey(point[0]))
            {
                xMap.put(point[0], new ArrayList<>());
            }
            if(!yMap.containsKey(point[1]))
            {
                yMap.put(point[1], new ArrayList<>());
            }
            xMap.get(point[0]).add(point);
            yMap.get(point[1]).add(point);
        }
        
        return result;
    }  
}
