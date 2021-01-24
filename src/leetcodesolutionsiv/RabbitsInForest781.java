
package leetcodesolutionsiv;
import java.util.*;

public class RabbitsInForest781
{
    public int numRabbits(int[] answers) 
    {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < answers.length; i++)
        {
            if(map.containsKey(answers[i]))
            {
                map.put(answers[i], map.get(answers[i]) + 1);
            }
            else
            {
                map.put(answers[i], 1);
            }
        }
        for(int key: map.keySet())
        {
            int freq = map.get(key);
            while(freq > 0)
            {
                res += key + 1;
                freq = freq - key - 1;
            }
        }
        return res;        
    }
}
