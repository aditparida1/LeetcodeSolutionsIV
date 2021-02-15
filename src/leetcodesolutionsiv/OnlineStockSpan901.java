
package leetcodesolutionsiv;
import java.util.*;
/**
 *
 * @author aditp
 */
public class OnlineStockSpan901
{
    ArrayList<Integer> prices = new ArrayList<>();
    ArrayList<Integer> span = new ArrayList<>();
    public OnlineStockSpan901() 
    {
        
    }
    
    public int next(int price) 
    {
        if(prices.size() == 0)
        {
            prices.add(price);
            span.add(1);
            return 1;
        }
        int prevPrice = prices.get(prices.size() - 1);
        int prevSpan = span.get(span.size() - 1);
        if(price >= prevPrice)
        {
            int toSearchFrom = prices.size() - 1 - prevSpan;
            while(toSearchFrom >= 0 && prices.get(toSearchFrom) <= price)
            {
                toSearchFrom--;
                prevSpan++;
            }
        }
        else
        {
            prices.add(price);
            span.add(1);
            return 1;
        }
        prices.add(price);
        span.add(prevSpan + 1);
        return prevSpan;
    }
}
