
package leetcodesolutionsiv;
import java.util.*;
/**
 *
 * @author aditp
 */
public class PourWater755
{
    public int[] pourWater(int[] heights, int V, int K) 
    {
        while(V > 0)
        {
            boolean isPoss = false;
            int curr = heights[K];
            int idx = K;
            for (int i = K; i >= 0; i--)
            {
                if(curr < heights[i])
                {
                    break;
                }
                if(curr > heights[i])
                {
                    curr = heights[i];
                    idx = i;
                    isPoss = true;
                }
            }
            if(isPoss)
            {
                heights[idx]++;
                V--;
                continue;
            }
            curr = heights[K];
            idx= K;
            for (int i = K; i < heights.length; i++)
            {
                if(curr < heights[i])
                {
                    break;
                }
                if(curr > heights[i])
                {
                    curr = heights[i];
                    idx = i;
                    isPoss = true;
                }
            }
            if(isPoss)
            {
                heights[idx]++;
                V--;
                continue;
            }
            heights[K]++;
            V--;
        }
        return heights;
    }
    
    
    
}
