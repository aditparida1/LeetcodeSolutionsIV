/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolutionsiv;

import java.util.Arrays;

/**
 *
 * @author aditp
 */
public class BoatstoSavePeople881
{
    public int numRescueBoats(int[] people, int limit) 
    {
        int result = 0;
        int left = 0; int right = people.length - 1;
        Arrays.sort(people);
        while(left <= right)
        {
            if(people[left] + people[right] <= limit)
            {
                left++;
                right--;
            }
            else
            {
                right--;
            }
            result++;
        }
        return result;
    }
}
