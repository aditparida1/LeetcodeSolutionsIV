
package leetcodesolutionsiv;
import java.util.*;

public class PallindromfromSubstring1177
{
    //there is a better solution
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) 
    {
        List<Boolean> result = new ArrayList<>();
        
        for(int[] query: queries)
        {
            int start = query[0];
            int end = query[1];
            //String subInput = s.substring(start, end + 1);
            Map<Character, Integer> map = getMap(s, start, end);
            int count = 0;
            for(char key: map.keySet())
            {
                if(map.get(key) % 2 != 0)
                {
                    count++;
                }
            }
            count /= 2;
            if(count <= query[2])
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        
        return result;
    }
    private Map<Character, Integer> getMap(String input, int start, int end)
    {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = start; i <= end; i++)
        {
            if(!map.containsKey(input.charAt(i)))
            {
                map.put(input.charAt(i), 0);
            }
            map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
        }
        return map;
    }
}
