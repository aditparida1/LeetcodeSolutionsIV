
package leetcodesolutionsiv;
import java.util.*;
/**
 *
 * @author aditp
 */
public class BurstBaloons312
{
    public int maxCoins(int[] nums) 
    {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> listIndices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
        {
            listIndices.add(i);
        }
        
        return solve(listIndices, nums, map);
    }
    private int solve(List<Integer> listIndices, int[] nums, Map<String, Integer> map)
    {
        if(listIndices.size() == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        
        
        String key = createKey(listIndices);
        if(map.containsKey(key))
        {
            return map.get(key);
        }
        for(int i = 0; i <  listIndices.size(); ++i)
        {
            int currIdx = listIndices.get(i);
            int nextIdx = -1;
            int prevIdx = -1;
            if(i != 0)
            {
                prevIdx = listIndices.get(i - 1);
                
            }
            if(i < listIndices.size() - 1)
            {
                nextIdx = listIndices.get(i + 1);
            }
            int currVal = nums[currIdx];
            int nextVal = 1;
            int prevVal = 1;
            if(prevIdx != -1)
            {
                prevVal = nums[prevIdx];
            }
            if(nextIdx != -1)
            {
                nextVal = nums[nextIdx];
            }
            listIndices.remove(i);
            int res = currVal * prevVal * nextVal + solve(listIndices, nums, map);
            max = Math.max(res, max);
            listIndices.add(i, currIdx);
        }
        map.put(key, max);
        return max;
    }
    private String createKey(List<Integer> input)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.size(); i++)
        {
            sb.append(input.get(i));
            sb.append("#");
        }
        return sb.toString();
    }
}
