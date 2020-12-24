/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolutionsiv;

/**
 *
 * @author aditp
 */
public class SearchSortedArrayUnknownSize702
{
    public int search(ArrayReader reader, int target) 
    {
        final int NOT_FOUND = 2147483647;
        int lastIdx = getLastIndex(reader, NOT_FOUND);
        
        return binarySearch(reader, lastIdx, target);
    }
    //length of the array;
    //binarysearch for the target;
    public int getLastIndex(ArrayReader reader, final int NOT_FOUND)
    {
        int low = 0;
        int high = 10000;
        while(low < high)
        {
            int mid = low + high;
            mid /= 2;
            int res = reader.get(mid);
            if(res == NOT_FOUND)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
    }
    private int binarySearch(ArrayReader reader, int lastIdx, int target)
    {
        int low = 0; int high = lastIdx;
        
        while(low <= high)
        {
            int mid = (low + high) / 2;
            int midVal = reader.get(mid);
            if(midVal == target)
            {
                return mid;
            }
            else if(target > midVal)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        
        return -1;
    }
    
}

interface ArrayReader
{
    public int get(int index);
}
