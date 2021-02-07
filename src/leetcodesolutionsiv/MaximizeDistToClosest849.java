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
public class MaximizeDistToClosest849
{
    public int maxDistToClosest(int[] seats) 
    {
        int max = -1;
        int lastSeen = -1;
        
        for (int i = 0; i < seats.length; i++)
        {
            if(seats[i] == 1)
            {
                if(lastSeen == -1)
                {
                    max = Math.max(max, i);
                }
                else
                {
                    int dist = i - lastSeen;
                    max = Math.max(max, dist / 2);
                }
                lastSeen = i;
            }
        }
        max = Math.max(seats.length - lastSeen - 1, max);
        return max;
        
    }
}
