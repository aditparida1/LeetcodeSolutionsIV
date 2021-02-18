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
public class LargestTimeGivenDigits949
{
    String result = "";
    public String largestTimeFromDigits(int[] arr) 
    {
        result = "";
        permute(arr, 0);
        return result;
    }
    private void permute(int[] arr, int currIdx)
    {
        if(currIdx >= arr.length)
        {
            StringBuilder hr = new StringBuilder();
            hr.append(Integer.toString(arr[0]));
            hr.append(Integer.toString(arr[1]));
            if(!isValidHr(hr.toString()))
            {
                return;
            }
            StringBuilder mn = new StringBuilder();
            mn.append(Integer.toString(arr[2]));
            mn.append(Integer.toString(arr[3]));
            if(!isValidMn(mn.toString()))
                return;
            hr.append(":").append(mn);
            if(result.isEmpty())
            {
                result = hr.toString();
                return;
            }
            if(isGreater(hr.toString(), result))
            {
                result = hr.toString();
            }
            
            return;
        }
        
        for(int i = currIdx; i < arr.length; ++i)
        {
            swap(arr, currIdx, i);
            permute(arr, currIdx + 1);
            swap(arr, currIdx, i);
        }
        
    }
    private boolean isGreater(String first, String second)
    {
        String[] fSplit = first.split(":");
        String[] sSplit = second.split(":");
        
        if(Integer.parseInt(fSplit[0]) > Integer.parseInt(sSplit[0]))
            return  true;
        else if(Integer.parseInt(fSplit[0]) < Integer.parseInt(sSplit[0]))
            return false;
        if(Integer.parseInt(fSplit[1]) < Integer.parseInt(sSplit[1]))
            return false;
        else if(Integer.parseInt(fSplit[1]) > Integer.parseInt(sSplit[1]))
            return true;
        
        return true;
    }
    private boolean isValidMn(String mn)
    {
        if(Integer.parseInt(mn) >= 0 && Integer.parseInt(mn) <= 59)
            return true;
        return false;
    }
    private boolean isValidHr(String hr)
    {
        if(Integer.parseInt(hr) >= 0 && Integer.parseInt(hr) <= 23)
            return true;
        return false;
    }
    private void swap(int[] arr, int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
