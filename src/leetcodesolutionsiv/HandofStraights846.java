
package leetcodesolutionsiv;
import java.util.*;
/**
 *
 * @author aditp
 */
public class HandofStraights846
{
    public boolean isNStraightHand(int[] hand, int W) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < hand.length; i++)
        {
            if(map.containsKey(hand[i]))
            {
                map.put(hand[i] , map.get(hand[i]) + 1);
            }
            else
            {
                map.put(hand[i], 1);
            }
        }
        PriorityQueue<Holder> pq =  new PriorityQueue<>(new Comparator<>()
        {
            @Override
            public int compare(Holder o1, Holder o2)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return Integer.compare(o1.num, o2.num);
            }
        });
        for(int key: map.keySet())
        {
            Holder h = new Holder(key, map.get(key));
            pq.add(h);
        }
        while(!pq.isEmpty())
        {
            HashSet<Holder> set = new HashSet<>();
            int currNum = -1;
            for (int i = 0; i < W; i++)
            {
                if(pq.isEmpty())
                    return false;
                Holder curr = pq.poll();
                if(currNum == -1)
                {
                    currNum = curr.num;
                    curr.freq -= 1;
                    set.add(curr);
                }
                else
                {
                    if(curr.num != currNum + 1)
                    {
                        return false;
                    }
                    else
                    {
                        curr.freq -= 1;
                        currNum = curr.num;
                        set.add(curr);
                    }
                }
            }
            for(Holder curr: set)
            {
                if(curr.freq != 0)
                {
                    pq.add(curr);
                }
            }
            currNum = -1;
        }
        return true;
    }
}
class Holder
{
    int num;
    int freq;
    public Holder(int num, int freq)
    {
        this.num = num;
        this.freq = freq;
    }
}
