
package leetcodesolutionsiv;
import java.util.*;

public class isBipartite785
{
    public boolean isBipartite(int[][] graph) 
    {
        Set<Integer> blue = new HashSet<>();
        Set<Integer> green = new HashSet<>();
        
        Queue<Integer>  q = new LinkedList<>();
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < graph.length; i++)
        {
            seen.add(i);
        }
        for (int i = 0; i < graph.length; i++)
        {
            if(seen.contains(i))
            {
                q.add(i);
                boolean isBlue = false;
                blue.add(i);
                while(!q.isEmpty())
            {
                int curr = q.poll();
                isBlue = blue.contains(curr);

                for(int child: graph[curr])
                {
                    if(isBlue)
                    {
                        if(blue.contains(child))
                            return false;
                        else
                        {
                            if(!green.contains(child))
                            {
                                green.add(child);
                                q.add(child);
                                seen.remove(child);
                            }
                        }
                    }
                    else
                    {
                        if(green.contains(child))
                            return false;
                        else
                        {
                            if(!blue.contains(child))
                            {
                                blue.add(child);
                                q.add(child);
                                seen.remove(child);
                            }
                        }
                    }
                }

            }
                }
        }
        
        
        return true;        
    }
}
