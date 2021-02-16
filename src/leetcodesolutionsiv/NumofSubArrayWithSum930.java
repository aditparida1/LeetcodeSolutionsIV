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
public class NumofSubArrayWithSum930
{
    public int numSubarraysWithSum(int[] ip, int target) 
    {
        int sum = 0;
        int count = 0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < ip.length; i++)
        {
            sum += ip[i];
            if(target == sum)
                count++;
            if(map.containsKey(sum - target))
            {
                count += map.get(sum - target).size();
            }
            if(!map.containsKey(sum))
            {
                map.put(sum, new ArrayList<>());
            }
            map.get(sum).add(i);
        }
        return count;
    }
}
