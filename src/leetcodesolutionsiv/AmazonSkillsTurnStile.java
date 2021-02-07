
package leetcodesolutionsiv;
import java.util.*;

public class AmazonSkillsTurnStile
{
    public List<Integer> solve(int numOfCustomers, List<Integer> arrTime, List<Integer> directions)
    {
        List<CustomerTurnstile> customers = CustomerTurnstile.getList(arrTime, directions);
        List<CustomerTurnstile> enter = new LinkedList<>();
        List<CustomerTurnstile> exit = new LinkedList<>();
        for (int i = 0; i < customers.size(); i++)
        {
            CustomerTurnstile curr = customers.get(i);
            if(curr.direction == 0)
            {
                enter.add(curr);
            }
            else
            {
                exit.add(curr);
            }
        }
        Collections.sort(exit);
        Collections.sort(enter);
        int prevUsedtime = -1;
        int prevUsedas = 0;
        int global = -1;
        while(exit.size() != 0 && enter.size() != 0)
        {
            CustomerTurnstile enterCust = enter.get(0);
            CustomerTurnstile exitCust = exit.get(0);
            //update the global
            if(global < Math.min(enterCust.time, exitCust.time))
            {
                global = Math.min(enterCust.time, exitCust.time);
            }
            else
            {
                if(enterCust.time < exitCust.time)
                {
                    enterCust.time = global;
                }
                if(exitCust.time < global)
                {
                    exitCust.time = global;
                }
            }
            if(enterCust.time == exitCust.time)
            {
                if(prevUsedtime == -1 || global - prevUsedtime > 1)
                {
                    exitCust.useTime = global;
                    exitCust.useTime = global;
                    prevUsedas = 1;
                    prevUsedtime = exitCust.useTime;
                    exit.remove(0);
                    global++;
                }
                else if(global - prevUsedtime == 1 && prevUsedas == 0)
                {
                    enterCust.useTime = global;
                    enterCust.useTime = global;
                    prevUsedas = 0;
                    prevUsedtime = enterCust.useTime;
                    enter.remove(0);
                    global++;
                }
                else if(global - prevUsedtime == 1 && prevUsedas == 1)
                {
                    exitCust.useTime = global;
                    exitCust.useTime = global;
                    prevUsedas = 1;
                    prevUsedtime = exitCust.useTime;
                    exit.remove(0);
                    global++;
                }
            }
            else if(enterCust.time < exitCust.time)
            {
                enterCust.useTime = global;
                prevUsedtime = enterCust.useTime;
                prevUsedas = 0;
                enter.remove(0);
                global++;
            }
            else
            {
                exitCust.useTime = global;
                prevUsedas = 1;
                prevUsedtime = exitCust.useTime;
                exit.remove(0);
                global++;
            }
            
        }
        while(enter.size() != 0)
        {
            if(global < enter.get(0).time)
            {
                global = enter.get(0).time;
            }
            else if(global > enter.get(0).time)
            {
                enter.get(0).time = global;
            }
            CustomerTurnstile current = enter.get(0);
            current.useTime = global;
            enter.remove(0);
            global++;
        }
        while(exit.size() != 0)
        {
            if(global < exit.get(0).time)
            {
                global = exit.get(0).time;
            }
            else if(global > exit.get(0).time)
            {
                exit.get(0).time = global;
            }
            CustomerTurnstile current = exit.get(0);
            current.useTime = global;
            exit.remove(0);
            global++;
        }
        Collections.sort(customers, new Comparator<CustomerTurnstile>(){
            public int compare(CustomerTurnstile a, CustomerTurnstile b)
            {
                if(a.index < b.index)
                    return -1;
                else
                    return 1;
            }
        });
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < customers.size(); i++)
        {
            ls.add(customers.get(i).useTime);
        }
        return ls;
    }
    
}
class CustomerTurnstile implements Comparable<CustomerTurnstile>
{
    int index;
    int direction;
    int time;
    int useTime;
    
    //dir = 0 means enter
    //dir = 1 means exit
    private CustomerTurnstile(int index, int direction, int time)
    {
        this.index = index;
        this.time = time;
        this.direction = direction;
    }
    public static List<CustomerTurnstile> getList(List<Integer> arrTime, List<Integer> directions)
    {
        List<CustomerTurnstile> ls = new LinkedList<>();
        for(int i =0; i< arrTime.size(); ++i)
        {
            ls.add(new CustomerTurnstile(i, directions.get(i), arrTime.get(i)));
        }
        return ls;
    }

    @Override
    public int compareTo(CustomerTurnstile o)
    {
        if(this.time < o.time)
        {
            return -1;
        }
        else if(this.time == o.time)
        {
            Integer.compare(this.index, o.index);
        }
        return 1;
    }
}
