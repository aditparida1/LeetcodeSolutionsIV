
package leetcodesolutionsiv;
import java.util.*;

public class isIdealPermutation775
{
    public boolean isIdealPermutation(int[] A) 
    {
        int[] ip = A;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++)
        {
            map.put(ip[i], i);
        }
        return true;
    }
}
