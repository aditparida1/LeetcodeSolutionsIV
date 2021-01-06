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
public class ReorgString767
{
    public String reorganizeString(String S) 
    {
        if(S == null || S.length() == 0)
        {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        var s = S;
        Map<Character, Holder> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.get(s.charAt(i)).count++;
            }
            else
            {
                map.put(s.charAt(i), new Holder(s.charAt(i), 1));
            }
        }
        PriorityQueue<Holder> pq = new PriorityQueue<>(new Comparator<Holder>() {
            @Override
            public int compare(Holder o1, Holder o2)
            {
                return -1 * Integer.compare(o1.count, o2.count);
            }
        });
        for (char c: map.keySet())
        {
            Holder h = map.get(c);
            pq.offer(h);
        }
        if(pq.peek().count > (s.length() + 1)/2)
        {
            return "";
        }
        while(!pq.isEmpty())
        {
//            PriorityQueue<Holder> temp = new PriorityQueue<>(new Comparator<Holder>() {
//            @Override
//            public int compare(Holder o1, Holder o2)
//            {
//                return -1 * Integer.compare(o1.count, o2.count);
//            }
//        });
//            while(!pq.isEmpty())
//            {
//                Holder h = pq.poll();
//                sb.append(h.c);
//                h.count --;
//                if(h.count > 0)
//                {
//                    temp.offer(h);
//                }
//            }
//            pq = temp;
            Holder h1 = pq.poll();
            Holder h2 = null;
            if(pq.size() > 0)
            {
                h2 = pq.poll();
            }
            sb.append(h1.c);
            h1.count--;
            if(h1.count > 0)
            {
                pq.offer(h1);
            }
            if(h2 != null)
            {
                sb.append(h2.c);
                h2.count--;
                if(h2.count > 0)
                {
                    pq.offer(h2);
                }
            }
            
        }
        return sb.toString();
    }
}

class Holder
{
    char c;
    int count;
    Holder(char c, int count)
    {
        this.c = c;
        this.count = count;
    }
}
