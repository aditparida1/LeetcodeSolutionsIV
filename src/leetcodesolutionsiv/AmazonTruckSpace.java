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
public class AmazonTruckSpace
{
    public Pair getPair(int numOfPackages, int truckSpace, List<Integer> packageSpace)
    {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        int target = truckSpace - 30;
        for(int i = 0; i < packageSpace.size(); ++i)
        {
            if(!map.containsKey(packageSpace.get(i)))
            {
                map.put(packageSpace.get(i), new ArrayList<>());
                map.get(packageSpace.get(i)).add(i);
            }
            else
            {
                map.get(packageSpace.get(i)).add(i);
            }
        }
        Pair pair = null;
        for(int key: map.keySet())
        {
            if(map.containsKey(target - key))
            {
                int firstNum = map.get(key).get(0);
                List<Integer> temp = map.get(target - key);
                int secondNum = -1;
                for(int idx : temp)
                {
                    if(idx != firstNum)
                    {
                        secondNum = idx;
                        break;
                    }
                }
                if(secondNum != -1)
                {
                    pair = new Pair(firstNum, secondNum);
                }
            }
        }
        if(pair == null)
            pair = new Pair(-1, -1); 
        return pair;
    }
    public static void main(String[] args)
    {
        int[] pack = new int[]{1,10,25,35,60,60};
        List<Integer> packageSpace = new ArrayList<>();
        for (int i = 0; i < pack.length; i++)
        {
            packageSpace.add(pack[i]);
        }
        var pair = new AmazonTruckSpace().getPair(6, 150, packageSpace);
        System.out.println("" + pair.first + "\t" + pair.second);
    }
}
class Pair
{
    int first;
    int second;
    Pair(){}
    public Pair(int a, int b)
    {
        this.first = a;
        this.second = b;
    }
}