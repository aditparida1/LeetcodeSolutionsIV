
package leetcodesolutionsiv;
import java.util.*;

public class BinaryTreeWithFactors823
{
    public int numFactoredBinaryTrees(int[] arr) 
    {
        long count = 0;
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++)
        {
            set.add(arr[i]);
        }
        Map<Integer, Long> countMap = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++)
        {
            int curr = arr[i];
            long currCount = 1;
            double sqrt =  Math.sqrt(curr);
//            if(sqrt == (int)sqrt && set.contains(sqrt))
//            {
//                
//            }
            for(int j = 0; j < i; ++j)
            {
                if(curr % arr[j] == 0)
                {
                    int other = curr / arr[j];
                    if(set.contains(other))
                    {
                        currCount += countMap.get(other) * countMap.get(arr[j]);
                    }
                }
                
            }
            countMap.put(curr, currCount);
            count += currCount;
        }
        
        int res = (int)(count % (Math.pow(10, 9) + 7));
        return res;
    }
}
