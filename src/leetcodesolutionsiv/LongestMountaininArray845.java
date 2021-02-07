
package leetcodesolutionsiv;
import java.util.*;

public class LongestMountaininArray845
{
    public int longestMountain(int[] arr) 
    {
        if(arr == null || arr.length < 3)
            return 0;
        int max = 0;
        int left = 0;
        int right = 0;
        boolean isMountain = false;
        while(left < arr.length && right < arr.length)
        {
            while(right + 1 < arr.length && arr[right + 1] > arr[right])
            {
                right ++;
            }
            if(left == right)
            {
                left++;
                right++;
                continue;
            }
            int mid = right;
            while(right + 1 < arr.length && arr[right + 1] < arr[right])
            {
                right++;
                isMountain = true;
            }
            if(isMountain == false)
            {
                left = right;
                //right = left;
            }
            else
            {
                max = Math.max(max, right - left + 1);
                left = right;
                //right = left;
            }
            isMountain = false;
        }
        return max;
    }
}
