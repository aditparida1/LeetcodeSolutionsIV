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
public class AmazonRemoveProds2
{
    public int getResultafterRemove(int[] input, int rem)
    {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> q = new PriorityQueue(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(map.get(o1) < map.get(o2))
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
            }
        });
        for (int i = 0; i < input.length; i++)
        {
            if(!map.containsKey(input[i]))
            {
                map.put(input[i], 1);
            }
            else
            {
                map.put(input[i], map.get(input[i]) + 1);
            }
        }
        for(int key: map.keySet())
        {
            q.add(key);
        }
        while(rem > 0 && q.size() > 1)
        {
            int removed = q.poll();
            map.put(removed, map.get(removed) - 1);
            if(map.get(removed) > 0)
            {
                q.add(removed);
            }
            rem--;
        }
        
        return q.size();
    }
}
