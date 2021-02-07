
package leetcodesolutionsiv;
import java.util.*;

public class FriendsofAppAges825
{
    public int numFriendRequests(int[] ages) 
    {
        int counts = 0;        
        Map<Integer, Integer> firstIdx = new HashMap<>();        
        Map<Integer, Integer> lastIdx = new HashMap<>();        
        Arrays.sort(ages);
        
        for (int i = 0; i < ages.length; i++)
        {
            if(!firstIdx.containsKey(ages[i]))
            {
                firstIdx.put(ages[i], i);
            }
            lastIdx.put(ages[i], i);
        }
        
        for (int i = 0; i < ages.length; i++)
        {
            int currAge = ages[i];
            int target = ages[i] / 2 + 8;
            if(target < currAge)
            {
                int targetIdx = binSearch(target, ages);
                int firstIndex = firstIdx.get(currAge);
                int lastIndex = lastIdx.get(currAge);
                counts += firstIndex - targetIdx;
                counts += lastIndex - firstIndex;
            }
            
        }
        
        return counts;
    }
    int binSearch(int key, int[] input)
    {
        int left = 0; int right = input.length - 1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(key <= input[mid])
            {
                right = mid - 1;
            }
            else if(key > input[mid])
            {
                left = mid + 1;
            }
        }
        return left;
    }
}
