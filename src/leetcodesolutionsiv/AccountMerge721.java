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
public class AccountMerge721
{
    public List<List<String>> accountsMerge(List<List<String>> accounts) 
    {
        List<List<String>> result = new ArrayList<>();
        
        HashMap<String, List<HashSet>> map = new HashMap<>();
        
        for(List<String> currAcc : accounts)
        {
            
            String name = currAcc.get(0);
            if(!map.containsKey(name))
            {
                List<HashSet> ls = new ArrayList<>();
                HashSet<String> set = new HashSet<>();
                for (int i = 1; i < 10; i++)
                {
                    
                }
            }
            else
            {
                
            }
            
        }
                
        return result;
    }
}
