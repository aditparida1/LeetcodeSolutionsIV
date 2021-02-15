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
public class SumofSubArrayMinimums907
{
    public int sumSubarrayMins(int[] arr) 
    {
        long sum = 0;
        int[] subMin = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            subMin[i] = arr[i];
            sum += subMin[i];
        }
        for (int size = 2; size <= arr.length; size++)
        {
            for (int i = 0; i <= arr.length - size; i++)
            {
                int j = i + size - 1;
                subMin[i] = Math.min(subMin[i], arr[j]);
                sum += subMin[i];
            }
        }
        
        return (int)(sum % 1000000007);
    }
}
