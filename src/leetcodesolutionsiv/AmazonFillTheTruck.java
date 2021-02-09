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
public class AmazonFillTheTruck
{
    public static int fillTheTruck(int num, int[] boxes, int unitSize, int[] unitsPerBox,  int truckSize) 
    {
        // WRITE YOUR BRILLIANT CODE HERE
        List<Holder> list = new ArrayList<>();
        int res = 0;
        for(int i = 0; i < boxes.length; ++i)
        {
            list.add(new Holder(boxes[i], unitsPerBox[i]));
        }
        Collections.sort(list);
        int i = 0;
        while(truckSize != 0)
        {
            Holder h = list.get(i);
            if(truckSize <= h.boxes)
            {
                res += h.unitPerBox * truckSize;
                truckSize = 0;
            }
            else
            {
                res += h.unitPerBox * h.boxes;
                truckSize -= h.boxes;
            }
            i++;
        }
        return res;
    }
}
class Holder implements Comparable<Holder>
{
    int unitPerBox; int boxes;
    Holder(int boxes, int unitPerBox){
        this.boxes = boxes;
        this.unitPerBox = unitPerBox;
    }
    public int compareTo(Holder o)
    {
        return -1 * Integer.compare(this.unitPerBox, o.unitPerBox);
    }
}
