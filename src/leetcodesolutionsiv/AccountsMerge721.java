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
public class AccountsMerge721
{
    public List<List<String>> accountsMerge(List<List<String>> accounts) 
    {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        Map<String, String> nameMap = new HashMap<>();
        Set<String> visited = new HashSet<>();
        
        for(List<String> account : accounts)
        {
            String accName = account.get(0);
            for (int i = 1; i < account.size(); i++)
            {
                String currEmail = account.get(i);
                if(!map.containsKey(currEmail))
                {
                    map.put(currEmail, new ArrayList<>());
                    map.get(currEmail).add(account.get(1));
                }
                else
                {
                    map.get(currEmail).add(account.get(1));
                }
                if(!map.containsKey(account.get(1)))
                {
                    map.put(account.get(1), new ArrayList<>());
                    map.get(account.get(1)).add(currEmail);
                }
                else
                {
                    map.get(account.get(1)).add(currEmail);
                }
                nameMap.put(currEmail, accName);
            }
        }
        
        for(String key: map.keySet())
        {
            if(!visited.contains(key))
            {
                visited.add(key);
                Queue<String> q = new LinkedList<>();
                q.add(key);
                List<String> linkedEmails = new ArrayList<>();
                linkedEmails.add(key);
                
                while(!q.isEmpty())
                {
                    String curr = q.poll();
                    for(String neighbor: map.get(curr))
                    {
                        if(!visited.contains(neighbor))
                        {
                            visited.add(neighbor);
                            q.add(neighbor);
                            linkedEmails.add(neighbor);
                        }
                    }
                }
                Collections.sort(linkedEmails);
                linkedEmails.add(0, nameMap.get(linkedEmails.get(0)));
                result.add(linkedEmails);
            }
        }
        
        return result;
    }
}
