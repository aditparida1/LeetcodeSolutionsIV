
package leetcodesolutionsiv;
import java.util.*;
public class EbayMakeDistinct
{
    public long getResult(int[] nums)
    {
        long result = 0;
        int max = -1;
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++)
        {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }
        
        for (int i = min; i <= max; i++)
        {
            if(map.containsKey(i))
            {
                int numberOfChange = map.get(i) - 1;
                for(int j = 1; j <= numberOfChange; ++j)
                {
                    result += j;
                    if(map.containsKey(i + j))
                    {
                        map.put(i + j, map.get(i + j) + 1);
                    }
                    else
                    {
                        map.put(i + j, 1);
                    }
                    max = Math.max(max, i + j);
                }
            }
        }
        
        return result;
    }
}
