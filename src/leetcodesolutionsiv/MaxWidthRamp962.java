/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolutionsiv;
import java.util.*;
/**
 *
 * @author aditp
 */
public class MaxWidthRamp962
{
    public int maxWidthRamp(int[] ip) 
    {
        int result = 0;
        Integer[] arr = new Integer[ip.length];
        for (int i = 0; i < ip.length; i++)
        {
            arr[i] = i;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(ip[a], ip[b]));
        int minSofar = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if(minSofar == -1)
            {
                minSofar = arr[i];
            }
            else
            {
                if(arr[i] > arr[minSofar])
                {
                    result = Math.max(result, arr[i] - arr[minSofar]);
                }
                else
                {
                    minSofar = arr[i];
                }
            }
        }
        return result;
    }
}
