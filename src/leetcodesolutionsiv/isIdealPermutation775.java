
package leetcodesolutionsiv;
import java.util.*;

public class isIdealPermutation775
{
    int global = 0;
    int local = 0;
    HashMap<Integer, Integer> map;
    public boolean isIdealPermutation(int[] A) 
    {
        global = 0;
        local = 0;
        int[] ip = A;
        map = new HashMap<>();
        for (int i = 0; i < A.length; i++)
        {
            map.put(ip[i], i);
        }
        for (int i = 0; i < ip.length - 1; i++)
        {
            if(ip[i] > ip[i + 1])
            {
                local++;
            }
        }
        mergeSort(ip, 0, ip.length - 1);
        return global == local;
    }
    public void mergeSort(int[] ip, int left, int right)
    {
        if(left < right)
        {
            int mid = left + right;
            mid /= 2;
            mergeSort(ip, left, mid);
            mergeSort(ip, mid + 1, right);
            merge(ip, left, right, mid);
        }
    }

    private void merge(int[] ip, int left, int right, int mid)
    {
        int low = left;
        int high = mid + 1;
        
        int[] res = new int[right - left + 1];
        int idx = 0;
        while(low <= mid && high <= right)
        {
            if(ip[low] > ip[high])
            {
                res[idx] = ip[high];
                
                
                    global+= mid - low + 1;
                
                high++;
            }
            else if(ip[low] < ip[high])
            {
                res[idx] = ip[low];
                low++;
            }
            idx++;
        }
        while(low <= mid)
        {
            res[idx] = ip[low];
            low++;
            idx++;
        }
        while(high <= right)
        {
            res[idx] = ip[high];
            high++;
            idx++;
        }
        for (int i = 0; i < res.length; i++)
        {
            ip[left+i] = res[i];
        }
    }
}
